package lop1k.com.model;

public class hinhVuong extends hinhChuNhat{
	private double canh;

	public double getCanh() {
		return canh;
	}

	public void setCanh(double canh) {
		this.canh = canh;
		super.setChieuDai(canh);
		super.setChieuRong(canh);
	}

	@Override
	public double tinhDienTich() {
		return super.tinhDienTich();
	}

	@Override
	public double tinhChuVi() {
		// TODO Auto-generated method stub
		return super.tinhChuVi();
	}

	@Override
	public String layThongTin() {
		System.out.println("Hình Vuông [cạnh =" + canh +"; màu = "+ getMau()+ "]");
		System.out.println("Diện tích: " + tinhDienTich());
		System.out.println("Chu vi: " + tinhChuVi());
		return "";
	}

	public hinhVuong(double canh) {
		this.canh = canh;
	}

	public hinhVuong() {
		super();
	}
	
}
