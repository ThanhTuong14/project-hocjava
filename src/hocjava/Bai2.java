package hocjava;

import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float cd, cr, cv, dt, min;
		System.out.print("Chiue dai hinh chu nhat:");
		cd = sc.nextFloat();
		System.out.print("Chieu rong hinh chu nhat");
		cr = sc.nextFloat();
		cv = (cd + cr) * 2;
		dt = cd * cr;
		min = Math.min(cd, cr);
		System.out.println("Chu vi hinh chu nhat la: " + cv);
		System.out.println("Dien tich hinh chu nhat la: " + dt);
		System.out.println("Canh nho nhat cua hinh chu nhat la: " + min);
	}
}
