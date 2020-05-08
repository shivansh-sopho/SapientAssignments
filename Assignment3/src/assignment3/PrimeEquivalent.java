package assignment3;

import java.util.Scanner;

public class PrimeEquivalent {

	public static void main(String[] args) {
		
		
		int[] primeNos = {1, 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
		String[][] mapArray = new String[26][2];
		int a = 65;
		int j = 0;
		for (int i = 0 ; i < 26 ; i++) {
			mapArray[i][0] = Character.toString((char) a );
			a++;
			mapArray[i][1] = Integer.toString(primeNos[j++]);
		}
		
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		
		int l = s.length();
		
		for (int i = 0 ; i < l ; i++) {
			int k = 0;
			for(; k < 26 ; k++) {
				if(Character.toString(s.charAt(i)).equals(mapArray[k][0])) {
					break;
				}
				
			}
			System.out.print(Integer.toHexString((Integer.parseInt(mapArray[k][1]))).toUpperCase());
			if(i == (l-1)) {
				System.out.print(".");
			}
			else {
				System.out.print(",");
			}
		}
		
			
	}

}
