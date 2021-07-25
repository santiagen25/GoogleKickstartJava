import java.util.*;
import java.io.*;

public class Solution {
	public static void main(String args[]) {
		 Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		 int numCases = sc.nextInt();

		 for(int caseId = 1; caseId <= numCases; caseId++) {
		 	//Inputs
			int N = sc.nextInt();
			int K = sc.nextInt();
			sc.nextLine();
			String S = sc.nextLine();

			//Setup
			//goodness score de 0 significa que la string es cap i cua
			int operations = 0;
			int actualGood = 0;
			if (N > 1) {
				for(int i = 0; i < (N/2); i++) {
					char first = S.charAt(i);
					char second = S.charAt(N-(i+1));
					if (first != second) actualGood++;
				}
			}

			operations = K - actualGood;
			if(operations < 0) operations = -operations;
			
			
			//Print results
			p("Case #" + caseId + ": " + operations);
		 }
	}

	////////////////
	
	private static void p(String s) {
		System.out.println(s);
	}


}
