package lop1k.com.test;

import java.util.Scanner;

import lop1k.com.model.Hinh;
import lop1k.com.model.hinhChuNhat;
import lop1k.com.model.hinhTron;
import lop1k.com.model.hinhVuong;

public class testHinh {
	static void HinhChuNhat() {
		Hinh chuNhat = new hinhChuNhat();
		System.out.println("Màu hình chữ nhật: ");
		String mau = new Scanner(System.in).nextLine();
		System.out.println("Chiều dài hình chữ nhật: ");
		double chieuDai = new Scanner(System.in).nextDouble();
		hinhChuNhat hinhChuNhat = new hinhChuNhat();
		System.out.println("Chiều rộng hình chữ nhật: ");
		hinhChuNhat.setChieuDai(chieuDai);
		double chieuRong = new Scanner(System.in).nextDouble();
		hinhChuNhat.setChieuRong(chieuRong);
		hinhChuNhat.setMau(mau);
		chuNhat = hinhChuNhat;
		System.out.println(chuNhat.layThongTin());	
	}
	static void HinhTron() {
		Hinh tron = new hinhTron();
		System.out.println("Màu hình tròn: ");
		String mau = new Scanner(System.in).nextLine();
		System.out.println("Bán kính hình tròn: ");
		double banKinh = new Scanner(System.in).nextDouble();
		hinhTron hinhTron= new hinhTron();
		hinhTron.setBanKinh(banKinh);
		hinhTron.setMau(mau);
		tron=hinhTron;
		System.out.println(tron.layThongTin());
	}
	static void HinhVuong() {
		Hinh vuong = new hinhVuong();
		System.out.println("Màu hình vuông: ");
		String mau = new Scanner(System.in).nextLine();
		System.out.println("Nhập cạnh hình vuông: ");
		double canh = new Scanner(System.in).nextDouble();
		hinhVuong hinhVuong = new hinhVuong();
		hinhVuong.setCanh(canh);
		hinhVuong.setMau(mau);
		vuong = hinhVuong;
		System.out.println(vuong.layThongTin());
	}
	public static void main(String[] args) {
		HinhChuNhat();
		HinhTron();
		HinhVuong();
}
}
