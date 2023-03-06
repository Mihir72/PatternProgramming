import java.util.Scanner;

public class Fifth{
public static void main(String[] args){

Scanner s = new Scanner(System.in);
System.out.println("Enter the number which is actually the size according to which you will print your desired wap");
int n = s.nextInt();


 for(int i = 0; i < n; ++i) {
			for(int j = 0; j < n; ++j) {
				if((i == 0) || (j == 0) || (i == n-1) || 
					(i+j <= (n-1)/2) || (i-j >= (n-1)/2)) {
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