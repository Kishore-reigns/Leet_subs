import java.math.BigInteger;
class Solution {
    public String addBinary(String a, String b) {
       BigInteger a1 = new BigInteger(a,2);
       BigInteger a2 = new BigInteger(b,2);
       BigInteger sum = a1.add(a2);
       return sum.toString(2);
    }
}