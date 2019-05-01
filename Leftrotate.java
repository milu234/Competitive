import java.util.*;
class Leftrotate{

	void leftrotatearray(int arr[] , int n, int d)
	{
		for(int i = 0; i < d ; i++)
			leftrotatearraybyone(arr,n);
	}

	void leftrotatearraybyone(int arr[] , int n){
		int i ,temp;
		temp = arr[0];
		for(i = 0 ; i < n - 1; i++)
			arr[i] = arr[i+1];
		arr[i] = temp;
	}

	void printArray(int arr[], int n){
		for(int i = 0 ; i < n ; i++)
			System.out.print(arr[i] + " ");
	}
	public static void main(String args[]){
		int n;
		int d;
		Scanner sc = new Scanner(System.in);

		
		n = sc.nextInt();
		d = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0 ; i < n ; i++)
			arr[i] = sc.nextInt();
		Leftrotate rotate = new Leftrotate();
		rotate.leftrotatearray(arr,n,d);
		rotate.printArray(arr, n);

	}
}