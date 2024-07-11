package Heaps;

public class heapify {

    public void heapify(int[] A, int n, int i) {
        int largest = i;
        int l = 2 * i + 1; // left child index
        int r = 2 * i + 2; // right child index

        if (l < n && A[l] > A[largest]) {
            largest = l;
        }
        if (r < n && A[r] > A[largest]) {
            largest = r;
        }

        if (largest != i) {
            swap(A, i, largest);
            heapify(A, n, largest);
        }
    }

    public void heapsort(int[] A) {
        int n = A.length;

        // Build a max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(A, n, i);
        }

        // Extract elements from the heap one by one
        for (int i = n - 1; i > 0; i--) {
            swap(A, 0, i);
            heapify(A, i, 0);
        }
    }

    public static void swap(int[] A, int a, int b) {
        int temp = A[a];
        A[a] = A[b];
        A[b] = temp;
    }

    public static void main(String[] args) {
        int[] A = {5, 6, 8, 4, 9, 1, 2, 3};
        heapify H = new heapify();
        H.heapsort(A);

        for (int i : A) {
            System.out.print(i + " ");
        }
    }
}
