
public class HeapSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr ={2,5,1,3,7,8,12,10};
		
	HeapSort s=new HeapSort();
	s.sort(arr);
	
	for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]);
	

	}
	
	// maxheap
void heapify(int [] arr ,int index,int n)
	{
		
	int x= 2*index+1;
	int y= 2*index+2;
	int largest=index;
	
	 if( x < n && arr[x]>arr[largest])
	 {
		largest=x; 
	 }
	 
	 if( y < n  && arr[y]>arr[largest])
	 {
		largest=y; 
		 
	 }
	 
	 if(largest!=index)
	 {
		 int temp=arr[largest];
		 arr[largest]=arr[index];
		 arr[index]=temp;
		 
		 heapify(arr ,largest,n);
	 }
	
	 
		
	}

		
public void sort(int [] arr )
	{
		
		for(int i=arr.length/2;i>=0;i--)
		{	
			heapify(arr,i,arr.length);
		}
	
		
		for(int i=0;i<arr.length;i++)
		{	
			int temp=arr[0];
			arr[0]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
			heapify(arr,0,arr.length-1-i);
		}
		
		
		
		
	
	}
	
	

}

