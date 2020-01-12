package lop1k.com.model;

public class hinhTron extends Hinh {
	private double banKinh;

	@Override
	public double tinhDienTich() {
		return banKinh*banKinh*3.14;
	}

	@Override
	public double tinhChuVi() {
		return banKinh*2*3.14;
	}

	@Override
	public String layThongTin() {
		System.out.println("Hình tròn [Bán kính = " + banKinh + "; màu = "+ getMau()+"]");
		System.out.println("Diện tích: " + tinhDienTich());
		System.out.println("Chu vi: " + tinhChuVi());
		return "";
	}

	public double getBanKinh() {
		return banKinh;
	}

	public void setBanKinh(double banKinh) {
		this.banKinh = banKinh;
	}

	public hinhTron(double banKinh) {
		super();
		this.banKinh = banKinh;
	}

	public hinhTron() {
		super();
	}

}
