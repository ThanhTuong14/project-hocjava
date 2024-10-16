package hocjava;

import java.util.Scanner;

public class ChuongTrinhTinhThue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long tienthue;
		System.out.println("Nhập vào số tiền thuế: ");
		tienthue = sc.nextLong();
		if (tienthue < 10000000) {
			System.out.print("Không đóng thuế");
		} else if (tienthue <= 15000000) {
			System.out.print("Thuế 10%");
		} else if (tienthue <= 30000000) {
			System.out.print("Thuế 20%");
		} else {
			System.out.print("Thuế 50%");
		}
	}
}
