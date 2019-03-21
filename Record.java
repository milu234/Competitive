public class Record{
	static int[] getRecord(int[] s )
	{
		int highest , lowest;
		highest = lowest = s[0];

		 int[] result = new int[2];

		 for (int s_i;s_i < s.length ;s_i++ ) {
		 	if (s[s_i] > highest) {
		 		highest = s[s_i];
		 		++result[0];
		 		
		 	}
		 	else if(s[s_i] < lowest){
		 		lowest = s[s_i];
		 		++result[1];
		 	}
		 	
		 }

		 return result;
	}
}