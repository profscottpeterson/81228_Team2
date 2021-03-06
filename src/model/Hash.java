package model;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class Hash {
	public static byte[] getNewSalt() {
		byte[] salt = new byte[32];
		SecureRandom random = new SecureRandom();
		random.nextBytes(salt);
		return salt;
	}

public static String md5Hash(String password, byte[] salt) {
	        String md5 = "";
	        
	                
	        if(null == password) {
	        	return null;
	        }	            
	        String Salt = "";
            for(int i=0; i< salt.length ;i++)
            {
                Salt = Salt + salt[i];
            }
            Salt = Salt.substring(0, 32); // created this so salt and password are same length
	        System.out.println("The Salt is: " + Salt);
	        System.out.println("The Password is: " + password);
	        password = password+ Salt;//adding a salt to the string before it gets hashed.
	        
	        try {
	            MessageDigest digest = MessageDigest.getInstance("MD5");//Create MessageDigest object for MD5
	            digest.update(password.getBytes(), 0, password.length());//Update input string in message digest
	            md5 = new BigInteger(1, digest.digest()).toString(16);//Converts message digest value in base 16 (hex)
	  
	        } catch (NoSuchAlgorithmException e) {
	            e.printStackTrace();
	        }
	        return md5; // md5 is what we will store in the password field of the user.
	    }


}
