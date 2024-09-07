package in.debasish.noticePeriod;

public class ArraySortingGeneral {

	public static void main(String[] args) {
		
		int[] arr= {12,89,2,3,7,43,4};
		
		int temp=0;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}

	}

}
