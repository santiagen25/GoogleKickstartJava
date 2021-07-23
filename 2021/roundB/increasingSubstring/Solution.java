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

			for (int position = 1; position <= N; position++) {
				//todo
				String part = S.substring(0,position);
				int partlength = part.length();
				char[] parts = part.toCharArray();
				int actual = 1;
				for (int i = 1; i < partlength; i++) {
					char first = parts[i-1];
					char second = parts[i];
					
					p("partlength: "+partlength+"\ti: "+i+"\tfirst: "+first+"\tsecond: "+second);

					if (first < second) actual++;
					else break;
				}
				result[position-1] = actual;
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
