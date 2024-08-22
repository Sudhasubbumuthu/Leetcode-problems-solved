class Solution {
    public int findComplement(int n) {
        int number_of_bits = (int)(Math.floor(Math.log(n) / Math.log(2)))
              + 1;
        return ((1 << number_of_bits) - 1) ^ n;
    }
}