package javaforinterviewquestions;

public class SwapTwoNumberThirdVariable {

	public static void main(String[] args) {
		
		
		int mysalary=100;
		int mysuperiorsalary=1000;
		int temp=0;
		
		System.out.println("Before Swapping Salary "+"Mine "+mysalary+" mysuperior salary "+mysuperiorsalary);
		temp=mysalary;
		mysalary=mysuperiorsalary;
		mysuperiorsalary=temp;
		
		System.out.println("After Swapping Salary "+"Mine "+mysalary+" mysuperior salary "+mysuperiorsalary);
	}

}
