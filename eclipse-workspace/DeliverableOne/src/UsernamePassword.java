import java.util.Scanner;


public class UsernamePassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your Password");
		String response = scan.nextLine();
		boolean lowercase = false;
		boolean uppercase = false;
		boolean valadlength = false;
		
		boolean exclampt = false;
		char letter; 
		for(int i=0; i < response.length(); i++) {
			letter = response.charAt(i);
		
			if(Character.isLowerCase(letter)) {
				lowercase = true;
			}
			else if(Character.isUpperCase(letter)) {
				uppercase = true;
			}
			else if(letter=='!') {
				exclampt = true;
			}
		}
		
		if(response.length() >=7 && response.length()<=12) {
			valadlength = true;
		}
		if(lowercase && uppercase && exclampt && valadlength) {
			System.out.println("Password valid and accepted");
		}
		else {
			System.out.println("Error");
		}
		scan.close();
	}

}
