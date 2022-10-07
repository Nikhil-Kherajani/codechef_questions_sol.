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
		while (t > 0) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = sc.nextInt();

			int max = x;

			if (y > x) {

				if (y > z) {
					System.out.println("Tester");
				} else
					System.out.println("Editorialist");
			} else if (z > x) {
				if (y > z) {
					System.out.println("Tester");
				} else
					System.out.println("Editorialist");
			} else {
				System.out.println("Setter");
			}

			t--;
		}
	}
}
