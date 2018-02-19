package com.manparvesh.leetcode.contests.wc66;

/**
 * Given a set of keywords words and a string S, make all appearances of all keywords in S bold. Any letters between <b> and </b> tags become bold.
 * <p>
 * The returned string should use the least number of tags possible, and of course the tags should form a valid combination.
 * <p>
 * For example, given that words = ["ab", "bc"] and S = "aabcd", we should return "a<b>abc</b>d". Note that returning "a<b>a<b>b</b>c</b>d" would use more tags, so it is incorrect.
 * <p>
 * Note:
 * <p>
 * words has length in range [0, 50].
 * words[i] has length in range [1, 10].
 * S has length in range [0, 500].
 * All characters in words[i] and S are lowercase letters.
 */
public class BoldWordsInString {
    private static final String TAG_START = "<b>";
    private static final String TAG_END = "</b>";

    public String boldWords(String[] words, String S) {
        boolean boldCharacters[] = new boolean[S.length()];
        for (String word : words) {
            int index = S.indexOf(word);
            while (index != -1) {
                for (int i = index; i < (index + word.length()); i++) {
                    boldCharacters[i] = true;
                }
                index = S.indexOf(word, index + 1);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        boolean startedTag = false;
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (boldCharacters[i]) {
                if (!startedTag) {
                    // start tag and set the variable to true
                    stringBuilder.append(TAG_START);
                    startedTag = true;
                }
            } else {
                if (startedTag) {
                    //    stop the tag
                    stringBuilder.append(TAG_END);
                    startedTag = false;
                }
            }
            stringBuilder.append(c);
            //    if a tag has been initialized and the string ended
            if (startedTag && i == S.length() - 1) {
                //    stop the tag
                stringBuilder.append(TAG_END);
                startedTag = false;
            }
        }
        return stringBuilder.toString();
    }
}
