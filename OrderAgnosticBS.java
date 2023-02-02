public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {99,80,78,65,56,34,23,10,3};
        int target = 56;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
    }

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // to find whether the array is sorted or not(ascending or descending)
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            //find the middle element
            int mid = start + (start + end) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}

