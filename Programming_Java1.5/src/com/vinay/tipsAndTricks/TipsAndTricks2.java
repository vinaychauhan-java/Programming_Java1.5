package com.vinay.tipsAndTricks;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

class Person
{

	int id;
	int age;

	public Person(int id, int age)
	{
		super();
		this.id = id;
		this.age = age;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + id;
		return result;

		// return 1;
		// If every object returns the same hashCode as 1 then map size will not increase as it is
		// returning the same value. Therefore, hashCode should be unique for each and every object
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person)obj;
		if (age != other.age)
			return false;
		if (id != other.id)
			return false;
		return true;
	}
}

public class TipsAndTricks2
{

	public static void main(String[] args)
	{
		Map<Person, String> map = new HashMap<Person, String>();
		Person P1 = new Person(1, 21);
		map.put(P1, "Person-1");
		map.put(P1, "Person-2");
		System.out.println(map.size() + " :: " + map);; // Size Will Be 1

		P1.setAge(22);
		map.put(P1, "Person-3");
		System.out.println(map.size() + " :: " + map); // Size Will Be 2

	}
}
