package Algoritmos.test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

import Algoritmos.DecodeMap;

public class DecodeMapTest {

	@Test
	public void shouldReturnOneTwo() {
		
	     Map<String, String> map = new HashMap<>();
	     
	     map.put("one", "1");
	     map.put("two", "2");
		
 	    assertThat(map, is(DecodeMap.decode("one=1&two=2")));
	}
	
	@Test
	public void shouldReturnNullValue() {
		
	     Map<String, String> map = new HashMap<>();
	     
	     map.put("one", "");
	     map.put("two", "2");
		
 	    assertThat(map, is(DecodeMap.decode("one=&two=2")));
	}

}
