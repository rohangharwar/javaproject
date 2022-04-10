package Unit_01;

import java.util.Arrays;
/* Tasks given below:
		obj.sortAnArray(array);
		obj.findTheDuplicateElements(array);
		obj.findSecondLargestAndSecondSmallestElement(array);
		obj.leftRotationInAnArray(array); 
		obj.removeElementInArray(array);//(Optional)
 */

public class P9_Array{

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 4, 6, 2, 3 };

		QuestionsOnArray obj = new QuestionsOnArray();
		obj.sortAnArray(array);
		obj.findTheDuplicateElements(array);
		obj.findSecondLargestAndSecondSmallestElement(array);
		obj.leftRotationInAnArray(array);
		obj.removeElementInArray(array); // (Optional)

	}

}

class QuestionsOnArray {

	void sortAnArray(int[] array) {
		Arrays.sort(array);
		System.out.println("Ater sorting the elements: ");
		for(int i=0 ; i<array.length ; i++) {
			System.out.print(array[i]+" ");
		}

	}

	void findTheDuplicateElements(int[] arr) {
		int i,j;
		System.out.println("\nDuplicate elements in given array: ");
		for(i=0 ; i<arr.length ; i++) {
			for(j=i+1 ; j<arr.length ; j++) {
				if(arr[i] == arr[j])
					System.out.print(arr[i]+" ");
			}
		}

	}

	void findSecondLargestAndSecondSmallestElement(int[] arr) {
		int n=arr.length, temp;
		int count=0;
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("\nThe Second Largest number is : "+arr[n-2]);
		System.out.println("\nThe second Smallest number is : "+arr[1]);
	}

	void leftRotationInAnArray(int[] arr) {
		int n=1;
		System.out.println("\nThe original array is : ");
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]+" ");
		for(int i=0; i<n; i++)
		{
			int j,first;
			first=arr[0];
			for(j=0; j<arr.length-1; j++) {
				arr[j]=arr[j+1];
			
			}
			arr[j]=first;
		}
		System.out.println("\nArray after left rotate: ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}
		

	void removeElementInArray(int[] arr) {
		
	
	

	}

}