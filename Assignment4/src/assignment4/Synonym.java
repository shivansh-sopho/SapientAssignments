package assignment4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Synonym {
	
	private static Map<String , Set<String> > synmap;
	
	public Synonym() {
		synmap = new HashMap<>();
	}
	
	public void add(String s , Set<String> syns) {
		synmap.put(s, syns);
	}
	
	public void show(String s) {
		Set<String> syns = synmap.get(s);
		
		Iterator<String> i = syns.iterator(); 
        while (i.hasNext()) 
            System.out.println(i.next());
	}
	
	public boolean check(String s) {
		if(synmap.containsKey(s)) {
			return true;
		}
		else {
			return false;
		}
	}

}
