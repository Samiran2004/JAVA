import java.util.Scanner;

public class Final_Value {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = input.nextInt();
        String[] operations = new String[size];
        for(int i = 0; i<size; i++){
            System.out.printf("Enter %d number operation: ",i+1);
            operations[i] = input.next();
        }
        input.close();
        System.out.println(finalValue(operations));
    }

    static int finalValue(String[] arr){
//        int value = 0;
//        for(int i = 0; i<arr.length; i++){
//            if(arr[i].contains("+")){
//                value += 1;
//            }else if(arr[i].contains("-")){
//                value -= 1;
//            }
//        }
//        return value;


        int value = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i].equals("++X") || arr[i].equals("X++")){
                value += 1;
            } else if (arr[i].equals("--X") || arr[i].equals("X--")) {
                value -= 1;
            }
        }
        return value;
    }
}
