package com.alevel;

public final class ReverseStringUtil {
    private ReverseStringUtil(){}

    /**
     * @param origin the source string to reverse.
     * @param beginIndex   the beginning index, inclusive.
     * @param endIndex     the ending index, exclusive.
     * @return             the reversed string.
     * @throws     IndexOutOfBoundsException  if the
     *             {@code beginIndex} is negative, or
     *             {@code endIndex} is larger than the length of
     *             this {@code String} object.
     */
    public static String reverse(String origin,int beginIndex, int endIndex){
        StringBuilder rev = new StringBuilder();

        if(beginIndex != 0) rev.append(origin.substring(0,beginIndex));
        for (int i = endIndex-1; i >= beginIndex; i--){
            rev.append(origin.charAt(i));
        }
        if(endIndex != origin.length()) rev.append(origin.substring(endIndex));

        return rev.toString();
    }

    /**
     * @param origin          the source string to reverse.
     * @param beginIndex   the beginning index, inclusive.
     * @return             the reversed string.
     * @throws     StringIndexOutOfBoundsException  if {@code beginIndex}
     *             is negative, greater than {@code length()}.
     */
    public static String reverse(String origin, int beginIndex){
        return reverse(origin,beginIndex,origin.length());
    }

    /**
     * @param origin the source string to reverse.
     * @return    the reversed string.
     */
    public static String reverse(String origin){
        return reverse(origin,0);
    }

    /**
     * @param origin the source string to reverse.
     * @return    the reversed string.
     */
    public static String reverse(String origin, String subString){
        int testingLength = origin.length() - subString.length();
        if(testingLength<0) return origin;
        if(subString.equals("")) return origin;

        for (int j=0; j<=testingLength;j++) {
            boolean equals = true;
            for (int i = 0; i < subString.length(); i++) {
                if (origin.charAt(j+i) != subString.charAt(i)) {
                    equals = false;
                    break;
                }
            }
            if (equals) origin = reverse(origin,j,j+subString.length());
        }

        return origin;
    }
}
