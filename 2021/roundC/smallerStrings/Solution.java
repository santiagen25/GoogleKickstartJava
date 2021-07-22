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

			p("N = "+N+"\nK = "+K+"\nS = "+S);

			//Setup
			String ans = "";
			int greatestValue = 0;
			String[] result = new String[N];

			for(int i = 0; i < N; i++) {
				char c = S.charAt(i);
				if((int)c > greatestValue) greatestValue = c;
				
				ans = "";
			}

			for(int i = 0; i < N; i++){
				
			}

			p("greatestValue: "+greatestValue);

			p("Case #" + caseId + ": " + ans);
		 }
	}

	////////////////
	
	private static void p(String s) {
		System.out.println(s);
	}


}
