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
		while (t > 0) {
			int n = sc.nextInt();
			String str = sc.next();
			// if (tt != t) {
			int l = 0;
			int r = n - 1;
			LinkedList<String> ll = new LinkedList<String>();
			while (true) {
				if (str.charAt(l) == '0') {

					ll.addFirst("0");
				}

				else
					ll.addLast("1");

				l++;

				if (l > r)
					break;

				if (str.charAt(r) == '1')
					ll.addFirst("1");
				else
					ll.addLast("0");
				r--;
				if (l > r)
					break;

			}

			for (int i = 0; i < ll.size(); i++) {
				System.out.print(ll.get(i));
			}
			System.out.println("");

			t--;
		}
	}
}
