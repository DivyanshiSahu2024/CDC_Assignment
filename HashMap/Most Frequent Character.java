// Problem Link: https://www.geeksforgeeks.org/problems/maximum-occuring-character-1587115620/0

class Solution {
    public char getMaxOccuringChar(String s) {
        // code here
        HashMap<Character,Integer> freq=new HashMap<>();
        for(char ch:s.toCharArray()){
         freq.put(ch,freq.getOrDefault(ch,0)+1);
        }
        char result='z';
        int maxfreq=-1;
        for(char ch:freq.keySet()){
         int count=freq.get(ch);
         if(count > maxfreq || (count == maxfreq && ch < result)){
             maxfreq = count;
             result = ch;
         }
        }
        return result;
    }
}
