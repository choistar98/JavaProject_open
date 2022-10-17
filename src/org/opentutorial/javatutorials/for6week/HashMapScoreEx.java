package org.opentutorial.javatutorials.for6week;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapScoreEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> scoreMap =
				new HashMap<String, Integer>();
		scoreMap.put("김성동",97);
		scoreMap.put("황기태",97);
		scoreMap.put("김남윤",97);
		scoreMap.put("이재문",97);
		scoreMap.put("한원선",97);
		
		System.out.println("HashMap의 요소 개수:"+scoreMap.size());
		
		Set<String> keys = scoreMap.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String name = it.next();
			int score = scoreMap.get(name);
			System.out.println(name + ":"+ score);
		}

	}

}
