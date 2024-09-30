package in.Happy;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class Demo {
	public static void main(String[] args) {
		String str= "Happy@123" ;     //we are converting into simple text which can transfer over internet
	
	Encoder encoder = Base64.getEncoder();
	String encodedstr = encoder.encodeToString(str.getBytes());
	System.out.println(encodedstr);
	
	
	Decoder decoder = Base64.getDecoder();
	byte[] decode = decoder.decode(encodedstr);
	System.out.println(decode);
	
	}
	

}
