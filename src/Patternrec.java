public class Patternrec {
    public static void main(String[] args) {
 tringle(0,4);
    }
    static  void  tringle(int r, int c){
        if(r==0){
            return;
        }
        if(c < r){
            System.out.println("*");
            tringle(0,c+1);

        }
        else {
            System.out.println();
            tringle(r-1,0);
        }
    }
}
