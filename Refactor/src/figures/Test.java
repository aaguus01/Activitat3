package figures;

public class Test {
	public static void main(String[] args) {
		Circumferencia c1 = new Circumferencia(5.5);
		Circumferencia c2 = new Circumferencia(10.1);
		Circumferencia c3 = new Circumferencia(10.9);

		if (c2.conDecimals(c3, false)) {
			System.out.println("c2 y c3: iguales sin considerar decimales");
		}

		if (c2.conDecimals(c3, true)) {
			System.out.println("c2 y c3: iguales considerando decimales");
		}
	}
}