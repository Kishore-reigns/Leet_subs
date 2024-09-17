class Solution {
    public String countAndSay(int n) {

        String s = "1";
        if (n == 1)
            return s;
        if( n == 2)return "11";
        for (int i = 1; i < n-1; i++) {
            StringBuilder res = new StringBuilder();
            int count = 1;
            if (s.length() == 1) {
                s = "21";
            } else {
                for (int j = 1; j < s.length(); j++) {
                    char c = s.charAt(j);
                    if (c == s.charAt(j - 1)) {
                        count++;
                    } else {
                        res.append(count);
                        res.append(s.charAt(j - 1));
                        count = 1;
                    }
                }
                res.append(count);
                res.append(s.charAt(s.length()-1));
                s = res.toString();
            }
            System.out.println(s);

        }

        return s;
    }
}