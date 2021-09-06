import java.util.Scanner;

public class Main{
	public static void main(String[] args) {

        System.out.println("Enter a String:");
		Scanner scanner = new Scanner(System.in);
        
		String text = scanner.nextLine();
		char[] arr = text.toCharArray();
		String res ="";
		
		for(int i = 0 ; i< arr.length; i++){
			res = text.charAt(i)+res;
			
		}
		System.out.println(res);
        scanner.close();
		}
       
	}
