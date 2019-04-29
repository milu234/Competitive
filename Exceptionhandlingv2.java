import java.util.*;
import java.text.SimpleDateFormat;

public class Exceptionhandlingv2{
	static void convertDateFormat(String inputDate){
		try{
			SimpleDateFormat sdf  = new SimpleDateFormat("dd/mm/yy");
			Date date = sdf.parse(inputDate);
			SimpleDateFormat outputsdf = new SimpleDateFormat("yyyy-MM-dd");
			String outputdate  = outputsdf.format(date);
			System.out.println("After changing the date format to yyyy/mm/dd : " + outputdate);
		}catch(java.text.ParseException e){
			System.out.println("Some error occured during converting the date formats");
		}
	}

	public static void main(String args[]) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter date in format dd/mm/yyyy format :  ");
		String inputDate  = sc.nextLine();
		convertDateFormat(inputDate);
	}
}