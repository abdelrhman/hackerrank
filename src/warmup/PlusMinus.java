package warmup;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class PlusMinus {
	
	public static void main(String[] args) {
		long [] numbers = readNumsFromCommandLine();
		double postive = 0 ; 
		double negative = 0 ; 
		double zero = 0 ; 
		for(long i : numbers){
			if(i > 0){
				postive++; 
			}else if (i < 0){
				negative++; 
			}else{
				zero++; 
			}
		}
		
		DecimalFormat df = new DecimalFormat("#.000000");
		df.setRoundingMode(RoundingMode.HALF_UP);
		
		double n = numbers.length ; 
		System.out.println(df.format(postive/n));
		System.out.println(df.format(negative/n));
		System.out.println(df.format(zero/n));
		
	}
	
	public static long [] readNumsFromCommandLine() {

        Scanner s = new Scanner(System.in);

        int count = s.nextInt();
        s.nextLine(); // throw away the newline.

        long [] numbers = new long[count];
        Scanner numScanner = new Scanner(s.nextLine());
        for (int i = 0; i < count; i++) {
            if (numScanner.hasNextInt()) {
                numbers[i] = numScanner.nextInt();
            } else {
                System.out.println("You didn't provide enough numbers");
                break;
            }
        }

        return numbers;
    }

}
