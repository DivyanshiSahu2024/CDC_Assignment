//Problem Link: https://leetcode.com/problems/longest-substring-without-repeating-characters/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> charSet = new HashSet<>();
        int left = 0; // Left pointer for the sliding window
        int maxLength = 0; // Maximum length of substring found

        for (int right = 0; right < s.length(); right++) {
            // If the character is already in the set, move the left pointer
            while (charSet.contains(s.charAt(right))) {
                charSet.remove(s.charAt(left));
                left++;
            }
            // Add the current character to the set
            charSet.add(s.charAt(right));
            // Update the maximum length
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
