class Solution {
    public boolean isPalindrome(String s) {
        String s2 = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        char[] sArray = s2.toCharArray();
        for (int i = 0, j = sArray.length - 1; i < j; i++, j--) {
            if (sArray[i] != sArray[j]) {
                return false;

            }
        }
        return true;
    }

}