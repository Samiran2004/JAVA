import java.util.Scanner;

public class DefangingIP {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an IP address: ");
        String ipAddress = input.next();
        input.close();
        System.out.println(defangingIp(ipAddress));
    }

    static String defangingIp(String address){
        StringBuilder result = new StringBuilder();
        String ip = "[.]";
        for(int i = 0; i<address.length(); i++){
            if(address.charAt(i) == '.'){
                result.append(ip);
            }else {
                result.append(address.charAt(i));
            }
        }
        return result.toString();
    }
}
