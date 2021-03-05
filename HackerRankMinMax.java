package com.java.Devika;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HackerRankMinMax {
	// Complete the miniMaxSum function below.
	static void miniMaxSum(int[] arr) {

		int c[] = new int[arr.length];
		int b = 0;
		
		for (int f = 0; f < arr.length; f++) {
			b = 0;
			for (int i = 0; i < arr.length; i++) {

				if (i == f)
					continue;
				else {
					b += arr[i];
				}
			}
			c[f] = b;
		}
		
		Arrays.sort(c);
		
			System.out.print(c[0] + " "+c[arr.length-1]);
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}

		miniMaxSum(arr);

	}
}
