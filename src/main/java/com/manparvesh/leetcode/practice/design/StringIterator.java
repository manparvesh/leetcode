package com.manparvesh.leetcode.practice.design;

/**
 * https://leetcode.com/problems/design-compressed-string-iterator/description/
 */
class StringIterator {
    private int position;
    private long originalStringLength;
    private int frequency[];
    private char alphabet[];
    private int numberOfCharacters;
    private int positionInArray;

    public StringIterator(String compressedString) {
        position = 0;
        positionInArray = 0;
        originalStringLength = 0;
        String regex = "(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)";
        String[] strings = compressedString.split(regex);

        numberOfCharacters = strings.length / 2;
        frequency = new int[numberOfCharacters];
        alphabet = new char[numberOfCharacters];

        for (int i = 0; i < strings.length; i += 2) {
            int n = Integer.parseInt(strings[i + 1]);
            originalStringLength += n;

            int otherI = i / 2;
            frequency[otherI] = n;
            alphabet[otherI] = strings[i].charAt(0);
        }

        for (int i = 1; i < numberOfCharacters; i++) {
            frequency[i] = frequency[i] + frequency[i - 1];
        }
    }

    public char next() {
        char c = ' ';
        if (hasNext()){
            if (frequency[positionInArray] < position + 1) {
                positionInArray++;
            }
            c = alphabet[positionInArray];
            position++;
        }
        return c;
    }

    public boolean hasNext() {
        return position < originalStringLength;
    }
}

/**
 * Your StringIterator object will be instantiated and called as such:
 * StringIterator obj = new StringIterator(compressedString);
 * char param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
