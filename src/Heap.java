public class Heap {
    static int heapSize, realSize;
    static int[] minHeap;

    public static int getHeapSize() {
        return heapSize;
    }

    public static void setHeapSize(int heapSize) {
        Heap.heapSize = heapSize;
    }

    public static int getRealSize() {
        return realSize;
    }

    public static void setRealSize(int realSize) {
        Heap.realSize = realSize;
    }

    public Heap(int heapSize){
        minHeap = new int[heapSize];

    }

    public static void main(String[] args) {
        System.out.println(minHeap);
    }
}
