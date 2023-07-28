package mx.com.divisas;

public class Operaciones {
	PesoMXN peso = new PesoMXN();
	
	public double MXNtoEU(double quantity) {
		return quantity*peso.getEU();
	}
	public double MXNtoUS(double quantity) {
		return quantity*peso.getUS();
	}
	public double MXNtoGBP(double quantity) {
		return quantity*peso.getGBP();
	}
	public double MXNtoJPY(double quantity) {
		return quantity*peso.getJPY();
	}
	public double MXNtoKRW(double quantity) {
		return quantity*peso.getKRW();
	}
	
	public double EUtoMXN(double quantity) {
		return quantity/peso.getEU();
	}
	public double UStoMXN(double quantity) {
		return quantity/peso.getUS();
	}
	public double GBPtoMXN(double quantity) {
		return quantity/peso.getGBP();
	}
	public double JPYtoMXN(double quantity) {
		return quantity/peso.getJPY();
	}
	public double KRWtoMXN(double quantity) {
		return quantity/peso.getKRW();
	}
	
}
