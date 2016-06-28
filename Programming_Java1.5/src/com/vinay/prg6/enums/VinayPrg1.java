package com.vinay.prg6.enums;

import java.util.HashMap;

enum EnumExample {
	SQUARE {
		int get(int x) {
			return x * x;
		}
	},
	CUBE {
		int get(int x) {
			return x * x * x;
		}
	};

	abstract int get(int x);
};

enum WeatherExample {
	Summer(1), Winter(2), Spring(3);
	private int id;

	private WeatherExample(int id) {
		this.id = id;
	}

	public int getId() {
		return this.id;
	}
	
	private static HashMap<Integer, WeatherExample> lookup;
	static
	{
		lookup = new HashMap<Integer, WeatherExample>();

		for (WeatherExample code : WeatherExample.values())
		{
			lookup.put(code.getId(), code);
		}
	}

	public static WeatherExample getWeaterString(int id)
	{
		return lookup.get(Integer.valueOf(id));
	}
}

enum Books{
	TechnicalBooks { String getMessage() { return "Technical Books"; } },
	CookingBooks { String getMessage() { return "Cooking Books"; } };
	abstract String getMessage();	
}

interface TechnicalBooks {
	// String getMessage();
	abstract String getMessage();
}
enum JavaBooks implements TechnicalBooks{
	JavaBook1 { public String getMessage() { return "JavaBook1 Contents"; } }, 
	JavaBook2 { public String getMessage() { return "JavaBook2 Contents"; } },
	JavaBook3 { public String getMessage() { return "JavaBook3 Contents"; } };
	@Override
	public String getMessage() {
		return "From Java Books";
	}
}

public class VinayPrg1 {

	// Enums are the replacement of constant. Enums are more flexible and every
	// enum constant's behavior can be defined in different way
	public static void main(String[] args) {

		System.out.println(EnumExample.SQUARE.get(2));
		System.out.println(EnumExample.CUBE.get(2));
		System.out.println("****************************");
		System.out.println(WeatherExample.Spring);
		System.out.println(WeatherExample.Spring.getId());
		System.out.println(WeatherExample.getWeaterString(1));
		System.out.println("****************************");
		System.out.println(Books.TechnicalBooks.getMessage());
		System.out.println(JavaBooks.JavaBook1);
		System.out.println(JavaBooks.JavaBook2.getMessage());
	}

}
