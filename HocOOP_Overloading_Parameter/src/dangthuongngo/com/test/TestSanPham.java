package dangthuongngo.com.test;

import dangthuongngo.com.model.SanPham;

public class TestSanPham {
	public static void main(String[] args) {
		SanPham sp1 =new SanPham(1,"Coca",25);
		SanPham sp2 =new SanPham(2,"Pepsi",25);
		SanPham sp3 =new SanPham(3,"Redpull",25);
		double t=SanPham.tongTien(sp1,sp2,sp3);
		System.out.println(t);
		double t2=SanPham.tongTien(sp2,sp3);
		System.out.println(t2);
	}
}
