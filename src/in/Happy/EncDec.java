package in.Happy;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class EncDec {
	public static void main(String[] args) throws NoSuchAlgorithmException {
		String str ="Happy@123";
		
		MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
		messageDigest.reset();
		
		messageDigest.update(str.getBytes());
		
		byte[] enctext = messageDigest.digest();
		
		System.out.println(new String(enctext));
		
		
		String encoded = Base64.getEncoder().encodeToString(enctext);
		System.out.println(encoded);
		
	}

}
