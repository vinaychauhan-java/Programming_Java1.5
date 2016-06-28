package com.vinay.prg4.varArgs;

public class VinayPrg1
{

	public static void main(String[] args)
	{
		showData("A", "B", "C", "D");
		System.out.println("\n******************************");
		showData(new Integer(100), new Integer(200), new Integer(300));
		System.out.println("\n******************************");
		showData("Vipin", new Integer(100), new Integer(200), new Integer(300));
	}

	private static void showData(String... data)
	{
		for (String values : data)
		{
			System.out.print(values + " ");
		}
	}

	private static void showData(Integer... data)
	{
		for (Integer values : data)
		{
			System.out.print(values + " ");
		}
	}

	// In this scenario, Varargs must be the last argument
	private static void showData(String name, Integer... data)
	{
		System.out.println("Name is " + name);
		for (Integer values : data)
		{
			System.out.print(values + " ");
		}
	}

}
