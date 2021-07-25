import java.util.*;
import java.io.*;

public class Solution {
	public static void main(String args[]) {
		 Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		 int numCases = sc.nextInt();

		 for(int caseId = 1; caseId <= numCases; caseId++) {
		 	//Inputs
			int N = sc.nextInt();
			sc.nextLine();
			String S = sc.nextLine();

			//Setup
			//p("N = " + N + "\tS = " + S);

			int[] result = new int[N];
			int actual = 1;

			result[0] = 1;
			for (int i = 1; i < N; i++) {
				char first = S.charAt(i-1);
				char second = S.charAt(i);
				if(first < second) {
					result[i] = ++actual;
				} else {
					result[i] = 1;
					actual = 1;
				}
			}
			
			
			//Print results
			String[] res = Arrays.toString(result).split("[\\[\\]]")[1].split(", "); 
			p("Case #" + caseId + ": " + String.join(" ", res));
		 }
	}

	////////////////
	
	private static void p(String s) {
		System.out.println(s);
	}


}
