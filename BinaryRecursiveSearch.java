
public class BinaryRecursiveSearch implements Practice03Search
{
	public String searchName()
	{
		return "Binary-recursive";
	}

	public int search(int[] arr, int target)// , int start, int end
	{
		if(arr[0] > arr[arr.length-1])
			return -1; // base case ... ALWAYS NEED BASE CASE FOR RECURSION
		int mid = (arr[0] + arr[arr.length-1]) / 2;
		if(arr[mid] == target)
			return mid;
		else if (arr[mid] < target)
		{
			return search(arr, target);//, mid+1, end
		}           // wasnt sure how to incorporate the start, mid, and end if i only had 2 parameters.
		else {
			return search(arr, target);//, start, mid-1
		}
	}
}