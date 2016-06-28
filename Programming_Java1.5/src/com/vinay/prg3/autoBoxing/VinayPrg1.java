package com.vinay.prg3.autoBoxing;

import java.util.ArrayList;
import java.util.List;

public class VinayPrg1 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		int value = 5;
		list.add(value);

		for (Integer ob : list) {
			int value1 = ob;
			System.out.println(value1);
		}
	}
}
