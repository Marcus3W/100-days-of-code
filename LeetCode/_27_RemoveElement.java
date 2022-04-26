public class _27_RemoveElement {

    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val = 3;
        int k = removeElement(nums,val);

        System.out.println(k);


    }

    public static int removeElement(int[] nums, int val) {
        if (nums == null) {
            return -1;
        }
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}
