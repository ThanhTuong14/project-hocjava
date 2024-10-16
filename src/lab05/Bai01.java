package lab05;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Double> arr1 = new ArrayList<>();
		// Nhập số lượng tùy thích

		while (true) {
			System.out.println("Nhập danh sách số thực: ");
			double x = scan.nextDouble();
			arr1.add(x);
			scan.nextLine(); // enter
			System.out.println("Nhập thêm phần tử (Y/N): ");
			String chon = scan.nextLine();
			if (chon.equals("N") || chon.equals("n")) {
				break;
			}
		}
		double sum = 0;
		System.out.println("Danh sách số thực vừa nhập là:");
		for (double i : arr1) {
			System.out.println(" " + i);
			sum += i;
		}
		System.out.println("Danh sách số thực vừa nhập có tổng là: " + sum);
	}

}
