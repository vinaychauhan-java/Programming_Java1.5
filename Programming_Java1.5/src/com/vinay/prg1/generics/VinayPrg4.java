package com.vinay.prg1.generics;

class Data<E>
{

	E dataValue;

	public Data(E dataValue)
	{
		this.dataValue = dataValue;
	}

	public E getData()
	{
		return this.dataValue;
	}
}

class AnothetData<E> extends Data<E>
{

	E dataValue;

	public AnothetData(E dataValue)
	{
		super(dataValue);
		this.dataValue = dataValue;
	}

	public E getData()
	{
		return this.dataValue;
	}
}

public class VinayPrg4
{

	public static void main(String args[])
	{
		AnothetData<String> aData = new AnothetData<String>("AnotherData");
		System.out.println(aData.getData());

		java.util.List<Data> list = new java.util.ArrayList<Data>();
		list.add(aData);

	}
}
