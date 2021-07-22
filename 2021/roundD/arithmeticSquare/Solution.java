import java.util.*;
import java.io.*;

public class Solution {
	public static void main(String args[]) {
		 Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		 int numCases = sc.nextInt();

		 for(int caseId = 1; caseId <= numCases; caseId++) {
		 	//Inputs
			int[][] G = new int[3][3];
			G[0][0] = sc.nextInt();
			G[0][1] = sc.nextInt();
			G[0][2] = sc.nextInt();
			sc.nextLine();

			G[1][0] = sc.nextInt();
			G[1][1] = G[1][0];
			G[1][2] = sc.nextInt();
			sc.nextLine();

			G[2][0] = sc.nextInt();
			G[2][1] = sc.nextInt();
			G[2][2] = sc.nextInt();
			sc.nextLine();


			int[] single = new int[9];
			for(int i = 0; i < 3; i++){
				for(int j = 0; j < 3; j++){
					int queToca = (i * 3) + j;
					single[queToca] = G[i][j];
				}
			}

			Arrays.sort(single);

			//numeros seguros que estaran en la respuesta
			int seguros = 0;
			if((G[0][0] - G[0][1]) == (G[0][1] - G[0][2])) seguros++;
			if((G[2][0] - G[2][1]) == (G[2][1] - G[2][2])) seguros++;
			if((G[0][0] - G[1][0]) == (G[1][0] - G[2][0])) seguros++;
			if((G[0][2] - G[1][2]) == (G[1][2] - G[2][2])) seguros++;

			//para la iteracion 2
			
			int otros1 = 0, otros2 = 0, otros3 = 0, otros4 = 0;
			boolean mediana1b = medianaB(G[1][0], G[1][2]);
			boolean mediana2b = medianaB(G[0][1], G[2][1]);
			boolean mediana3b = medianaB(G[0][0], G[2][2]);
			boolean mediana4b = medianaB(G[0][2], G[2][0]);
			int mediana1 = mediana(G[1][0], G[1][2]);
			int mediana2 = mediana(G[0][1], G[2][1]);
			int mediana3 = mediana(G[0][0], G[2][2]);
			int mediana4 = mediana(G[0][2], G[2][0]);
			boolean la1 = true, la2 = true, la3 = true, la4 = true;

			//intento de mejorar codigo
			boolean[] medianasb = new boolean[4];
			medianasb[0] = mediana1b;
			medianasb[1] = mediana2b;
			medianasb[2] = mediana3b;
			medianasb[3] = mediana4b;
			boolean[] las = new boolean[4];
			las[0] = la1;
			las[1] = la2;
			las[2] = la3;
			las[3] = la4;
			int[] otrosA = new int[4];
			Arrays.fill(otrosA, 0);
			int[] medianas = new int[4];
			medianas[0] = mediana1;
			medianas[1] = mediana2;
			medianas[2] = mediana3;
			medianas[3] = mediana4;

			for (int l = 0; l < 4; l++) {
				if (medianasb[l]) {
					otrosA[l]++;
					for (int x = 0; x < 4; x++) {
						if (l != x && medianasb[x] && medianas[l] == medianas[x]) otrosA[l]++;
					}
				}
			}


			Arrays.sort(otrosA);

			int finalAns = seguros + otrosA[otrosA.length - 1];

			
			//Print results
			p("Case #" + caseId + ": " + finalAns);
		 }
	}

	////////////////
	
	private static void p(String s) {
		System.out.println(s);
	}

	private static int mediana (int a, int b) {
		int c = a + b;
		return (c / 2);
	}
	private static boolean medianaB (int a, int b) {
		int c = a + b;
		if(c % 2 == 0) return true;
		return false;
	}
}
