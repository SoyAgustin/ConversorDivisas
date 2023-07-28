package mx.com.test;
import mx.com.divisas.*;

public class TestConversion {
 public static void main(String[] args) {
	 Operaciones op  = new Operaciones();
	 
	 System.out.println(op.UStoMXN(168.29999));
	 System.out.println(op.MXNtoUS(10));
 }
}
