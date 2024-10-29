public class BitManipulation {
    public static void main(String[] args) {
        System.out.println(decimalToBinary(0));
        System.out.println(binaryToDecimal("101"));

        System.out.println(5 & 6);
        System.out.println(5 | 6);
        System.out.println(5 ^ 6);
        System.out.println(5 << 1);
        System.out.println(5 >> 1);

        System.out.println((34456 & 1) == 1);
    }

    private static String decimalToBinary(int n) {
        String res = "";
        if (n == 0) {
            return "0";
        }
        while (n > 0) {
            int rem = n % 2;
            n = n / 2;
            res += rem;
        }
        return new StringBuilder(res).reverse().toString();
    }

    private static int binaryToDecimal(String bNum) {
        int length = bNum.length();
        int m = 1;
        int res = 0;
        for (int i = length - 1; i >= 0; i--) {
            char lastChar = bNum.charAt(i);
            Integer lastBit = Integer.valueOf(String.valueOf(lastChar));
            res = res + m * lastBit;
            m = m * 2;
        }
        return res;
    }
}
