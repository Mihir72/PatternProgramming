import java.util.Scanner;


public class First1{

public static void main(String[]args){
Scanner s = new Scanner(System.in);
int n = s.nextInt();
if(n >= 9){
         
                                           for(int i = 0; i < n; ++i) {
			for(int j = 0; j < n; ++j) {
				if(j==0) {
					System.out.print("*");
				}
			}// this loop is for I
			
		   System.out.print("  ");
			for(int j = 0; j < n; ++j) {
			if((j==0) || (i==j) || (j == n-1)) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
			}// this loop is for N
			
			System.out.print(" ");
			for(int j = 0; j < n; ++j) {
				if((j==0) || 
						(i==0 && j <=(3*(n-1))/4) || 
						(i == (n-1)/2 && j <=(3* (n-1))/4) ||
						(i == n-1 && j <= (3*(n-1))/4)) {
					     System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}// this loop is for E
			
			
			//System.out.print(" ");
			for(int j = 0; j < n; ++j) {
				if((j == 0 && i != n-1) ||
					(i == n-1 && j != 0 && j != n-1) ||
					(j == n-1 &&  i != n-1) ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			} // this loop is for U
			
			System.out.print(" ");
			for(int j = 0; j < n; ++j) {
				if((j == 0) ||
					(i == 0 && j < 3*(n-1)/4) ||
					(i > 0 && i < (n-1)/2 && j == 3*(n-1)/4) ||
					(i == (n-1)/2 && j < 3*(n-1)/4) || 
					(i > (n-1)/2 && j <= 3*(n-1)/4) && i-j == (n-1)/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}// this is for R
			//System.out.print(" ");
			
			for(int j = 0; j < n; ++j) {
				if((i == 0 && j != 0 && j != n-1) ||
					(j == 0 && i > 0 && i < n-1)||
					(i == n-1 && j > 0 && j < n-1) ||
					(j == n-1 && i != n-1 && i != 0)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}//this loop is for O
			System.out.print("  ");
			for(int j = 0; j < n; ++j) {
				if((j==0) || (i==j) || (j == n-1)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				}// this loop is for N
			System.out.println();
		}
}

else{
System.out.print("You must have to enter the number 9 or greater than 9 because the content which is ineuron would be more visible to you");
}
}



}