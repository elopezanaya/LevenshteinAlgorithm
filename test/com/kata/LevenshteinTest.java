package com.kata;

import static org.junit.Assert.*;

import org.junit.Test;

public class LevenshteinTest {

	
	Levenshtein levenshtein= new Levenshtein();
	@Test
	public void test() {
		
	String stringToCompare = "";
	String stringToReach="";
		
	assertEquals(0, levenshtein.calculateDistance(stringToCompare, stringToReach));
	
	}
	
	
	@Test
	public void testPositive() {
		
	String stringToCompare = "gumbo";
	String stringToReach="gambo";
		
	assertEquals(1, levenshtein.calculateDistance(stringToCompare, stringToReach));
	
	}
	
	@Test
	public void testPositive2() {
		 
	String stringToCompare = "gumbo";
	String stringToReach="gambol";
		
	assertEquals(2, levenshtein.calculateDistance(stringToCompare, stringToReach));
	
	}
	
	@Test
	public void testPositive3() {
		
	String stringToCompare = 	"internal";
	String stringToReach=		"externalizacion";
		
	assertEquals(9, levenshtein.calculateDistance(stringToCompare, stringToReach));
	
	}
	
	
	@Test
	public void testPositive4() {
		
	String stringToCompare = 	"record";
	String stringToReach=		"acord";
		
	assertEquals(9, levenshtein.calculateDistance(stringToCompare, stringToReach));
	
	}
}
