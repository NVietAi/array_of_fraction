package array_of_fraction;

public class ArrayOfFraction {
	// khai bao thuoc tinh cua class
	private Fraction fra[];
	private int n;

	// geter N
	public int getN() {
		return n;
	}

	// seter N
	public void setN(int n) {
		this.n = n;
	}

	// ham khoi tao khong co doi so
	public ArrayOfFraction() {
		this.fra = new Fraction[10];
		this.n = 0;
	}

	// ham khoi tao co doi so
	public ArrayOfFraction(int capacity) {
		this.fra = new Fraction[capacity];
		this.n = 0;
	}

	// ham them mot phan tu element vao cuoi mang rec gom n phan tu
	public void add(Fraction element) {
		// xet truong hop mang day de chuyen mang day thanh mang chua day
		if (n == fra.length) {
			// khai bao va xin cap phat mang moi
			Fraction b[] = new Fraction[fra.length * 2];
			// chuyen cac phan tu cua mang cu sang mang moi
			for (int i = 0; i < n; i++)
				b[i] = fra[i];
			// gan dia chi cua b qua rec
			fra = b;
		}
		// chen element vao cuoi
		fra[n] = element;
		n++;
	}

	// ham output
	public void output() {
		for (int i = 0; i < n; i++)
			System.out.println("fra[" + i + "]:\n" + fra[i].toString());
	}

	// ham to string
	public String toString() {
		String str = "";
		for (int i = 0; i < n; i++)
			str = str + "fra[" + i + "]:\n" + fra[i].toString() + "\n";
		return str;
	}

	// ham get
	public Fraction get(int index) {
		if (index < 0 || index >= n) {
			System.out.println("Invalid index");
			return null;
		} else
			return fra[index];
	}

	// ham set
	public void set(int index, Fraction x) {
		if (index < 0 || index >= n)
			System.out.println("Invalid index");
		else
			fra[index] = x;
	}

	// ham remove
	public void remove(int index) {
		if (index < 0 || index >= n)
			System.out.println("Invalid index");
		else {
			for (int i = index; i < n; i++)
				fra[i] = fra[i + 1];
			n--;
		}
	}

	// ham contain
	public boolean contain(Fraction x) {
		for (int i = 0; i < n; i++)
			if (fra[i] == x)
				return true;
		return false;
	}

	// ham indexOf
	public int indexOf(Fraction x) {
		for (int i = 0; i < n; i++)
			if (fra[i] == x)
				return i;
		return -1;
	}

	// ham lastIndexOf
	public int lastIndexOf(Fraction x) {
		for (int i = n - 1; i >= 0; i--)
			if (fra[i] == x)
				return i;
		return -1;
	}

	// ham them mot gia tri x vao vi tri index trong mang rec
	public void add(Fraction x, int index) {
		if (n == fra.length) {
			Fraction[] b = new Fraction[fra.length * 2];
			for (int i = 0; i < n; i++)
				b[i] = fra[i];
			fra = b;
		}
		if (index < 0 || index > n)
			System.out.println("Invalid Index");
		else if (index == n) {
			fra[index] = x;
			n++;
		} else {
			for (int i = n; i > index; i--)
				fra[i] = fra[i - 1];
			fra[index] = x;
			n++;
		}
	}
}
