package lab07;

public class SinhVienIT extends SinhVien {
	private double scoreJava;
	private double scoreHTML;

	public SinhVienIT(double scoreJava, double scoreHTML, String id, String name, double price, double tax) {
		super(id, name, price, tax);
		// TODO Auto-generated constructor stub
		this.scoreJava = scoreJava;
		this.scoreHTML = scoreHTML;
	}

	@Override
	void getDiem() {
		// TODO Auto-generated method stub
		double diem = (this.getScoreJava() * 2 + this.scoreHTML) / 3;
		System.out.println("Sinh viên IT có điểm: " + diem);

	}

	public double getScoreJava() {
		return scoreJava;
	}

	public void setScoreJava(double scoreJava) {
		this.scoreJava = scoreJava;
	}

	public double getScoreHTML() {
		return scoreHTML;
	}

	public void setScoreHTML(double scoreHTML) {
		this.scoreHTML = scoreHTML;
	}

}
