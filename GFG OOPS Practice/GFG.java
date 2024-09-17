public class GFG {
    static String EmployeeName;
    static float EmployeeSalary;

    static void set(String name, float salary){
        EmployeeName = name;
        EmployeeSalary = salary;
    }

    static void get(){
        System.out.println("Employee name is: "+EmployeeName);
        System.out.println("Employee salary is: "+EmployeeSalary);
    }

    public static void main(String[] args){
        GFG.set("Samiran Samanta", 50000);
        GFG.get();
    }
}