package lab1ARSW;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
    	char[] s1,s2;
    	s1=a.toCharArray();
    	s2=b.toCharArray();
    	if(s1.length!=s2.length) {
    		return false;
    	}
    	else {
    		Arrays.sort(s1);
        	Arrays.sort(s2);
        	for(int i=0;i<s1.length;i++) {
        		if(s1[i]!=s2[i]) {
        			return false;
        		}
        	}
        	return true;
    	}
    	
    	
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
