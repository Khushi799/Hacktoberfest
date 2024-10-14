// Java program for the above approach
import java.io.*;

class GFG {

	// Function to check if a string
	// is an isogram or not
	static boolean isIsogram(String s)
	{
		int freq[] = new int[26];
		char S[] = s.toCharArray();
		for (char c : S) {
			freq++;
			if (freq > 1) {
				return false;
			}
		}

		return true;
	}

	// Function to check if array arr contains
	// all isograms or not
	static boolean allIsograms(String arr[])
	{
		for (String x : arr) {
			if (isIsogram(x) == false) {
				return false;
			}
		}

		return true;
	}

	// Driver Code
	public static void main(String[] args)
	{
		String arr[] = { "abcd", "derg", "erty" };
		if (allIsograms(arr) == true) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}

// This code is contributed by Potta Lokesh
