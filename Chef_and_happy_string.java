/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
	public static void main(String[] args) throws java.lang.Exception {
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int tt = t;
		while (t >= 0) {
			// int x = sc.nextInt();
			String s = sc.nextLine();

			int flag = 0;
			for (int i = 0; i < s.length(); i++) {

				if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
						|| s.charAt(i) == 'u') {
					flag++;
					if (flag == 3) {
						break;
					}
				} else
					flag = 0;
			}
			if (tt != t) {
				if (flag == 3) {
					System.out.println("Happy");
				} else {
					System.out.println("Sad");
				}
			}

			t--;
		}
	}
}
