package com.java.Devika;

import java.util.Arrays;
import java.util.Scanner;

public class HackerJavadataType {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * write a program to fill array with key element sample between given range
		 * input 5 1 2 3 4 5 7 1 5 sample output 1 7 7 7 5
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("size");
		int s = scan.nextInt();
		System.out.println("array element");
		int[] a = new int[s];

		for (int i = 0; i < s; i++) {
			a[i] = scan.nextInt();
		}
		System.out.println("key");
		int key = scan.nextInt();
		System.out.println("start");
		int start = scan.nextInt();
		System.out.println("end");
		int end = scan.nextInt();
		Arrays.fill(a, key, start, end);
//		for (int i = start; i < end; i++) {
//			a[i] = key;
//		}
		for (int i = 0; i < s; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
