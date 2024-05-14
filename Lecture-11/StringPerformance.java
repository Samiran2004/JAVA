public class StringPerformance {
    public static void main(String[] args) {
        String s = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            System.out.println(ch);
            s += ch;
        }
        System.out.println(s);
    }
}