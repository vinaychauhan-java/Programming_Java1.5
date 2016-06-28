package com.vinay.prg9.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;

public class VinayPrg1
{

	public static void main(String[] args)
	{
		HashMap<String, String> hMap = new HashMap<String, String>();
		hMap.put("MangoKey", "MangoValue");
		hMap.put("AppleKey", "AppleValue");
		hMap.put("PineAppleKey", "PineAppleValue");
		// hMap.put("MangoKey", "MangoValue"); // Will have one key as MangoKey, even if we add twice
		hMap.put(null, "PineAppleValue"); // Will store the key as null into HashMap

		System.out.println("************** For HashMap :: entrySet *****************");
		Iterator<Entry<String, String>> iterator1 = hMap.entrySet().iterator();
		while (iterator1.hasNext())
		{
			Entry<String, String> entry = iterator1.next();
			System.out.println(entry.getKey() + " :: " + entry.getValue());
		}

		System.out.println("************** For HashMap :: keySet *******************");
		Iterator<String> iterator2 = hMap.keySet().iterator();
		while (iterator2.hasNext())
		{
			String key = iterator2.next();
			System.out.println(key + " :: " + hMap.get(key));
		}

		System.out.println("************** For TreeMap *****************************");
		TreeMap<String, String> tMap = new TreeMap<String, String>();
		tMap.put("MangoKey", "MangoValue");
		tMap.put("AppleKey", "AppleValue");
		tMap.put("PineAppleKey", "PineAppleValue");
		Iterator<String> iterator3 = tMap.keySet().iterator();
		while (iterator3.hasNext())
		{
			String key = iterator3.next();
			System.out.println(key + " :: " + tMap.get(key));
		}
	}

}
