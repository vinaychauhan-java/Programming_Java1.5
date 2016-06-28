package com.vinay.prg8.concurrence;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class VinayPrg1
{

	public static void main(String[] args)
	{
		// ConcurrentHashMap
		Map<String, String> myMap = new ConcurrentHashMap<String, String>();
		myMap.put("1", "1");
		myMap.put("2", "2");
		myMap.put("3", "3");
		myMap.put("4", "4");
		System.out.println("ConcurrentHashMap before iterator: " + myMap);
		Iterator<String> it = myMap.keySet().iterator();
		while (it.hasNext())
		{
			String key = it.next();
			if (key.equals("3"))
			{
				myMap.put(key + "-New", "NewValue");
				// myMap.remove(key);
			}
		}
		System.out.println("ConcurrentHashMap after iterator: " + myMap);

		// HashMap
		myMap = new HashMap<String, String>();
		myMap.put("1", "1");
		myMap.put("2", "2");
		myMap.put("3", "3");
		myMap.put("4", "4");
		System.out.println("HashMap before iterator: " + myMap);
		Iterator<String> it1 = myMap.keySet().iterator();
		while (it1.hasNext())
		{
			String key = it1.next();
			if (key.equals("3"))
			{
				myMap.put(key + "-New", "-New3"); // Will Throw : java.util.ConcurrentModificationException
				// myMap.put(key, "NewValue"); // Will Work fine as structure is not modified.

				// It means that the new entry got inserted in the HashMap but Iterator is failing. Actually Iterator on
				// Collection objects are fail-fast i.e any modification in the structure or the number of entry in the
				// collection object will trigger this exception thrown by iterator.
			}

		}
		System.out.println("HashMap after iterator: " + myMap);
	}

}
