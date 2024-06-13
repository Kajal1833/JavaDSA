public class SearchChar {
    public static void main(String[] args) {
        String name="Kajal";
        char target='u';

        System.out.println( search(target,name));
    }

    private static Boolean search(char target, String name) {
        if (name.length()==0){
            return false;
        }
        for (int i=0;i<name.length();i++){
            if(name.charAt(i)==target){
            return true;
            }

        }
      return false;
    }
}
