import java.util.Scanner;

public class GoalParser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the command: ");
        String command = input.next();
        input.close();
        System.out.println(goalParserFunction(command));
    }

    public static String goalParserFunction(String command){
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i<command.length(); i++){
            if(command.charAt(i) == 'g' || command.charAt(i) == 'G'){
                builder.append('G');
            }else if(command.charAt(i) == '('){
                if(command.charAt(i+1) == ')'){
                    builder.append('o');
                    i++;
                }else {
                    builder.append("al");
                    i += 3;
                }
            }
        }
        return builder.toString();
    }
}
