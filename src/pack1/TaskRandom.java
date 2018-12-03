package pack1;

import java.util.Random;

public class TaskRandom {
	private static Random random = new Random();
    public TaskRandom (int length) {
        random = new Random();
    }
    public static void main(String[] args) {
	        String alphabet = "abcdefghijklmno";
	        int max = alphabet.length();
	        int min = alphabet.length() - 10;
	        int diff = max-min;
	        
	        int randomCharIndex= random.nextInt(diff);
	        int randomCharIndex1= random.nextInt(diff);
	        int randomCharIndex2= random.nextInt(diff);
	        int randomCharIndex3= random.nextInt(diff);
	        
	        String randomstr = alphabet.substring(randomCharIndex); 
	        System.out.println("Password: " + randomstr);
	        
	        String randomstr1 = alphabet.substring(randomCharIndex1); 
	        System.out.println("Password: " + randomstr1);
	        
	        String randomstr2 = alphabet.substring(randomCharIndex2); 
	        System.out.println("Password: " + randomstr2);
	        
	        String randomstr3 = alphabet.substring(randomCharIndex3); 
	        System.out.println("Password: " + randomstr3);
        }

}


