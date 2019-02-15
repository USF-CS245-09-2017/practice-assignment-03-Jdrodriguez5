
public class BinaryRecursiveSearch implements Practice03Search
{
	public String searchName()
	{
		return "Binary-recursive";
	}

	public int search(int[] arr, int target)// , int start, int end
	{
	    int start = arr[0]; // creates the start and end
	    int end = arr[arr.length-1];

		if(start > end)
			return -1; // base case
		int mid = (start + end) / 2;
		if(arr[mid] == target)
			return mid;
		else if (arr[mid] < target)
		{
		    arr[0] = mid+1; // makes the start the midpoint plus 1
			return search(arr, target);//, mid+1, end
		}           // wasn't sure how to incorporate the start, mid, and end if i only had 2 parameters.
		else { // i think it would be something like this right?
		    arr[arr.length-1] = mid-1; // makes the end the midpoint minus 1
			return search(arr, target);//, start, mid-1
		}
	}
}