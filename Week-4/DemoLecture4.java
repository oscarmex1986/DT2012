// A program that uses methods to modularize processes
public class DemoLecture4{
	// Demonstrate methods in the same class as in our program
	public static String createABirthdate(int minYear, int maxYear){ // This is the method's signature
		// name createABirthdate
		// void acts, but does not return a value
		// Here we need a value of a given type in this case, a String
		String birthdate = "";
		int maxDay = 31;
		int maxMonth = 12;
		int minDay = 1; 
		int minMonth = 1;
		int year = (int)(Math.random() * (maxYear - minYear + 1) ) + minYear;
			
		int month = (int)(Math.random()*maxMonth) + minMonth;
		String paddingMonth = "";

		if(month < 10) paddingMonth = "0";

		if(month == 4 || month == 6 || month == 9 || month == 11) maxDay = 30;

		if(month == 2){
			maxDay = 28;
			if(year % 4 == 0 ){
				maxDay = 29;
				if(year % 100 == 0) maxDay = 28;
					
			}
	
		} 

		int day = (int)(Math.random()*maxDay) + minDay;
		String paddingDay = "";
		if(day<10) paddingDay = "0";

		birthdate = year + "-" + paddingMonth + month + "-" + paddingDay + day;

		// I need to return a value of the same type of the method signature
		return birthdate;
	}

	public static String createATelephoneNumber(){

		String telephone = "07";

		for(int i = 0 ; i < 8 ; i++){
			telephone = telephone + (int)(Math.random()*10);
			// string = string (concatenation) + cast as integer -> (Double - Math.random) 
		}

		return telephone;

	}
	
	public static double createAHeight(double min, double max){
		return Math.random() * (max - min) + min;
	}

	public static void main(String[] args){ // When we run java DemoLecture4, it comes here

		int n = Integer.parseInt(args[0]);
		int minYear = Integer.parseInt(args[1]);
		int maxYear = Integer.parseInt(args[2]);
		double minHeight = Double.parseDouble(args[3]);
		double maxHeight = Double.parseDouble(args[4]);
		System.out.println(n);
		for(int i = 0; i < n; i++){
			System.out.print(createABirthdate(minYear,maxYear));
			System.out.print(" ");
			System.out.print(createATelephoneNumber());
			System.out.print(" ");
			System.out.println(createAHeight(minHeight,maxHeight));
		}

		
	}
	

}