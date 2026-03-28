//Problem Link: https://leetcode.com/problems/pascals-triangle-ii/
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans=new ArrayList<>();
        if(rowIndex==0){
            ans.add(1);
            return ans;
        }
        List<Integer> prev = getRow(rowIndex - 1);
        List<Integer> curr = new ArrayList<>();
        curr.add(1);
        
        // Middle elements: sum of two above
        for (int i = 1; i < prev.size(); i++) {
            curr.add(prev.get(i - 1) + prev.get(i));
        }
        // Last element is always 1
        curr.add(1);
        return curr;
    }
}
