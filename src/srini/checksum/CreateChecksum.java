package srini.checksum;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class CreateChecksum {
	    public static void main(String args[]) {
	    	String test = "Hello world";
	    	byte[] bytes = test.getBytes(StandardCharsets.UTF_8);	
	    	System.out.println("MD5 checksum for file using Java : " 	    + checkSum(new ByteArrayInputStream(bytes)));	    	
	    	System.out.println("MD5 checksum for file using Java : "   	    + checkSum(new ByteArrayInputStream(bytes)));
	    }
	    public static String checkSum(InputStream fis){
	        String checksum = null;
	        try {
	            MessageDigest md = MessageDigest.getInstance("MD5");
	            //Using MessageDigest update() method to provide input
	            byte[] buffer = new byte[8192];
	            int numOfBytesRead;
	            while( (numOfBytesRead = fis.read(buffer)) > 0){
	                md.update(buffer, 0, numOfBytesRead);
	            }
	            byte[] hash = md.digest();
	            checksum = new BigInteger(1, hash).toString(16); 
	        } catch (Exception ex) {	              
	        }
	       return checksum;
	    }
}
