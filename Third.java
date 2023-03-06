import java.util.Scanner;

public class Third{

public static void main(String[]args){
Scanner s = new Scanner(System.in);
System.out.println("Enter the size of  number according to which you want to print your wap");
int n = s.nextInt();
for(int i = 0; i < n; ++i) {
		for(int j = 0; j < n; ++j) {
			if((j==0) || (j == n-1) || (i == 0) || (i == n-1) || 
					(i+j <= (n-1)/2) || (j-i >= (n-1)/2)) {
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