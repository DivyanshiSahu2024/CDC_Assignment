class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length - 1; // since nums has n+1 elements
        int duplicate = 0;

        // Check each bit position (up to 32 bits for int)
        for (int bit = 0; bit < 32; bit++) {
            int mask = 1 << bit;
            int countNums = 0;
            int countRange = 0;

            // Count bits in nums
            for (int num : nums) {
                if ((num & mask) != 0) {
                    countNums++;
                }
            }

            // Count bits in range [1..n]
            for (int i = 1; i <= n; i++) {
                if ((i & mask) != 0) {
                    countRange++;
                }
            }

            // If nums has more set bits than expected, duplicate has this bit
            if (countNums > countRange) {
                duplicate |= mask;
            }
        }

        return duplicate;
    }
}
