package com.vinay.prg7.inputOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyInputOutputExample1 {

	public static void main(String[] args) {

		Scanner integerValue = new Scanner(System.in);
		System.out.println("Please enter any number : ");
		int i = integerValue.nextInt();
		System.out.println(i);
		System.out.println("\n***********************************");

		Scanner in2;
		try {
			in2 = new Scanner(new File("d:\\VipinBro.txt"));
			while (in2.hasNextDouble()) {
				double doubleValue = in2.nextDouble();
				System.out.println(doubleValue);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		System.out.println("\n***********************************");

		Scanner in3 = new Scanner("This is the input text String");
		while (in3.hasNext()) {
			String stringValue = in3.next();
			System.out.print(stringValue + "-");
		}
		System.out.println("\n\n\n***********************************");
		

	}

}
