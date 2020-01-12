package lop1k.com.model;

public class hinhChuNhat extends Hinh {
	private double chieuDai, chieuRong;

	@Override
	public double tinhDienTich() {
		return chieuDai*chieuRong;
	}

	@Override
	public double tinhChuVi() {
		return (chieuDai+chieuRong)*2;
	}

	@Override
	public String layThongTin() {
		System.out.println("Hình chữ nhật [Chiều dài = " + chieuDai + ", chiều rộng = " + chieuRong + ", màu = "+ getMau()+"]");
		System.out.println("Diện tích: " + tinhDienTich());
		System.out.println("Chu vi: " + tinhChuVi());
		return "";
	}

	public double getChieuDai() {
		return chieuDai;
	}

	public void setChieuDai(double chieuDai) {
		this.chieuDai = chieuDai;
	}

	public double getChieuRong() {
		return chieuRong;
	}

	public void setChieuRong(double chieuRong) {
		this.chieuRong = chieuRong;
	}

	public hinhChuNhat(double chieuDai, double chieuRong) {
		super();
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}

	public hinhChuNhat() {
		super();
	}

}
