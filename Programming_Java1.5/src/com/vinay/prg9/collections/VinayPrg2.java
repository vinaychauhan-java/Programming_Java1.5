package com.vinay.prg9.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class VinayPrg2
{

	public static void main(String[] args)
	{

		Set<String> hSet = new HashSet<String>();
		hSet.add("Mango");
		hSet.add("Apple");
		hSet.add("PineApple");
		hSet.add("Mango");
		// hSet.add(null); // Will store the key as null into HashSet
		System.out.println("************** For HashSet *****************");
		Iterator<String> iterator1 = hSet.iterator();
		while (iterator1.hasNext())
		{
			Object value = iterator1.next();
			System.out.println(value);
		}

		Set<String> tSet = new TreeSet<String>();
		hSet.add(null);
		tSet.add("Mango");
		tSet.add("Apple");
		tSet.add("PineApple");
		// hSet.add(null);
		System.out.println("************** For TreeSet *****************");
		Iterator<String> iterator2 = tSet.iterator();
		while (iterator2.hasNext())
		{
			Object value = iterator2.next();
			System.out.println(value);
		}
		System.out.println("****** For TreeSet using forEach loop ******");
		for (String value : tSet)
		{
			System.out.println(value);
		}

	}

}
