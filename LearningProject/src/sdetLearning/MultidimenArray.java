package sdetLearning;

public class MultidimenArray {

	public static void main(String[] args) {
		
		int a[][]= {{100,200},{100,300},{100,400}};
		
		System.out.println(a.length);
		System.out.println(a[0].length);
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.println(a[i][j]);
			}
		}
		
		for(int r[]:a)
		{
			for(int i:r)
			{
				System.out.println(i);
			}
		}
	}

}
