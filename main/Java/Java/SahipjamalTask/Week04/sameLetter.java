package SahipjamalTask.Week04;

public class sameLetter {

    /*
Write a return method that checks if a string is built out of the same letters as another string.
  Ex: same("abc", "cab"); ==> true
      same("abc", "abb"); ==> false
 */

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "cab";
        System.out.println(same(str1, str2));  // Output: true

        str1 = "abc";
        str2 = "abb";
        System.out.println(same(str1, str2));  // Output: false
    }

    public static boolean same(String str1, String str2) {
        // Check if the lengths of the strings are different
        if (str1.length() != str2.length()) {
            return false;
        }

        // Create character frequency arrays for both strings
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        // Count the frequencies of characters in the first string
        for (int i = 0; i < str1.length(); i++) {
            char c = Character.toLowerCase(str1.charAt(i));
            freq1[c - 'a']++;
        }

        // Count the frequencies of characters in the second string
        for (int i = 0; i < str2.length(); i++) {
            char c = Character.toLowerCase(str2.charAt(i));
            freq2[c - 'a']++;
        }

        // Compare the character frequencies
        for (int i = 0; i < 26; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }

        return true;
    }
}


