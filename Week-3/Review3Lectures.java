public class Review3Lectures{
	public static void main(String[] args){
		// Create a program that reviews data types and expressions
		// Operate with whole numbers
		int n; // Declaration
		
		// The arguments that are fed to the program from the command line
		// are stored in the args[] array
		// The first position is args[0]
		// args is a string array... and we need a to be an integer

		n = Integer.parseInt(args[0]); // Initilalization. The = symbol is an assignation operator

		// Create a program that generates n birthdates between 1920 and 2020
		// and n telephone numbers
		// and n heights between 1.60 and 2.10
		int minYear = 1920;
		int maxYear = 2020;
		int minMonth = 1;
		int maxMonth = 12;
		int minDay = 1;
		int maxDay = 31;
		String telephoneNumber = "07";
		int maxHeightCm = 210;
		int minHeightCm = 160;


		System.out.println(n);
		// If I want to do something for a given number of times, I use a for loop
		// I want to do something n times

		for(int i = 0; i < n; i++){
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

			String birthdate = year + "-" + paddingMonth + month + "-" + paddingDay + day;

			String oneTelephoneNumber = telephoneNumber;
			for(int k = 0; k < 8 ; k++){
				oneTelephoneNumber = oneTelephoneNumber + (int)(Math.random()*10);
			}

			int heightInCm = (int)(Math.random() * (maxHeightCm - minHeightCm + 1)) + minHeightCm;

			System.out.println(birthdate + " " + oneTelephoneNumber + " " + heightInCm/100.0);

		}

	}
}