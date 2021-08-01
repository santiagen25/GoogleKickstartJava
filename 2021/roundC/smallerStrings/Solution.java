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
			//K^(Nexp/2) son todas las repeticiones posibles que existen

			int interations = (N/2) + (N%2);
			int ans = 0;
			boolean isPalindrome = true;
			for (int i = 0; i < interations; i++) {
				char first = S.charAt(i);
				char last = S.charAt(S.length() - 1 - i);

				char leastChar = 'a';

				if (isPalindrome && first != last) {
					isPalindrome = false;
					ans++;
				}
				if (first < last) leastChar = first;
				else leastChar = last;
				int numericValOfChar = (int) leastChar - 97;
				
				//Aqui empieza la operacion importante
				//K^((N/2)+(N%2)-i) * numericValOfChar
				int exp = interations - i -1;

				int power = (int) Math.pow(K, exp);
				ans += (power * numericValOfChar);
			}

			//answer
			p("Case #" + caseId + ": " + ans);
		 }
	}

	////////////////
	
	private static void p(String s) {
		System.out.println(s);
	}


}
