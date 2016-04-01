package warmup;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TimeConversion {

	public static void main(String[] args) {
		String input = readNumsFromCommandLine();
		String time = input.substring(input.length() - 2, input.length());
		String[] inputParsed = input.split(":|AM|PM");
		int hours = Integer.parseInt(inputParsed[0]);
		if (time.equals("PM")) {
			if (hours < 12) {
				hours += 12;
			}
		} else if (time.equals("AM") && hours == 12) {
			hours = 0;
		}
		DecimalFormat df = new DecimalFormat("00");
		System.out.format("%s:%s:%s", df.format(hours), inputParsed[1], inputParsed[2]);

	}

	public static String readNumsFromCommandLine() {
		Scanner s = new Scanner(System.in);
		return s.nextLine();
	}

}
