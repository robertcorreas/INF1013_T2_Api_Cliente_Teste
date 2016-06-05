package cliente;

import java.util.ArrayList;

public class Teste {

	public Teste() {
		a = "a";
		b = "b";
		c = 1;
		d = 2.9;

		f = new ArrayList<String>();

		for (int i = 0; i < 1000000; i++) {
			f.add("" + i);
		}

	}

	public int Count() {
		return f.size();
	}

	private ArrayList<String> f;

	private String a;
	private String b;

	public String getB() {
		return b;
	}

	public void setB(String b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public double getD() {
		return d;
	}

	public void setD(double d) {
		this.d = d;
	}

	private int c;
	private double d;

}
