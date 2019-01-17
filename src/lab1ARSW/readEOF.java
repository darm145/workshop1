package lab1ARSW;

import java.io.*;
import java.util.*;

public class readEOF {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextLine()) {
        	System.out.println(sc.nextLine());
        }
        sc.close();
        
    }
}

