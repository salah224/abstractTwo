package abstract3;
//http://www.javatpoint.com/abstract-class-in-java
abstract class bank{
	abstract int getRateOfInterest();
}
class city extends bank{
	int getRateOfInterest(){return 7;}
}

class chase extends bank{
	int getRateOfInterest(){return 8;}
}

class BankOfAmarica extends bank{
	int getRateOfInterest(){return 9;} 
}

class testBank{}

public class abstract3 {
	public static void main(String[] args) {
		bank b = new city();
		bank b1 = new chase();
		bank b3 = new BankOfAmarica();
		int interest = b.getRateOfInterest();
		int interest1 = b1.getRateOfInterest();
		int interest3 = b3.getRateOfInterest();
		
		System.out.println("City Rate of interest : " + interest + "%");
		System.out.println("Chase Rate of interest : " + interest1 + "%");
		System.out.println("Bank of Amarica Rate of interest : " + interest3 + "%");
		
	}

}

