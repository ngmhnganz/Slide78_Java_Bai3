package lop1k.com.model;

public abstract class Hinh {
	private String mau;

	public String getMau() {
		return mau;
	}

	public void setMau(String mau) {
		this.mau = mau;
	}
	public abstract double tinhDienTich();
	public abstract double tinhChuVi();;
	public abstract String layThongTin();
	
}
