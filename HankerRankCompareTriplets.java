package com.java.Devika;

import java.util.Scanner;

public class HankerRankCompareTriplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		int d=0,e=0;
		for(int i=0;i<n;i++) {
			a[i]=scan.nextInt();
		}
		for(int i=0;i<n;i++) {
			b[i]=scan.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(a[i]==b[i]) {
				continue;
			}
			else if(a[i]>b[i]) {
				d++;
			}
			else {
				e++;
			}
		}
		System.out.print(d+" "+e);

	}

}
