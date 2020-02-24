import java.util.Scanner;


public class Interface {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		decimal obj1=new decimal();
		obj1.add();
		binary obj2=new binary();
		obj2.add();
	}

}
class input{
	int val1;
	int val2;
	Scanner key = new Scanner(System.in);
	public int getval1()
	{
		System.out.println("Enter the value1 to be added");
		val1=key.nextInt();
		return val1;
	}
	public int getval2()
	{
		System.out.println("Enter the value2 to be added");
		val2=key.nextInt();
		return val2;
	}
	
}


interface sum{
	
	void add();
}


class decimal extends input implements sum{

	public void add() {
		// TODO Auto-generated method stub
		input obj = new input();
		obj.getval1();
		obj.getval2();
		int sum=obj.val1+obj.val2;
		System.out.println("The sum is"+sum);
		}
}


class binary extends input implements sum{

	public void add() {
		
		int i = 0, carry = 0;
		int[] sum = new int[10];
		input obj=new input();
		//System.out.println("Enter first binary number: ");
		int val1=obj.getval1();
		//System.out.println("Enter second binary number: ");
		int val2=obj.getval2();
		while (val1 != 0 || val2 != 0) 
		{
			sum[i++] = (int)((val1 % 10 + val2 % 10 + carry) % 2);
			carry = (int)((val1 % 10 + val2 % 10 + carry) / 2);
			val1 = val1 / 10;
			val2 = val2 / 10;
		}
		if (carry != 0) {
			sum[i++] = carry;
		}
		--i;
		System.out.print("Output: ");
		while (i >= 0) {
			System.out.print(sum[i--]);
		}
		//System.out.println("\n");  
	   }
	}




