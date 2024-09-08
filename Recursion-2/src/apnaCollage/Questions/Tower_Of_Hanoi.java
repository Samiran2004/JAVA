package apnaCollage.Questions;

public class Tower_Of_Hanoi {
    public static void main(String[] args) {
        towerOfHanoi(3,"Source Disk","Helper Disk", "Destination Disk");
    }
    private static void towerOfHanoi(int numberDisk, String sourceDisk, String helperDisk, String destDisk){
        if (numberDisk == 1){
            System.out.println("Transfer disk: "+numberDisk+" from "+sourceDisk+" to "+destDisk);
            return;
        }
        towerOfHanoi(numberDisk - 1, sourceDisk,destDisk, helperDisk);
        System.out.println("Transfer disk: "+numberDisk+" from "+sourceDisk+" to "+destDisk);
        towerOfHanoi(numberDisk - 1, helperDisk, sourceDisk, destDisk);
    }
}