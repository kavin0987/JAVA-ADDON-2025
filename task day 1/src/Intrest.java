
public class Intrest {
	public static void main(String[] args) {
		
	
	//p=principle amount
	int p = 10000;
	//r=rate of intrest
	int r = 5;
	//m=months to pay 
	int m = 12;
	//>greater then zero
	if(p>0 && r>0 && m>0)
	{
		// * multiply and / divide
		int a =(p*r*m)/100;
		System.out.println("intrest is"+a);
	}
		
	}
}
