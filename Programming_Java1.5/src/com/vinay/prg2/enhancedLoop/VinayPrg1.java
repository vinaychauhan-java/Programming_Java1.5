package com.vinay.prg2.enhancedLoop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparator<Student>
{

	int rollNo;
	String name;

	public Student(){
		
	}
	
	public Student(int rollNo, String name)
	{
		this.rollNo = rollNo;
		this.name = name;
	}

	public int getRollNo()
	{
		return rollNo;
	}

	public void setRollNo(int rollNo)
	{
		this.rollNo = rollNo;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	@Override
	public int compare(Student object1, Student object2)
	{
		return -(object1.getRollNo() - object2.getRollNo());
	}

}

public class VinayPrg1
{

	public static void main(String[] args)
	{

		List<String> list1 = new ArrayList<String>();
		list1.add("Apple");
		list1.add("Mango");
		for (String value : list1)
		{ // using enhanced for loop
			System.out.print(value + ", ");
		}

		System.out.println("\n******************************");

		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(new Integer(100));
		list2.add(new Integer(200));
		for (Integer value : list2)
		{ // using enhanced for loop
			System.out.print(value + ", ");
		}
		for (int value : list2)
		{ // using enhanced for loop
			System.out.print(value + ", ");
		}

		System.out.println("\n******************************");

		List<Student> list3 = new ArrayList<Student>();
		list3.add(new Student(1, "Ram"));
		list3.add(new Student(2, "Vipin"));
		Collections.sort(list3, new Student());
		for (Student value : list3)
		{ // using enhanced for loop
			System.out.println(value.getRollNo() + " : " + value.getName());
		}

		System.out.println("\n******************************");

		int arr[] =
		{1, 2, 3, 4, 5};
		for (int a : arr)
		{
			System.out.print(" " + a);
		}

		System.out.println("\n******************************");
		int arr1[][] =
		{
		{99, 88},
		{77, 66}};
		for (int[] arr2 : arr1)
		{
			for (int a : arr2)
			{
				System.out.print(" " + a);
			}
		}
	}
}
