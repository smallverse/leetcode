class Test {

    public static void main(String[] args) {
        int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        // int[] nums = { 2, 1 };

        removeDuplicates(nums);
    }

    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int k = 0, count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[k] && k + 1 <= nums.length - 1) {
                nums[k] = nums[k + 1];

            }
            k++;

        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        System.out.println("j:" + count);

        return count;
    }
}