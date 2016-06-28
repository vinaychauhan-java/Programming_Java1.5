package com.vinay.prg1.generics;

import java.util.ArrayList;
import java.util.List;

public class VinayPrg1
{

	// Generics : Generics provide compile-time type safty check. It communicates with the compiler for the type of
	// collection

	public static void main(String[] args)
	{
		List list = new ArrayList();
		list.add("Apple");
		list.add("Mango");
		list.add(new Integer(10));
		System.out.println(list);

		List<String> list1 = new ArrayList<String>();
		list1.add("Apple");
		list1.add("Mango");
		// list1.add(new Integer(10)); // Will not be allowed by the compiler
		System.out.println(list1);

		List<Object> list2 = new ArrayList<Object>();
		list2.add(new Object());
		list2.add(new Object());
		list2.add("Apple");

		List<String> list3 = new ArrayList<String>();
		list3.add("Ram1");
		list3.add("Ram2");
		// list3.add(new Object()); // Will not be allowed by the compiler

		list2.add(list3);

		System.out.println(list2);
	}

}
