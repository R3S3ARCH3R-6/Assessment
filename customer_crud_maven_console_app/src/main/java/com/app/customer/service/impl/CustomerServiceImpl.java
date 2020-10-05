package com.app.customer.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.app.customer.dao.CustomerDAO;
import com.app.customer.dao.impl.CustomerDAOImpl;
import com.app.customer.dbutil.MySqlConnection;
import com.app.customer.exception.BusinessException;
import com.app.customer.model.Customer;
import com.app.customer.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {

	private CustomerDAO dao=new CustomerDAOImpl();
	@Override
	public int addCustomer(Customer customer) throws BusinessException {
		int c=0;
		if(!isValidName(customer.getName())) {
			throw new BusinessException("Entered name "+customer.getName()+" is Invalid");
		}else if(!isValidContact(customer.getContact())) {
			throw new BusinessException("Entered contact = "+customer.getContact()+" is Invalid");
		}else if(!isValidGender(customer.getGender())) {
			throw new BusinessException("Entered gender = "+customer.getGender()+" is Invalid");
		}else if(!isValidAge(customer.getAge())) {
			throw new BusinessException("Entered Age = "+customer.getAge()+" is Invalid.. Only Age is valid between 19-44");
		}else {
			//code here for DAO
			c=dao.addCustomer(customer);
		}
		return c;
	}
	
	private boolean isValidName(String name) {
		boolean b=false;
		if(name.matches("[ a-z A-Z]{5,12}")) {
			b=true;
		}
		return b;
	}
	
	private boolean isValidAge(int age) {
		boolean b=false;
		if(age>18 && age<45) {
			b=true;
		}
		return b;
	}
	
	private boolean isValidGender(String gender) {
		boolean b=false;
		if(gender.matches("[mMfFoO]{1}")) {
			b=true;
		}
		return b;
	}
	
	private boolean isValidContact(long contact) {
		boolean b=false;
		if((contact+"").matches("[0-9]{10}")) {
			b=true;
		}
		return b;
	}
	
	//The following 2 methods (isValidCity and isValidID) were made by Wesley Johnson
		//I made them and based them off similar methods shown previously
	private boolean isValidCity(String city){
		boolean b = false;
		if(city.matches("[A-Z a-z]{6, 20}")){
			b= true;
		}
		return b;
	}
	
	private boolean isValidId(int id){
		boolean b = false;
		if((id+"").matches("[0-9]{1, 5}")){
			b = true;
		}
		return b;
	}

	@Override
	public int updateCustomer(int id, long contact) throws BusinessException {
		int c = 0;
		
		try(Connection connection = MySqlConnection.getConnection()){
			String sql = "update player set contact=? where id=?";	//update query
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setLong(1, contact);
			preparedStatement.setInt(2, id);
			c=preparedStatement.executeUpdate();

		}catch(ClassNotFoundException | SQLException e){
			System.out.println(e);
		}
		
		return c;
	}

	@Override
	public int deleteCustomer(int id) throws BusinessException {
		int del = 0;
		try(Connection connection = MySqlConnection.getConnection()){
			String sql = "delete from player where id=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setInt(1, id);
			del = preparedStatement.executeUpdate();
			
			
		}catch(ClassNotFoundException | SQLException e){
			System.out.println(e);
		}
		return del;
	}

	@Override
	public List<Customer> getAllCustomers() throws BusinessException {
		List<Customer> customersList=null;
		customersList=dao.getAllCustomers();
		return customersList;
	}

	@Override
	public Customer getCustomerById(int id) throws BusinessException {
		Customer customer = null;
		//this is code based off the previous methods
		if(isValidId(id)){
			customer = dao.getCustomerById(id);
		}else{
			throw new BusinessException("Entered ID " + id + " is Invalid ...");
		}
		return customer;
	}

	@Override
	public Customer getCustomerByContact(long contact) throws BusinessException {
		Customer customer=null;
		if(isValidContact(contact)) {
			customer=dao.getCustomerByContact(contact);
		}else {
			throw new BusinessException("Entered contact - "+contact+" is INVALID");
		}
		return customer;
	}

	@Override
	public List<Customer> getCustomersByAge(int age) throws BusinessException {
		List<Customer> customersList = null;
		if(!isValidAge(age)){
			throw new BusinessException("Entered age " + age + " is Invalid ...");
		}else{
			customersList = dao.getCustomersByAge(age);
		}
		
		return customersList;
	}

	//this is done by me, Wesley
	@Override
	public List<Customer> getCustomersByName(String name) throws BusinessException {
		List<Customer> customersList = null;
		if(!isValidName(name)){
			throw new BusinessException("Entered name " + name + " is Invalid ...");
		}else{
			customersList = dao.getCustomersByName(name);
		}
		
		return customersList;
	}

	@Override
	public List<Customer> getCustomersByCity(String city) throws BusinessException {
		List<Customer> customersList = null;
		//the following code is based off previous methods
		if(!isValidCity(city)){
			throw new BusinessException("Entered name " + city + " is Invalid ...");
		}else{
			customersList = dao.getCustomersByCity(city);
		}
		
		return customersList;
	}

	@Override
	public List<Customer> getCustomersByGender(String gender) throws BusinessException {
		List<Customer> customersList=null;
		if(!isValidGender(gender)) {
			throw new BusinessException("Entered gender "+gender+" is INVALID....");
		}else {
		customersList=dao.getCustomersByGender(gender);
		}
		return customersList;
	}

}
