//Problem Link: https://leetcode.com/problems/top-k-frequent-elements/description/

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int i=0;i<nums.length;i++){
          freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
        }
         PriorityQueue<Map.Entry<Integer, Integer>> heap = new PriorityQueue<>(
            (a, b) -> Integer.compare(b.getValue(), a.getValue())
        );
         for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            heap.offer(entry);
        }

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = Objects.requireNonNull(heap.poll()).getKey();
        }
        
        return res;   
        }
    }
