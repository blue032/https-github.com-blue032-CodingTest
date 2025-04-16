import java.math.BigInteger;

class Solution {
    public int solution(String number) {
        BigInteger bigNumber = new BigInteger(number);
        return bigNumber.mod(BigInteger.valueOf(9)).intValue();
    }
}
