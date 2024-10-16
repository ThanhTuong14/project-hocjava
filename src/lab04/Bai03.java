package lab04;

public class Bai03 {
	public static void main(String[] args) {
		Product P1 = new Product();
		Product pr = P1.nhapThongTin("LapTop", 200, 0.2);
		P1.getTaxPrice(P1.getPrice(), P1.getTax());
		P1.xuatThongTin(pr);
	}
}
