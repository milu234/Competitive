/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lcmarray;

/**
 *
 * @author milan
 */
class Main {
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

    public static void main(String[] args) {
        
        Main l1 = new Main();
        int a[]  = {2,4};
        int b[] = {16 , 32 ,96};
        
        System.out.println("LCM is " + l1.lcma(a,a.length));
        System.out.println("LCM is " + l1.lcma(b,b.length));
        
        
        
    }
    
}
