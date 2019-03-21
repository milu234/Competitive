/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lcmarray;
import java.util.Scanner;
/**
 *
 * @author milan
 */
public class Lcmarray {
    int gcd(int x , int y){
        if(y == 0){
            return x;
        }
        return gcd(y , x%y);
    }
    
    int lcma(int arr[] , int n){
        int ans = arr[0];
        for (int i = 0 ; i < n ; i++){
            ans = ((arr[i]*ans)/gcd(arr[i],ans));
        }
        return ans;
    }
    
    int gcda(int arr[] , int n){
        int result = arr[0];
        for(int i = 1 ; i < n ; i++)
            result = gcd(arr[i] , result);
        
        return  result;
    }

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
       
        
       Scanner sc = new Scanner(System.in);
       int m = sc.nextInt(); int n = sc.nextInt();
       int a[] = new int[m];
       int b[] = new int[n];
       for(int i = 0 ; i < m ; i++)
           a[i] = sc.nextInt();
       
       for(int j = 0 ; j < n ; j++)
           b[j] = sc.nextInt();
       
       
       Lcmarray l1 = new Lcmarray();

        int count = 0;
        
        int j;
        
        int f = l1.lcma(a,a.length);
        int l = l1.gcda(b, b.length);
        
        for(int i = f ;i <= l ;i+=f){
            if(l%i == 0)
            count++;
        
    }
        System.out.println(count);
        
        
        
        
        
    }
    
}
