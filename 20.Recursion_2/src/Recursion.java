public class Recursion {
    public static void main(String[] args) {
        String[] arr = {"award", "aware", "beard", "crowd", "dairy", "diary",
                "feign", "grant", "pride", "sharp", "strap", "straw"};
        int[] intArray = {1,2,10,3,98,23,15,26};

        System.out.printf("The word \"dairy\" is at index %d%n", linearSearch(arr, "dairy"));
        System.out.printf("The word \"fairy\" is at index %d%n", linearSearch(arr, "fairy"));

        System.out.printf("The word \"dairy\" is at index %d%n", binarySearch(arr, "dairy"));
        System.out.printf("The word \"fairy\" is at index %d%n", binarySearch(arr, "fairy"));

        System.out.printf("The largest value in the array is %d%n",findLargest(intArray, 0));
    }

    /**
     * Searches the given array for a specified target in a linear manner.
     *
     * @param items     array to search
     * @param target    element to look for
     * @return          index target is found at, or -1 if not found
     */
    public static int linearSearch(String[] items, String target) {
        // TODO: Implement the method
        return linearSearchHelper(items, target, 0);
    };

    private static int linearSearchHelper(String[] items, String target, int index) {
        if (index >= items.length) {
            return -1;
        } else if (items[index].equals(target)) {
            return index;
        } else {
            return linearSearchHelper(items, target, index+1);
        }
    }

    /**
     * Searches the given array for a specified target.
     * The array must be in sorted order.
     *
     * @param items     array to search
     * @param target    element to look for in array
     * @return          index target is found at, or -1 if not found
     */
    public static int binarySearch(String[] items, String target) {
        // TODO: Implement the method
        return binarySearchHelper(items, target, 0, items.length);
    }

    private static int binarySearchHelper(String[] items, String target, int left, int right) {
        if (left > right || items.length == 0) {
            return -1;
        }
        int mid = (left + right) / 2;
        if (items[mid].equals(target)) {
            return mid;
        } else if (target.compareTo(items[mid]) < 0) {
            return binarySearchHelper(items, target, left, mid-1);
        } else {
            return binarySearchHelper(items, target, mid+1, right);
        }

    }

    public static int findLargest(int[] arr, int index) {
        //Edge Case
        if (arr == null || index >= arr.length) {
            return Integer.MIN_VALUE;
        }
        //Take array of Integers, Index to start looking at
        int biggestInRest = findLargest(arr, index+1);
        return Math.max(arr[index], biggestInRest);
    }
}