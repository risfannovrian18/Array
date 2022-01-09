public class LoopSorting {

	public static void main(String[] args) {
		int arr[] = {4,5,2,1,3};
		
		//outer loop
		for (int i = 0;i < arr.length;i++){
			
			//inner nested loop pointing 1 index ahead
			for (int j = i+1; j < arr.length;j++) {
				
				//checking elements
				int temp = 0;
				if (arr[j] < arr[i]) {
					
					//swapping
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			//printing sorted array elements
			System.out.print(arr[i] + " ");
		}

	}

}
