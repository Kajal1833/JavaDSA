public class StartPattern {
    public static void main(String[] args) {
   //     pattern9(5);
    }
    static void pattern3(int n){
        for (int i = n; i>0; i--) {
            //This for loop is to print some number of stars in one line
            for (int j = 0; j<i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
    static void pattern4(int n){
            //n=0;
        for (int r = 1; r <= n ; r++) {
            for (int c = 1; c <= r; c++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        for (int r = 0; r < 2 * n + 1; r++) {
            int totalColNum = r > n ? 2 * n - r : r;
            for (int c = 0; c < totalColNum; c++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
static void pattern6(int n){
    for (int r = 1; r <= n; r++) {
        int space=n-r;
        for (int s = 1; s <= space; s++) {
            System.out.print(" ");}
            for (int c = 1; c <= r; c++) {
                System.out.print("*");

            }
            System.out.println();

    }

}
static void pattern7(int n){
    for (int r = n; r >= 1; r--) {
        int space=n-r;
        for (int s = space; s >= 1; s--) {
            System.out.print(" ");}
        for (int c = 1; c <= r; c++) {
            System.out.print("*");

        }
        System.out.println();

    }
}
    static void pattern10(int n){
        for (int r = 1; r <= n; r++) {
            int space=n-r;
            for (int s = 1; s <= space; s++) {
                System.out.print(" ");}
            for (int c = 1; c <= r; c++) {
                System.out.print("* ");

            }
            System.out.println();

        }

    }
    static void pattern11(int n){
        for (int r = n; r >= 1; r--) {
            int space=n-r;
            for (int s = space; s >= 1; s--) {
                System.out.print(" ");}
            for (int c = 1; c <= r; c++) {
                System.out.print("* ");

            }
            System.out.println();

        }
    }
}
