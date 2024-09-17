import java.util.Scanner;

public class SearchString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        System.out.print("Enter the key to search: ");
        char key = input.next().charAt(0);
        input.close();
        System.out.println(searchStr(str, key));
    }

    static boolean searchStr(String str, char key) {
        if (str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == key) {
                return true;
            }
        }
        return false;
    }
}
