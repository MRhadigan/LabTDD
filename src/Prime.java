import java.util.ArrayList;
import java.util.Arrays;

public class Prime {


	   
	    public static int answer(int n) {
	        ArrayList<Integer> userPrime = new ArrayList<>();
	        int[] a = new int[100];
	        for (int i = 0; i < 100; i++) {
	            a[i] = i;
	        }
	     
	        for (int i = 2; i < a.length; ++i) {     
	            int element = a[i];
	            if (isPrime(element)) {
	            userPrime.add(element);
	            }
	    }
	        
	        return userPrime.get(n - 1);
	}
	    public static boolean isPrime(int n) {
	        boolean itIs = true;
	        for (int i = 2; i < n; ++i) {
	            if (n % i == 0) {
	                itIs = false;
	            }
	        }
	        return itIs, element;
	    }
	    
	    
	}
	
}
