public class BinarySearch {
    public static void main(String[] args) {
        int[] arr ={2,4,6,7,8,9,10,12,13,56,78};
        int target = 13;
        int ans = binarySearch(arr,target);
        System.out.println(ans);
    }

    //return the index
    //return -1 if it doesnt exist

    static int binarySearch (int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            //find the mid element
     //     int mid = (start + end) / 2 // might exceed so
            int mid = start + (end - start) / 2;

            if ( target < arr[mid]) {
                end = mid - 1 ;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                //ans found
                return mid;
            }

        }
        return -1;
    }
}
