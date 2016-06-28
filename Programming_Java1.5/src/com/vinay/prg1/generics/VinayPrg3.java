package com.vinay.prg1.generics;

// An Example for Bounded Wildcard <?>

public class VinayPrg3
{

	public static <T extends String> void printValue(T value)
	{
		System.out.println("Value :: " + value);
	}

	// public static <T extends Number> double add(T first, T second)
	// {
	// return first.doubleValue() + second.doubleValue();
	// }

	public static <M extends Number, N extends Number> double add(M first, N second)
	{
		return first.doubleValue() + second.doubleValue();
	}

	public static void main(String[] args)
	{
		System.out.println(add(55, 66)); // int -> Integer
		System.out.println(add(5.5f, 6.6f)); // float -> Float
		System.out.println(add(5.5, 6.6)); // double -> Double

		printValue("Hello Bhai :-)");
		// printValue(101); // Will not be allowed by the compiler

	}
}
