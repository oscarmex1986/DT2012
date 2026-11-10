// A program that generates n random person number
public class GenerateManyPersonNumbers{
	public static void main(String[] args){
		int n = Integer.parseInt(args[0]);
		for(int anyVariableName = 0 ; anyVariableName < n ; anyVariableName++){
			int year = (int)(Math.random() * (2026 - 1926)) + 1926; // Any number from 1926 to 2025
			int month = (int)(Math.random() * (13 - 1)) + 1; // Any number from 1 to 12
			int day = 1; // Depending on month: 28, 30, 31
			String personNumber = "";

			switch(month){
				case 1: day = (int)(Math.random() * (32 -1)) + 1; break;
				case 2: day = (int)(Math.random() * (29 -1)) + 1; break;
				case 3: day = (int)(Math.random() * (32 -1)) + 1; break;
				case 4: day = (int)(Math.random() * (31 -1)) + 1; break;
				case 5: day = (int)(Math.random() * (32 -1)) + 1; break;
				case 6: day = (int)(Math.random() * (31 -1)) + 1; break;
				case 7: day = (int)(Math.random() * (32 -1)) + 1; break;
				case 8: day = (int)(Math.random() * (32 -1)) + 1; break;
				case 9: day = (int)(Math.random() * (31 -1)) + 1; break;
				case 10: day = (int)(Math.random() * (32 -1)) + 1; break;
				case 11: day = (int)(Math.random() * (31 -1)) + 1; break;
				case 12: day = (int)(Math.random() * (32 -1)) + 1; break;
				default: day = (int)(Math.random() * (29 -1)) + 1; break;
			}

			String stringYear = "" + year;
			String stringMonth = "" + month;
			String stringDay = "" + day;
			if (month < 10) stringMonth = "0" + stringMonth;
			if (day < 10) stringDay = "0" + stringDay;
			personNumber = stringYear + stringMonth + stringDay + "-" + ((int)(Math.random() * (10000-1000)) + 1000);
			System.out.println(personNumber);
		}
	}
}
