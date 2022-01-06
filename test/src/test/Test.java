package test;

import javax.print.attribute.IntegerSyntax;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		double x;
		n=5;
		x=2*n+1.5;
		System.out.print("n = "+n);
		System.out.print("\n x = "+x);
		double y;
		y = n*x+12;
		System.out.print("\n y = "+y);
		
		test();
		test1();
		test2();
		test3();
		
	}
	public static void test() {
		char code='Z';
		int index = code -'A';
		int index2= code;
		System.out.print("\n index = "+index);
		System.out.print("\n index2 = "+index2);
}
	public static void test1() {
		int n1=0;
		int n2=0;
		System.out.print("\n n1 = "+n1+"; n2 = "+n2);
		n1=n2++;
		System.out.print("\n n1 = "+n1+"; n2 = "+n2);
		n1=++n2;
		System.out.print("\n n1 = "+n1+"; n2 = "+n2);
		n1=n1++;
		System.out.print("\n n1 = "+n1+"; n2 = "+n2);
		++n1;
		System.out.print("\n n1 = "+n1);
	}
	public static void test2() {
		Integer n1= new Integer(47);
		Integer n2= new Integer(47);
		System.out.print("\n "+(n1 == n2));
		System.out.print("\n "+(n1 != n2));
	}
	public static void test3() {
		Integer n1 = new Integer(47);
		Integer n2 = new Integer(47);
		System.out.println("\n"+(n1.equals(n2)));
	}

}
