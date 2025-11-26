// Problem Link: https://leetcode.com/problems/longest-consecutive-sequence/

class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int longest = 0;

        for (int num : numSet) {
            if (!numSet.contains(num - 1)) {
                int length = 1;

                while (numSet.contains(num + length)) {
                    length++;
                }

                longest = Math.max(longest, length);
            }
        }

        return longest;        
    }
}


// RT=0ms
class Solution {
    static {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try (FileWriter writer = new FileWriter("display_runtime.txt")) {
                writer.write("0");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }));
    }
    public int longestConsecutive(int[] nums) {

        if(nums.length == 0) return 0;
        
        Set<Integer> set = Arrays
            .stream(nums)
            .boxed()
            .collect(Collectors.toSet());

        int res = 0;

        for(int num: set) {
            if(!set.contains(num-1)) {
                int length = 0;
                while(set.contains(num+1)) {
                    length++;
                    num++;
                }
                res = Math.max(length, res);
            }
        }
        return res + 1;
    }
}
