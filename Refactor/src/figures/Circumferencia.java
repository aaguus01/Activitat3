package figures;

public class Circumferencia {
	private double radio;
	private String color;

	public Circumferencia(double radio) {
		this.radio = radio;
	}

	public void imprimir() {
		color = "rojo";
		System.out.println("Diámetro: " + 2 * radio);
		System.out.println("Color: " + color);
		double area1 = 2 * 3.1416 * radio * radio;
		double area = area1;
		System.out.println(area);
	}

	public boolean conDecimals(Circumferencia otro, boolean conDecimales) {
		double radio1 = this.radio;
		double radio2 = otro.getRad();
		if (conDecimales) {
			if (radio1 == radio2)
				return true;
			else
				return false;
		} else {
			if (Math.abs(radio1 - radio2) < 1)
				return true;
			else
				return false;
		}
	}

	public double getRad() {
		return radio;
	}

	public void setRad(double rad) {
		this.radio = rad;
	}
}
