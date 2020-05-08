package assignment4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class SynonymRunner {
	
	public static void main(String[] args) {
		
		Synonym synonym = new Synonym();
		
		Set<String> s1 = new HashSet<>();
		Set<String> s2 = new HashSet<>();
		
		s1.add("GoodMorning");
		s1.add("Shubhodaya");
		s1.add("Shubhohday");
		s1.add("Bonjour");
		
		s2.add("GoodEvening");
		s2.add("Shubhasange");
		s2.add("susandhya");
		s2.add("Bonsoir");
		
		synonym.add("GoodMorning", s1);
		synonym.add("GoodEvening", s2);
		
		Scanner input = new Scanner(System.in); 
		
		String s = input.nextLine();
		
		if(synonym.check(s)) {
			synonym.show(s);
		}
		else {
			System.out.println("Do you want to add it ?");
			String response = input.nextLine();
			
			if(response.equals("Y")) {
				Set<String> newSyns = new HashSet<>();
				
				while(true) {
					String userinput = input.nextLine();
					if(userinput.isEmpty()) {
						break;
					}
					else {
						newSyns.add(userinput);
					}
				}
				synonym.add(s, newSyns);
				
				synonym.show(s);
			}
		}
		
	}

}
