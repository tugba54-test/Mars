package com.review.self09;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String>phone=new LinkedHashMap<>();
		phone.put(123456789,"Jhon Smith");
		phone.put(987654320,"James London");
		phone.put(56789123,"Rohani Smith");
		phone.put(345678912,"Donald Trump");
		phone.put(1111111111,"Obama");
		phone.put(678954321,"Brad Pitt ");
		
		String name=phone.get(678954321);
		System.out.println(name+" is calling");
		
		String name2=phone.get(5555555);//exist number
		System.out.println(name2+" is calling");//give us null
		boolean contains =phone.containsKey(55555);
		System.out.println("55555 is in the map "+contains);
		
		
		boolean contains2=phone.containsValue("Obama");
		System.out.println("Obama is in my list "+contains2);
		
		phone.remove(345678912);
		System.out.println(phone);
		
		Set<Integer>p=phone.keySet();
		for(Integer a:p) {
			System.out.println("Key "+a+" value "+phone.get(a));
		}
		System.out.println("getting set with iterator");
		Iterator<Integer>it=p.iterator();
		while(it.hasNext()) {
			Integer key=it.next();
			System.out.println("Key "+key+" value "+phone.get(key));
		}
         
		Collection<String>values=phone.values();
		Iterator<String>v=values.iterator();
				while(v.hasNext()){
			System.out.println(v.next());
		}
				Collection<Integer>key=phone.keySet();
				for(Integer k:key) {
					System.out.println(k+" keys with collection enchanced loop");
				}
				System.out.println("---With set and for loop");
	Set<Entry<Integer,String>>ph=phone.entrySet();	
	for(Entry<Integer,String> e:ph) {
		System.out.println(e);
		
	}
				
	}

}
