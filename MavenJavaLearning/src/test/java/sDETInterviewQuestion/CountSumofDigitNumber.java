package sDETInterviewQuestion;

public class CountSumofDigitNumber {

	public static void main(String[] args) {
		int num=12345;
		int sum=0;
		int count=0;
		
		while(num>0) {
			sum=sum+num%10;//0+5+4
			num=num/10;		//1234
		}
		System.out.println(sum);
		
		for(int i=0;i<=5;i++) {
			count=count+i;
		}
		System.out.println(count);
	}

}
