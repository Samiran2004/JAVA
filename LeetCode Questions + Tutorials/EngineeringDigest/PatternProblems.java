class PatternProblems {
    public static void main(String[] args) {
        // pattern1(4);
        // pattern1(70);
        // pattern2(4);
        // pattern3(4);
        pattern4(4);
    }

    /*
     * Print the following pattern for the given N number of rows...
     * 
     * Pattern for N = 4
     * 4 4 4 4
     * 4 4 4 4
     * 4 4 4 4
     * 4 4 4 4
     * 
     * Pattern for N = 7
     * 7 7 7 7 7 7 7
     * 7 7 7 7 7 7 7
     * 7 7 7 7 7 7 7
     * 7 7 7 7 7 7 7
     * 7 7 7 7 7 7 7
     * 7 7 7 7 7 7 7
     * 7 7 7 7 7 7 7
     */
    public static void pattern1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }

    /*
     * Print the following pattern for the given N number of rows...
     * 
     * Pattern for N = 4
     * 1 2 3 4
     * 1 2 3 4
     * 1 2 3 4
     * 1 2 3 4
     */
    public static void pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    /*
     * Print the following pattern for the given N number of rows...
     * 
     * Pattern for N = 4
     * * * * *
     * * * * *
     * * * * *
     * * * * *
     */
    public static void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    /*
     * Print the following pattern for the given N number of rows...
     * 
     * Pattern for N = 4
     * 1 1 1 1
     * 2 2 2 2
     * 3 3 3 3
     * 4 4 4 4
     */
    public static void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}