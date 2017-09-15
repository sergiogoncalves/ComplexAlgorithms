package Algoritmos;
/*
Decode a Map
	Question
	Implement a method that decodes a String to a corresponding Map. The String is composed of key-value pairs. Key is separated from value with an 'equals' character ('='). Pairs are separated with an 'ampersand' character ('&'). Example: key=value&key=value&....
	Empty keys and values are allowed, but the equals sign must be present (e.g. "=value", "key=").
		
		If the key is empty, empty String should be put to the map as key.
		If the value is empty, empty String should be put to the map as value.
		If the given String is empty, an empty Map should be returned.
		If the given String is null, null should be returned.
		If the given String has an invalid format, an IllegalArgumentException should be thrown.
		
	Your implementation must implement the MapDecoder interface.
	Sample Input: "one=1&two=2"
	should return a Map containing {"one": "1", "two": "2"}

*/

import java.util.HashMap;
import java.util.Map;
import com.google.common.base.Splitter;



public class DecodeMap {
	

	public static Map<String, String> decode(String s) {
		String[] tokens = s.split("&");

		Map<String, String> map = new HashMap<String, String>();

		for (int i = 0; i < tokens.length; i++) {
			
		
			String[] strings =  tokens[i].split("=");
			
			
			map.put(strings[0] == "" ? "" : strings[0],   strings[1] == "" ? "" : strings[1].replaceAll("%2C", ","));
		}

		return map;
	}
	
}