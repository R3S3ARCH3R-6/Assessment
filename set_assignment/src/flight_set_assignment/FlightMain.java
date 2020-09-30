package flight_set_assignment;

import java.util.HashSet;
import java.util.Set;
import java.util.LinkedHashSet;

public class FlightMain {

	public static void main(String[] args) {
		Set <Flight> flightList = new HashSet<>();
		flightList.add(new Flight(1320, "Air Hong Kong", 322.76, 3.3f));
		flightList.add(new Flight(5406, "Air Tokyo", 125.29, 3.9f));
		flightList.add(new Flight(7189, "Paris Airways", 246.98, 4.1f));
		flightList.add(new Flight(81009, "Beijiing Airlines", 327.31, 2.4f));
		flightList.add(new Flight(6413, "Seattle Airways", 428.76, 3.1f));
		flightList.add(new Flight(5406, "Air Tokyo", 125.29, 3.9f));
		flightList.add(new Flight(5406, "Air Saigon", 263.89, 3.2f));
		flightList.add(new Flight(6413, "Air Winnepeg", 188.46, 3.3f));
		
		System.out.println("Printing all flights:");
		printFlights(flightList);
		
		
	}

	
	
	public static void printFlights(Set<Flight> flightList){
		for(Flight f: flightList){
			System.out.println(f);
		}
	}
}
