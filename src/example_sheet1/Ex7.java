package example_sheet1;

public class Ex7 {
	public static double interest(double deposit, double rate) {
		double myInterest=deposit*rate/100;
		return myInterest;
	}
public static void main(String[] args) {
	double rate =15;
	double myBalance = 200;
	double yourBalance = 150;
	System.out.println("The interest I have earned is "+interest(myBalance, rate));
	System.out.println("The interset I have earned is "+interest(yourBalance, rate));
	
}

}
