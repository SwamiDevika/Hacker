package com.java.Devika;

import java.util.Arrays;
import java.util.Scanner;

public class HackerRankCandel {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b[]=new int[a];
		int count=0;
		for(int i=0;i<a;i++) {
			b[i]=scan.nextInt();
		}
		Arrays.sort(b);
		for(int i=0;i<a;i++) {
			if(b[i]==b[a-1]) {
				count++;
			}
		}
  System.out.print(count);
	}

}
