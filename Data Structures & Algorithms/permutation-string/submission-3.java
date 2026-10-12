class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {

            return false;

        }

        int[] arr = new int[26];

        int[] arr_comp = new int[26];

        int left = 0;

        int right = 0;

        for (int i = 0; i < s1.length(); i++) {

            arr[s1.charAt(i) - 'a']++;

        }

        while (right < s2.length()) {

            arr_comp[s2.charAt(right) - 'a']++;

            right++;

            if (right - left == s1.length()) {

                if (Arrays.equals(arr, arr_comp)) {

                    return true;

                }

                arr_comp[s2.charAt(left) - 'a']--;

                left++;

            }

        }

        return false;
        
    }
}
