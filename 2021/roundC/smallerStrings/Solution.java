import java.util.*;
import java.io.*;

public class Solution {
	public static void main(String args[]) {
		 Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		 int numCases = sc.nextInt();

		 for(int caseId = 1; caseId <= numCases; caseId++) {
		 	//Inputs
			int N = sc.nextInt(), K = sc.nextInt();
			sc.nextLine();
			String S = sc.nextLine();


			//Setup
			
			//limiteJ redondea para arriba, hacia el numero par (de 3 a 4, de 4 a 4, de 5 a 6, ...)
			int Nexp = (N + (N % 2));
			//K^(Nexp/2) son todas las repeticiones posibles que existen

			int palindromes = 1;
			for (int i = 0; i < N/2; i++) {
				char first = S.charAt(i);
				char last = S.charAt(S.length() - 1 - i);

				char leastChar = 'a';

				if (first < last) leastChar = first;
				else leastChar = last;

				int leastNum = (Character.getNumericValue(leastChar) - 9);
				//p("least num is "+leastNum);
				palindromes = palindromes * leastNum;
			}

			palindromes--;


			//answer
			p("Case #" + caseId + ": " + palindromes);
		 }
	}

	////////////////
	
	private static void p(String s) {
		System.out.println(s);
	}


}
