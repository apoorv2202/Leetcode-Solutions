class Solution {
    public int countGoodSubstrings(String s) {
         int count = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {

            // Once window reaches size 3
            if (right - left + 1 == 3) {

                char a = s.charAt(left);
                char b = s.charAt(left + 1);
                char c = s.charAt(right);

                if (a != b && a != c && b != c) {
                    count++;
                }

                // Slide the window
                left++;
            }
        }

        return count;
    }
}