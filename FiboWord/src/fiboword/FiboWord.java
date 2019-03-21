/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.*;
import java.util.Scanner;

/**
 *
 * @author milan
 */
public class FiboWord {
    public static String fiboword(String Sn_1 , String Sn , int n){
    
    String tmp;
    for (int i = 2 ; i <= n ; i++){
        tmp = Sn;
        Sn += Sn_1;
        Sn_1 = tmp;
    }
    return Sn;
}
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String A = "" ;
        String B = "";
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0 ; i < n ; i++)
            A = sc.nextLine();
            B = sc.nextLine();
            int m = sc.nextInt();
            System.out.println(fiboword(A , B , m));    
            
        
        
        
    }
    
}
