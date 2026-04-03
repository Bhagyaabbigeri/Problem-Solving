public class TwoSumSolution {

    public static int[] twoSum(int[] nums, int target) {
        java.util.HashMap<Integer, Integer> map = new java.util.HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 }; // input
        int target = 9; // input

        System.out.println(twoSum(nums, target)[0] + " " + twoSum(nums, target)[1]);
    }
}