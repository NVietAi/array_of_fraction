package array_of_fraction;

import java.util.*;

public class Fraction {
	// khai bao thuoc tinh cua class
	private int tu;
	private int mau;

	// ham khoi tao khong co doi so
	public Fraction() {
		this.tu = 0;
		this.mau = 1;
	}

	// ham khoi tao co doi so
	public Fraction(int tu, int mau) {
		if(mau==0) {
			System.out.println("Mau = 0!");
		}
		this.tu = tu;
		this.mau = mau;
	}

	// ham nhap
	public void input() {
		Scanner kb = new Scanner(System.in);
		System.out.println("Nhap tu: ");
		this.tu = kb.nextInt();
		do {
			System.out.println("Nhap mau: ");
			this.mau = kb.nextInt();
		} while (this.mau == 0);
		kb.close();
	}

	// ham xuat
	public void output() {
		if (this.tu == 0)
			System.out.println(0);
		else if (this.tu == this.mau)
			System.out.println(1);
		else if (this.mau == 1)
			System.out.println(this.tu);
		else
			System.out.println(this.tu + "/" + this.mau);
	}

	// ham to string
	public String toString() {
		return this.tu + "/" + this.mau;
	}

	// ham cong hai phan so
	public Fraction plus(Fraction a) {
		Fraction kq = new Fraction();
		kq.tu = this.tu * a.mau + a.tu * this.mau;
		kq.mau = this.mau * a.mau;
		return kq;
	}

	// ham tru hai phan so
	public Fraction minus(Fraction a) {
		Fraction kq = new Fraction();
		kq.tu = this.tu * a.mau - this.mau * a.tu;
		kq.mau = this.mau * a.mau;
		return kq;
	}

	// ham nhan hai phan so
	public Fraction multiply(Fraction a) {
		Fraction kq = new Fraction();
		kq.tu = this.tu * a.tu;
		kq.mau = this.mau * a.mau;
		return kq;
	}

	// ham chia hai phan so
	public Fraction divide(Fraction a) {
		Fraction kq = new Fraction();
		kq.tu = this.tu * a.mau;
		kq.mau = this.mau * a.tu;
		return kq;
	}

	// ham tro ve gia tri thuc cua phan so
	public double divide() {
		return (double) this.tu / this.mau;
	}

}
