
public class ClientComplex {

	public static void main(String[] args) {
		
		Complex c = new Complex(3, 7);
		c.afisareComplex();

		Complex c2 = new Complex(2, 5.4);
		
		Complex suma = c.suma(c2);
		suma.afisareComplex();
		
		Complex.numarAfisari();
	}

}
