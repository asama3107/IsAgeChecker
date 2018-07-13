public class AgeChecker {

    static boolean isAge(int a){
        if (a < 121 && a > 0) {
            return true;
        }
        else {
            return false;
        }



    }


    public static void main(String[] args){

        System.out.println( isAge(25) );
        System.out.println( isAge(0) );
        System.out.println( isAge(120) );
        System.out.println( isAge(121) );
    }
}
