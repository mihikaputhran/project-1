package Sprint1;

public class ArithmeticOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  int sum = addition();
		  int sub = Subtraction();
		  int multi = Multiply();
		  int div = Divide();
		  int mod = Mod();
			
			System.out.println("Sum: " + sum);
			
			System.out.println("sub: " + sub);
			
			System.out.println("mulit: " + multi);
			
		 	System.out.println("div: " + div);
			
			System.out.println("mod: " + mod);
				

	}
	
	static int addition() {
	
	int a = 125;
	int b = 24;
	int totalsum = a + b;
	
	return totalsum;
	 
}

static int Subtraction() {
	
	int a = 125;
	int b = 24;
	int totalsub = a - b;
	
	return totalsub;
	 
}

static int Multiply() {

int a = 125;
int b = 24;
int totalmul = a * b;

return totalmul;
 
}

static int Divide() {

int a = 125;
int b = 24;
int totaldiv = a / b;

return totaldiv;
 
}

static int Mod() {

int a = 125;
int b = 24;
int totalmod = a % b;

return totalmod;
 
}

}
