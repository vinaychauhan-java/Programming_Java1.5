package com.vinay.prg1.generics;

class GenericBox<E>
{

	// Private variable
	private E content;

	// Constructor
	public GenericBox(E content)
	{
		this.content = content;
	}

	public E getContent()
	{
		return content;
	}

	public void setContent(E content)
	{
		this.content = content;
	}

	public String toString()
	{
		return content + " (" + content.getClass() + ")";
	}
}

public class HowGenericWorks
{

	public static void main(String[] args)
	{
		GenericBox<String> gb1 = new GenericBox<String>("Hai Bro - 1 ");
		System.out.println(gb1);
		
		// Waarning :: GenericBox is a raw type. References to generic type GenericBox<E> should be parameterized
		GenericBox gb2 = new GenericBox<String>("Hai Bro - 2 ");
		System.out.println(gb2);
		
		// Warning :: Multiple markers at this line
		// - Type safety: The constructor GenericBox(Object) belongs to the raw type GenericBox. References to generic
		// type GenericBox<E> should be parameterized
		// - Type safety: The expression of type GenericBox needs unchecked conversion to conform to GenericBox<String>
		// - GenericBox is a raw type. References to generic type GenericBox<E> should be parameterized
		GenericBox<String> gb3 = new GenericBox("Hai Bro - 3 ");
		System.out.println(gb3);
		
		GenericBox<Integer> gb4 = new GenericBox<Integer>(1001);
		System.out.println(gb4);

	}

}
