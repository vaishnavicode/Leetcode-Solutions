package Solutions;

public class Q1750_MinimumLengthAfterDeletingSimilarEnds {
    public static void main(String[] args) {

        Solution1750 s = new Solution1750();
        System.out.println(s.minimumLength("aabccabba"));
        
    }
}


class Solution1750 {
    public int minimumLength(String s) {
        int begin = 0;
        int end = s.length() - 1;

        // Delete similar ends until the ends differ or they meet in the middle
        while (begin < end && s.charAt(begin) == s.charAt(end)) {
            char c = s.charAt(begin);

            // Delete consecutive occurrences of c from prefix
            while (begin <= end && s.charAt(begin) == c) {
                begin++;
            }

            // Delete consecutive occurrences of c from suffix
            while (end > begin && s.charAt(end) == c) {
                end--;
            }
        }

        // Return the number of remaining characters
        return end - begin + 1;
    }
}