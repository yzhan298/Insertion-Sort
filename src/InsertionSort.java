import java.util.Arrays;
import java.util.Scanner;
public class InsertionSort {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter 5 integers:");
		int[] s = new int[5];
		for(int i=0; i<s.length; i++) {
			s[i] = input.nextInt();
		}
		System.out.println("The array is "+Arrays.toString(s));	
		SortAlgrithm(s);
	}

	public static void SortAlgrithm(int[] a) {
		int current;
		int i,j;
		for(i=1;i<a.length;i++) {
			current = a[i];
			for(j=i-1;j>=0 && a[j]>current;j--) {
				a[j+1] = a[j];
			}
			a[j+1] = current;
		}
		System.out.println("The sorted array is "+Arrays.toString(a));
	}
}