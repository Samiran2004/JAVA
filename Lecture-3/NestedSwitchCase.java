import java.util.Scanner;

public class NestedSwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter employee id: ");
        int id = input.nextInt();
        input.nextLine();
        
        switch (id) {
            case 7211:
                System.out.println("Samiran Samanta");
                break;
            case 8159:
                System.out.println("Ram Prasad");
                break;
            case 400:
                System.out.print("Enter the department name: ");
                String department = input.nextLine();
                switch (department) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Manager":
                        System.out.println("Manager department.");
                        break;
                    default:
                        System.out.println("No department entered.");
                }
                break;
            default:
                System.out.println("Enter correct Employee Id.");
        }
        input.close();
    }
}