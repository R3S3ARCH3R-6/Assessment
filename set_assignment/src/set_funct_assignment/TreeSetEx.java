package set_funct_assignment;

import java.util.HashSet;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		
		Set<String> hs = new HashSet<>();
		hs.add("heyy");
		hs.add("java");
		hs.add("jee");
		hs.add("jme");
		hs.add("sql");
		hs.add("hibernate");
		hs.add(null);
		hs.add(null);
		hs.add("java");
		hs.add("jee");
		hs.add("mysql");
		System.out.println("HashSet hs: " + hs);
		
		//adding in a new HashSet
		Set<String> altHS = new HashSet<>();
		altHS.add("late");
		altHS.add("work");
		altHS.add("mysql");
		altHS.add("java");
		System.out.println("HashSet altHS = " + altHS);
		
		Set<String> hs2 = new HashSet<>();
		hs2.add("jee");
		hs2.add("hello");
		hs2.add("mysql");
		hs2.add("java");
		System.out.println("HashSet hs2 = " + hs2);
		
		//addAll funct
		hs.addAll(altHS);
		System.out.println("hs after 'addAll(altHS)': " + hs);
	
		//retainAll in a HashSet - retains values only found in altHS 
		hs.retainAll(altHS);
		System.out.println("hs after 'retainAll(altHS)': " + hs);	
		
		//removeAll in a HashSet
		hs.removeAll(hs2);
		System.out.println("hs after 'removeAll(hs2)': " + hs);
		System.out.println();
		
		
		//linked hash set
		Set<String> lhs = new LinkedHashSet<>();
		lhs.add("heyy");
		lhs.add("java");
		lhs.add("jee");
		lhs.add("jme");
		lhs.add("sql");
		lhs.add("hibernate");
		lhs.add(null);
		lhs.add(null);
		lhs.add("java");
		lhs.add("jee");
		lhs.add("mysql");
		System.out.println("LinkedHashSet lhs: " + lhs);
		
		//adding in a new LinkedHashSet
		Set<String> lhs2 = new LinkedHashSet<>();
		lhs2.add("late");
		lhs2.add("work");
		lhs2.add("mysql");
		lhs2.add("java");
		System.out.println("LinkedHashSet lhs2 = " + lhs2);
		
		Set<String> lhs3 = new LinkedHashSet<>();
		lhs3.add("jee");
		lhs3.add("hello");
		lhs3.add("mysql");
		lhs3.add("java");
		System.out.println("LinkedHashSet lhs3 = " + lhs3);
		
		//addAll funct
		lhs.addAll(lhs2);
		System.out.println("lhs after 'addAll(lhs2)': " + lhs);
	
		//retainAll in a LinkedHashSet - retains values only found in altHS 
		lhs.retainAll(lhs2);
		System.out.println("lhs after 'retainAll(lhs2)': " + lhs);	
		
		//removeAll in a LinkedHashSet
		hs.removeAll(lhs3);
		System.out.println("lhs after 'removeAll(lhs3)': " + lhs);
		System.out.println();
		
		
		//TreeSet
		Set<String> ts = new TreeSet<>();
		ts.add("heyy");
		ts.add("java");
		ts.add("jee");
		ts.add("jme");
		ts.add("sql");
		ts.add("hibernate");
		ts.add("java");
		ts.add("jee");
		ts.add("mysql");
		System.out.println("TreeSet ts: " + ts);
		ts.add("hibernate");
		System.out.println("TreeSet ts: " + ts);
		
		//adding in a new TreeSet
		Set<String> ts2 = new TreeSet<>();
		ts2.add("late");
		ts2.add("work");
		ts2.add("mysql");
		ts2.add("java");
		System.out.println("TreeSet ts2 = " + ts2);
		
		Set<String> ts3 = new TreeSet<>();
		ts3.add("jee");
		ts3.add("hello");
		ts3.add("mysql");
		ts3.add("java");
		System.out.println("TreeSet ts3 = " + ts3);
		
		//addAll funct
		ts.addAll(ts2);
		System.out.println("ts after 'addAll(ts2)': " + ts);
	
		//retainAll in a TreeSet 
		ts.retainAll(ts2);
		System.out.println("ts after 'retainAll(ts2)': " + ts);	
		
		//removeAll in a TreeSet
		ts.removeAll(ts3);
		System.out.println("ts after 'removeAll(ts3)': " + ts);
		System.out.println();

	}

}
