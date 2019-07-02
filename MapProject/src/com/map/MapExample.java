package com.map;

/*
 * MSFATA Programming Help
 */
import java.util.HashMap;

public class MapExample {

	public static void main(String[] args) {
		/*
		 * creating a hashed map
		 */
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		/*
		 * adding values to map
		 */
		map.put(1, "Shafiq");
		map.put(0, "Mohammed");
		map.put(2, "Fata");
		/*
		 * reading hash map values and keys
		 */
		map.forEach((key, value) -> System.out.println(key + " : " + value));

	}

}
