public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            String current = strs[i];
            int j = 0;

            // Compare characters one by one
            while (j < prefix.length() && j < current.length() &&
                   prefix.charAt(j) == current.charAt(j)) {
                j++;
            }

            // Update the prefix to the matched portion
            prefix = prefix.substring(0, j);

            // If prefix becomes empty, no common prefix exists
            if (prefix.isEmpty()) return "";
        }

        return prefix;
    }
}
