package org.cg.sorting;

public class BubbleSort {

	public static void main(String[] args) {
		int a[]= {69,2,72,4,5,65};
		int n=a.length;
		int c= 0;
		System.out.println("length of array "+ n);
		for (int i=0;i<n-1;i++) {
			for (int j=0;j<n-1;j++) {
				if (a[j]>a[j+1])
				{
					int b=a[j];
					a[j]= a[j+1];
					a[j+1]=b;
					
				}
			}
			c++;
		}
		System.out.println("Total number iteration = "+ c);
		for (int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
		
	

	}

}
