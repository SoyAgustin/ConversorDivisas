package mx.com.test;
import mx.com.divisas.*;

public class TestConversion {
 public static void main(String[] args) {
	 BaseMXN MXN = new BaseMXN();
	 BaseMXN US = new BaseMXN("US", 16.68);
	 BaseMXN EU = new BaseMXN("EU",18.38);
	 /*
	 double val1 = MXN.To(US, 1780);
	 double val2 = US.To(MXN, val1);
	 System.out.println(val2);
	 
	 System.out.println("-------");
	 
	 double val3 = MXN.To(EU, 20);
	 double val4 = EU.To(MXN, val3);
	 System.out.println(val4);
	 
	 System.out.println("-------");*/
	 
	 double val5 = US.To(US, 1);
	 System.out.println(val5);
	 System.out.println("Un "+US.getName()+" a pesos es "+US.getValue());
 }	 
}
