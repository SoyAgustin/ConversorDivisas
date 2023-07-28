package mx.com.divisas;

public class PesoMXN {
	private double[] ValorRelativo = new double[5];
	
	public PesoMXN() {
		setEU();
		setUS();
		setGBP();
		setJPY();
		setKRW();
	}
	public void setEU() {
		this.ValorRelativo[0]=18.48;
	}
	public double getEU() {
		return ValorRelativo[0];
	}
	
	public void setUS() {
		this.ValorRelativo[1]=16.83;
	}
	public double getUS() {
		return ValorRelativo[1];
	}
	
	public void setGBP() {
		this.ValorRelativo[2]=21.56;
	}
	public double getGBP() {
		return ValorRelativo[2];
	}
	
	public void setJPY() {
		this.ValorRelativo[3]=8.29;
	}
	public double getJPY() {
		return ValorRelativo[3];
	}
	
	public void setKRW() {
		this.ValorRelativo[4]=73.89;
	}
	public double getKRW() {
		return ValorRelativo[4];
	}
	
}
