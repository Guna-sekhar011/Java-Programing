import java.util.Scanner;

class InvalidInputException extends Exception{
	@Override
	public String getMessage() {
		return "Invalid input";
		
	}
}


class Atm{
	int pin=123456;
	int p;
	void acceptInput() {
		System.out.println("Enter the pin");
		Scanner scan = new Scanner(System.in);
		p=scan.nextInt();

	
		
	}
	void verify() throws Exception{
		if(pin==p) {
			System.out.println("Collect your cash");
		}
		else {

			InvalidInputException ipe = new InvalidInputException();	
			throw ipe;
			}
	}
}


class Bank{
	void init() {
		Atm atm=new Atm();
		try {
			atm.acceptInput();
			atm.verify();
		}
		catch(Exception e){
			try {
				atm.acceptInput();
				atm.verify();
			}
			catch(Exception f) {
				try {
					atm.acceptInput();
					atm.verify();
				}
				catch(Exception g) {
					System.out.println(g.getMessage());
					
					System.out.println("Card Blocked Please visit bank.");
				}
				
			}
			
		}
	}
}



public class Rbi {

	public static void main(String[] args) {
		Bank b = new Bank();
		b.init();
		
	}

}
