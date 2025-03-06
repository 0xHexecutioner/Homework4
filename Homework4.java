package sample;

public class Geom {
	public static void main(String[] args) {
		double a = 0.3;
		double b = 0.4;
		double c = 0.5;
		double p = (a + b + c) / 2;
		double sideS = Math.sqrt(p * (p-a) * (p-b) * (p-c));
		System.out.println(sideS);
	}
}
