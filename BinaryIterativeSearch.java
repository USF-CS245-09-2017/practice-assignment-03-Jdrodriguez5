
public class BinaryIterativeSearch implements Practice03Search 
{	
	public String searchName()
	{
		return "Binary-iterative";
	}

	public int search(int[] arr, int target)
	{
		int min = 0;
		int max = arr.length-1;
		int mid;
//		boolean found = false;

		while(min <= max) 	//or while(!found && min <= max) w/o
		{
			mid = (min + max) / 2;
			if(arr[mid] == target)
			{
				return mid;
			} else {
				if (arr[mid] > target)
				{
					max = mid - 1; 		// or max = mid; 
				} else {
					min = mid + 1; 		// can be min = mid;
				}
			}
		}

//		if (found)
//		{
//			return mid;
//		}
		return -1;
	}
}