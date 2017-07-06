package hw3;

import java.util.*;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("surat ra vared konid");
		int s = sc.nextInt();
		System.out.println("makhraj ra vared konid");
		int m = sc.nextInt();
		Rational fp = new Rational(s, m);
		String sis =fp.toMakhlotString();
		System.out.println(sis);
	}
}
