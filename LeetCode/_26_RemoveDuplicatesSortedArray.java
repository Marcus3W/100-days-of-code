public class _26_RemoveDuplicatesSortedArray {

    public static void main(String[] args) {
        int[] arrayTest = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(arrayTest));

    }

    public static int removeDuplicates(int[] nums) {
        // create new array
        int count = 1;
        int[] newArr = new int[nums.length];
        boolean flag = false;
        // loop to add to array if not a duplicate
        for (int i = 1; i < nums.length; i++) {
            if (!flag) {
                newArr[0] = nums[0];
                flag = true;
            }
            if (nums[i-1] != nums[i]) {
                newArr[i] = nums[i];
                count++;
            }
        }
        return count;
    }
}
