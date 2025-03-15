package Matriz;

import java.util.Scanner;

public class Diagonal {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		
		int N = scn.nextInt();	
		int [][] mat = new int [N][N];
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				mat[i][j] = scn.nextInt();
			}
		}
		
		System.out.println("Main diagonal:");
		for (int i=0; i<mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}
		System.out.println();
		
		int count = 0;
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				if (mat[i][j] < 0) {
					count++;
				}
			}
		}
		
		System.out.println("Negative numbers = " + count);
		
	}
}
