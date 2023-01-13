package javaforinterviewquestions;

public class FindNumberArray {

	int [] number= {1,2,3,4,5,6};

	public void numberToFind() {

		int numbercheck=3;

		boolean found=false;

		for(int check:number)
		{
			if(check==numbercheck)
			{
				found=true;
				System.out.println("Number Present");
				break;

			}

		}
		if(found) {
			System.out.println("Number Present");
		}else {
			System.out.println("Number not Present");
		}

	}

	public static void main(String[] args) {
		FindNumberArray obj=new FindNumberArray();
		obj.numberToFind();
	}

}
