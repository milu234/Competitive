import java.util.Scanner;

public class Birthday{
static int solve(int n, int[] s, int d, int m){
        // Complete this function
        int sum,count=0,j,k;
        for(int i=0;i<=n-m;i++)
        {
            k=i;
            sum=0;
            j=1;
         while(j<=m)
         {
             sum=sum+s[k];
             k++;
             j++;
         }
            if(sum==d)
                count++;
        }
        return count;
    }

    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);

    	int n = sc.nextInt();
    	int s[] = new int[n];
    	
    	for(int i = 0; i < n ; i++)
    		s[i] = sc.nextInt();

    	int d = sc.nextInt(); int m = sc.nextInt();

    	System.out.println(solve(n , s, d ,m));
    }

}