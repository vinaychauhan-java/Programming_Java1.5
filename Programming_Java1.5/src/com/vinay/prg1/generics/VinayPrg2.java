package com.vinay.prg1.generics;

import java.util.ArrayList;
import java.util.List;

// An Example for Unbounded Wildcard <?>

public class VinayPrg2
{

	// accept List of Objects only, not List of subclasses of Object
	public static void printList(List<Object> paramList)
	{
		for (Object object : paramList)
			System.out.println(object);
	}

	public static void printList1(List<?> paramList)
	{
		for (Object object : paramList)
			System.out.println(object);
	}

	public static void main(String[] args)
	{
		List<Object> objLst = new ArrayList<Object>();
		objLst.add(new Integer(101));
		objLst.add(new String("Hello World"));
		printList(objLst); // Matches
		// printList1(objLst); // Matches

		List<String> strLst = new ArrayList<String>();
		strLst.add("Vipin & Vinay");

		// printList(strLst); // Will not be allowed by the compiler
		printList1(strLst);
	}

}
