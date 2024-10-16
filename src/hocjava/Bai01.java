package hocjava;

import java.util.Scanner;

public class Bai01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String ten;
		float diemtb;
		System.out.print("Nhạp ten sinh vien:");
		ten = scan.nextLine();
		System.out.print("Nhap diem sinh vien:");
		diemtb = scan.nextFloat();
		System.out.print("\n" + ten + " có điểm trung bình = " + diemtb);
	}
}
