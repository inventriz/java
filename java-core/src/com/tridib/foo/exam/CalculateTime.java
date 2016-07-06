package com.tridib.foo.exam;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculateTime {

	public void receiveInput(String str) {
		
		String[] consts = str.split(" ");
		System.out.println(calculateTime(consts[0], consts[1], consts[2],
				consts[3], consts[4]));
		
		/*String[] chat = str.split("\n");
		for (int i = 1; i < chat.length; i++) {
			// System.out.println(chat[i]);
			String s = chat[i];
			String[] consts = s.split(" ");
			System.out.println(calculateTime(consts[0], consts[1], consts[2],
					consts[3], consts[4]));
		}*/
	}

	public long calculateTime(String as, String bs, String cs, String ds,
			String ks) {

		// maxTime = (k-d)/a*b*c;
		int a = Integer.parseInt(as);
		int b = Integer.parseInt(bs);
		int c = Integer.parseInt(cs);
		int d = Integer.parseInt(ds);
		int k = Integer.parseInt(ks);

		long t = ((k - d) / (a * b * c));
		System.out.println("long t = "+t);
		long tm = calculateK(a, b, c, d, t);
		if (tm > k) {
			while (tm > k) {
				t--;
				tm = calculateK(a, b, c, d, t);
			}

		} else if (tm <= k) {
			while (tm <= k) {
				t++;
				tm = calculateK(a, b, c, d, t);
			}
			t--;
		}

		return Math.round(t);
	}

	public long calculateK(int a, int b, int c, int d, long t) {
		Double time = a * (Math.pow(Double.valueOf(t), Double.valueOf(3))) + b
				* (Math.pow(Double.valueOf(t), Double.valueOf(2))) + c * t + d;

		return Math.round(time);
	}

	private boolean isNumeric(String s) {

		String pattern = "^[0-9]*$";

		if (s != null && s.matches(pattern)) {
			return true;
		}
		return false;

	}

	public static void main(String args[]) {

		File file = new File("D:/Tridib/workspace/perfectnumber/input.txt");
		CalculateTime calTime = new CalculateTime();
		InputStreamReader in = null;
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
			// System.out.println(fis.toString());
			in = new InputStreamReader(fis);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		BufferedReader br1 = new BufferedReader(in);

		try {
			String line = null;
			String totalLines = br1.readLine();
			System.out.println("Total lines == " + totalLines);
			if (calTime.isNumeric(totalLines)) {
				int tl = Integer.parseInt(totalLines);
				for (int i = 1; i <= tl; i++) {
					//System.out.println(i +" === ");
					calTime.receiveInput(br1.readLine());
				}
			}
			/*
			 * while ((line = br1.readLine()) != null) {
			 * System.out.println(line); }
			 */
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		/*
		 * String line=null; try { line = br.readLine();
		 * System.out.println(line); } catch (IOException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 * 
		 * 
		 * int N = Integer.parseInt(line); for (int i = 0; i < N; i++) {
		 * System.out.println("hello world"); }
		 * 
		 * StringBuilder sb = new StringBuilder("2"); sb.append("\n");
		 * sb.append("2 2 2 2 10"); sb.append("\n"); sb.append("2 3 5 7 1000");
		 * //System.out.println("Max time capacity == "+calTime.calculateTime(2,
		 * 2, 2, 2, 10)); String strChat = sb.toString(); if(line != null &&
		 * !line.isEmpty()){ calTime.receiveInput(line); }
		 */

		// System.out.println("Max time capacity == "+calTime.calculateTime(2,
		// 3, 5, 7, 1000));
	}

}
