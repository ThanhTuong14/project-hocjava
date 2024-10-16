package lab07;

public class SinhVienCoKhi extends SinhVien {
	private double scoreCNC;
	private double scorePLC;

	public SinhVienCoKhi(double scoreCNC, double scorePLC, String id, String name, double price, double tax) {
		super(id, name, price, tax);
		// TODO Auto-generated constructor stub
		this.scoreCNC = scoreCNC;
		this.scorePLC = scorePLC;
	}

	public double getScoreCNC() {
		return scoreCNC;
	}

	public void setScoreCNC(double scoreCNC) {
		this.scoreCNC = scoreCNC;
	}

	public double getScorePLC() {
		return scorePLC;
	}

	public void setScorePLC(double scorePLC) {
		this.scorePLC = scorePLC;
	}

	@Override
	void getDiem() {
		// TODO Auto-generated method stub
		double diem = (this.getScoreCNC() + this.scorePLC) / 2;
		System.out.println("Sinh viên Cơ Khí có điểm: " + diem);
	}

	@Override
	public String toString() {
		return "SinhVienCoKhi [scoreCNC=" + scoreCNC + ", scorePLC=" + scorePLC + "]";
	}

}
