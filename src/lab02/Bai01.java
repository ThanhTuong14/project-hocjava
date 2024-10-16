package lab02;

import java.util.Scanner;

public class Bai01 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a,b;
		float x;
		System.out.print("Nhap vao 2 số nguyên a va b:");
		a= sc.nextInt();
		b=sc.nextInt();
		if ((a==0) && (b==0)) {
			System.out.print("PT có vô số nghiệm");
		} else if ((a==0) && (b!=0)) {
			System.out.print("PT VN");
		} else {
			x=-b/a;
			System.out.print("PT có nghiệm x= "+ x);
		}
	}
}
