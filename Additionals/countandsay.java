package Additionals;

/* 1
 * 11
 * 1211....
 *  */
class Solution {
    public String countAndSay(int n) {
        if (n == 1)
            return "1";
        String str = "1";
        for (int i = 2; i <= n; i++) {
            String nextString = "";
            int cnt = 1;
            char ch = str.charAt(0);
            for (int j = 1; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    cnt++;
                } else {

                    nextString += cnt + "" + ch;
                    ch = str.charAt(j);
                    cnt = 1;
                }
            }
            nextString += cnt + "" + ch;
            str = nextString;
        }
        return str;
    }
}