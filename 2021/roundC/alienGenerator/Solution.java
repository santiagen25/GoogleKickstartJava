import java.util.*;
import java.io.*;

public class Solution {
	public static void main(String args[]) {
		 Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		 int numCases = sc.nextInt();

		 for(int caseId = 1; caseId <= numCases; caseId++) {
		 	//Inputs
			long G = sc.nextLong();
			sc.nextLine();

			//Setup
			int ans = 1;
			for(long i = 1; i < G; i++) {
				long goldIngotsSum = 0;
				for (long day = 1; goldIngotsSum <= G; day++){
					goldIngotsSum += i + day -1;
					//if(i == 8) p("j is "+j);
					if (goldIngotsSum == G) {
						ans++;
						p("i is "+i);
						//p("actual gold ingots are:"+goldIngotsSum);
						break;
					}
				}
			}
			
			//Print results
			p("Case #" + caseId + ": " + ans);
		 }
	}

	////////////////
	
	private static void p(String s) {
		System.out.println(s);
	}


}
