import java.util.Scanner;

public class Fourth{

public static void main(String[] args){

Scanner s = new Scanner(System.in);
System.out.println("Enter the number to print your desired wap");
int n = s.nextInt();

for(int i = 0; i < n; ++i) {
			for(int j = 0; j < n; ++j) {
				if((j == 0 && i > (n-1)/2) || (j == n-1 && i > (n-1)/2) || 
					(i == n-1) || (i - j >= (n-1)/2) || (i+j >= n-1 + (n-1)/2)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

}

}