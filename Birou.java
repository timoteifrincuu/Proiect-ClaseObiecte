
public class Birou {

	public final Sertar sertarUnu;
	public final Sertar sertarDoi;
	public int l;
	public int L;
	public int H;
	
	public Birou(Sertar un, Sertar doi, int latime, int lungime, int inaltime) {
		this.l = latime;
		this.L = lungime;
		this.H = inaltime;
		this.sertarUnu = un;
		this.sertarDoi = doi;
	} 
	
	public void tiparesteComponentele() {
		sertarUnu.tipareste();
		sertarDoi.tipareste();
		System.out.println(l);
		System.out.println(L);
		System.out.println(H);
	}
	
	public static void main(String[] args) {
		Sertar sertarUnu = new Sertar(30, 20, 10);
		Sertar sertarDoi = new Sertar(30, 20, 10);
		Birou birou = new Birou(sertarUnu, sertarDoi, 180, 60, 70);
		birou.tiparesteComponentele();
	}
}
