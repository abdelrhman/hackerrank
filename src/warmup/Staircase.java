package warmup;

import java.util.Scanner;

public class Staircase {
	public static void main(String[] args) {
		int n = readNumsFromCommandLine();
		for(int i=0; i < n ; i++){
			for (int j=n; j> 0; j--){
				if(j> i+1){
					System.out.print(" ");
				}else{
					System.out.print("#");
				}
			}
			System.out.println();
		}
	}
	
	public static int readNumsFromCommandLine() {
        Scanner s = new Scanner(System.in);
        int count = s.nextInt();
        return count;
    }

}
