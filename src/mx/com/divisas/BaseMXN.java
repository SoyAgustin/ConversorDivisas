package mx.com.divisas;

public class BaseMXN {
	private String name;
	private double value;
	
	public BaseMXN() {
		this.name = "MXN";
		this.value = 1;
	}
	public BaseMXN(String name,double value) {
		this.name = name;
		this.value = value;
	}
	public String getName() {
		return this.name;
	}
	public double getValue() {
		return this.value;
	}
	
	public double To(BaseMXN base,double quantity) {
		if(this.name==base.name) {
			return quantity;
		}else if(base.name == "MXN") {
			return quantity/this.value;
		}else if(this.name == "MXN"){
			return quantity*base.value;
		}else {
			return this.value/base.value;
		}
	}
}
