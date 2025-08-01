public class Problem1 {
    public static void main(String[] args) {
        int[] dataset = {5, 3, 8, 6, 2, 7, 4, 1};
        int target = 6;

        long startTime = System.nanoTime();
        int linearSearchResult = linearSearch(dataset, target);
        long endTime = System.nanoTime();
        long linearSearchTime = endTime - startTime;

        Arrays.sort(dataset);
        startTime = System.nanoTime();
        int binarySearchResult = binarySearch(dataset, target);
        endTime = System.nanoTime();
        long binarySearchTime = endTime - startTime;

        System.out.println("Linear Search Result: " + linearSearchResult + ", Time: " + linearSearchTime + " ns");
        System.out.println("Binary Search Result: " + binarySearchResult + ", Time: " + binarySearchTime + " ns");
    }

    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; 
            }
        }
        return -1; 
    }

    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid; 
            }
            if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; 
    }
}