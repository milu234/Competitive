import javafx.util.Pair;
import java.util.ArrayList;
import java.util.*;

class Solution{
	public static int minSwaps(int[] arr){
		int n = arr.length;

		ArrayList<Pair <Integer, Integer> > arrpos= new ArrayList <Pair <Integer,Integer>> ();
		for (int i = 0 ; i <n ;i++)
			arrpos.add(new Pair <Integer, Integer> (arr[i], i ));




		arrpos.sort(new Comparator <Pair<Integer, Integer>>(){
			public int compare(Pair<Integer, Integer> o1,
								Pair<Integer, Integer> o2)
			{
				if(o1.getKey() > o2.getKey())
					return -1;

				else if(o1.getKey().equals(o2.getKey()))
					return 0;
				else
					return 1;

			}
		});

		Boolean[] vis = new Boolean[n];
		Arrays.fill(vis, false);


		int ans = 0;

		for(int i = 0; i < n ; i++)
			if(vis[i] || arrpos.get(i).getValue() == 1)
				continue; 

			int cycle_size = 0;
			int j = i;
			while(!vis[j])
			{
				vis[j] = true;

				j = arrpos.get(j).getValue();
				cycle_size++;
			}

			if(cycle_size > 0)
			{
				ans += (cycle_size - 1);
			}
			


	}
}