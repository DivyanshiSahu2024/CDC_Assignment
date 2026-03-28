//Problem Link: https://www.geeksforgeeks.org/problems/toggle-bits-given-range0952/1

class Solution {
    static int toggleBits(int n, int l, int r) {
        int rMask = ((1<<r)-1);
        int lMask = ((1<<(l-1))-1);
        int finalMask = rMask ^ lMask;
        return (n^finalMask);
    }
};
