package com.vinay.tipsAndTricks;

public class TipsAndTricks1
{

	public static void main(String[] args)
	{

		double aa = 1.10;
		System.out.println("Value is " + aa);
		System.out.println("****************************");

		String a = "Hi";
		String b = "Bi";
		String c = a + b;
		String d = "HiBi";
		System.out.println(c);
		System.out.println(c == d);
		System.out.println("****************************");

		String value = "Experience";
		System.out.println("value.indexOf : " + value.indexOf("e"));
		System.out.println("value.toCharArray() : " + value.toCharArray());
		for (char aaa : value.toCharArray())
		{
			System.out.print(" " + aaa);
		}
		System.out.println();
		for (int aaa : value.toCharArray())
		{
			System.out.print(" " + aaa);
		}
		System.out.println();
		String abc[] =
		{"aa", "bb", "cc", "dd"};
		for (String aaa : abc)
		{
			System.out.print(" " + aaa);
		}

		System.out.println("\n****************************");
		String sHW = "HelloWorld";
		StringBuffer sbHW = new StringBuffer("HelloWorld");
		System.out.print(sHW.equals(sbHW));
		System.out.print(" : " + sHW.equals(sbHW.toString()));
		System.out.print(" : " + sHW.contentEquals(sbHW));
		System.out.println("Reversing the Contents :: "+sbHW.reverse());

	}

}
