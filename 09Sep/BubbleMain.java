package lab_09Sep;

public class BubbleMain {

	public static void main(String[]args)
	{
	BubbleSort b = new BubbleSort();
	int arr[]= {25,46,23,65,43,78};
	System.out.println("Array before sorting ");
	for (int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");}
		System.out.println();
		b.bubbleSort(arr);
		System.out.println("Array after sorting ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	}

