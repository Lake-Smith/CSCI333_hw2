import java.util.Arrays;

public class MaxHeap {

	private int[] heap;
	private int heapSize = 0;
	
	MaxHeap(int[] arr){
		this.heap = Arrays.copyOfRange(arr, 0, arr.length);
		this.heapSize = heap.length;
		buildMaxHeap();
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
		System.out.println("Your heapSize is " + this.heapSize + "\n" + Arrays.toString(this.heap));
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
			swap(heap, i, largest);
		}
	}
	
	private void buildMaxHeap() {
		for(int i = this.heapSize/2; i > 1; i--) {
			maxHeapify(i);
		}
	}
	
	private void heapsort() {
		buildMaxHeap();
		int backupCopy = this.heapSize;
		for(int i = heapSize; i > 2; i--) {
			swap(heap, heap[1], heap[i]);
			this.heapSize--;
			maxHeapify(1);
		}
		this.heapSize = backupCopy;
		
	}
	
	private void swap(int[] A, int z, int r) {
		int temp = A[z];
		A[z] = A[r];
		A[r] = temp;
		//return A;
	}
	
	
	
	
}
