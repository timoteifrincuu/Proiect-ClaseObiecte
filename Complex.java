
public class Complex {
	
	private static int numarAfisari = 0;
	
	private double re, img; //var la nivel de instanta; cele statice apartin de clasa

	public Complex(double re, double img) {
		this.re = re;
		this.img = img;
	}
	
	public double modulComplex() {
		return Math.sqrt(re*re + img*img);
	}
	
	public String toString() {
		return re + " + i * " + img;
	}
	
	public void afisareComplex() {
		System.out.println(this);
		numarAfisari++;
	}
	
	public Complex suma(Complex c) {
		return new Complex(re + c.getRe(), img + c.getImg());
	}

	public double getRe() {
		return re;
	}

	public double getImg() {
		return img;
	}
	
	public static int getNumarAfisari() {
		return numarAfisari;
	}

	public static void numarAfisari() {
		System.out.println("s-au afisat " + numarAfisari + "nr complexe");
	}
	
}
