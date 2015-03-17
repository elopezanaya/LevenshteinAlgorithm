package com.kata;

public class Levenshtein {

	public int calculateDistance(String stringToCompare, String stringToReach) {

		if (stringToCompare != null && stringToReach != null) {

			char[] stringN = stringToCompare.toCharArray();
			char[] stringM = stringToReach.toCharArray();

	
			int counter = 0;
			char letter;
			for (int i=0; i < stringM.length;i ++) {

				try {

					letter = stringN[i];
					
					if (letter != stringM[i]) {

						counter++;

					}


				} catch (Exception e) {

					
					e.printStackTrace();
					counter++;

				}

			}
			
			return counter;

		}

		return 0;
	}

}
