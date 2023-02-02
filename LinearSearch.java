public class LinearSearch {
    public static void main(String[] args) {

        int[] nums = {23, 45, 1, 6, 8, 78, -11};
        int target = -1;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }

    //search the array: return the index if the item is found
    //otherwise if item is not found return -1
    static int linearSearch(int[] arr, int target) {
        if(arr.length == 0) {
            return -1;
        }

        //run for loop
        for(int index = 0; index< arr.length; index++) {
            //check  for element at every index if it is target
            int element = arr[index];
            if(element == target) {
                return index;
            }
        }
        return -1;
    }
}
