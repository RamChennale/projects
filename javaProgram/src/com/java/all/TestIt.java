package com.java.all;

public class TestIt implements InterfaceInJava, TestBaseInterface{

	@Override
	public void closeBrowser() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void baseIterface() {
		// TODO Auto-generated method stub
		
	}




}

/*
FIBONACCI SERIES
//0,1  0+1=1   1+1=2   2+1=3   2+3=5   3+5=8 .......
//0,1,1,2,3,5,8,13....

public static void main(String[] args) {
	
	int a=0, b=1;
	int temp;
	Scanner scanner= new Scanner(System.in);
	System.out.println("Enter a num needed to be fibonacci series : ");
	int n= scanner.nextInt();
	System.out.print("The fibonacci seriese is : "+a+","+b);
	
	for(int i=0; i<=n; i++ ) {
		temp=a+b;
		a=b;
		b=temp;
		System.out.print(","+temp);
	}
}
*/


/*
REVERSE THE GIVEN NUMBER

public static int revNum(int num) {
	int rev=0;
	int reminder;
	
	while(num>0) {
		reminder=num%10;
		num=num/10;
		rev=rev*10+reminder;
	}
	return rev;
}

public static void main(String[] args) {
	System.out.println("Enter a number to reverse : ");
	int num = new Scanner(System.in).nextInt();
	System.out.println();
	System.out.println("A given number is : " + num);
	System.out.println();
	System.out.println("The reversed number is :  "+revNum(num));
}
*/


/*program which should print ‘a’ if ‘a’ is bigger than ‘b’ by 2 or more or should print ‘b’ if ‘b’ 
is bigger than ‘a’ by 2 or more. Otherwise, it should print “INCONCLUSIVE”
public static void main(String[] args ) {
	
	Scanner scanner= new Scanner(System.in);
	System.out.println("Enter num one :");
	int num1= scanner.nextInt();
	System.out.println("Enter num two :");
	int num2=scanner.nextInt();
	
	if((num1>num2)&&(num1-num2)>=2) {
		System.out.println(" Bigger num is : "+num1);
	}else if((num2>num1)&&(num2-num1)>=2) {
		System.out.println("Bigger num is :"+num2);
	}else {
		System.out.println("The INCLUSIVE num are "+num1+" "+num2);
	}
}*/