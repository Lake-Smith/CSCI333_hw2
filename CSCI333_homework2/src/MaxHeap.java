
public class MaxHeap {

	private int[] heap;
	private int heapSize;
	
	MaxHeap(int[] arr){
		this.heap = arr;
		this.heapSize = arr.length;
		BuildMaxHeap;
	}
	
	private int leftChildOf(int index) {
		int check = -1;
		
		return check;
	}
	
	private int rightChildOf(int index) {
		int check = -1;
		
		
		return check;
	}
	
	public void printMaxHeap() {
		
	}
	
	private void maxHeapify(int i) {
		int left = 2*i;
		int right = 2*i+1;
		int largest = 0;
		if(left <= heapSize && heap[left] > heap[i]) {
			largest = left;
		}else {
			largest = i;
		}
		
		if(right <=  heapSize && heap[right] > heap[i]) {
			largest = right;
		}else {
			largest = i;
		}
		
		if(largest != i) {
			swap();
		}
	}
	
	private void buildMaxHeap() {
		
	}
	
	private void heapsort() {
		
	}
	
	
	
	
}
