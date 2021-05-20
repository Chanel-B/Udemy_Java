package Variables;

public class VariablesInt {
    public static void main(String [] args) {
        int myFirstNumber = 5;  //inizialized cvariable, this is a decorated statment
        System.out.println(myFirstNumber);

        int sec = myFirstNumber + 5;
        System.out.println("SEC : " + sec);

        int th = myFirstNumber + sec + (45 * 9) ;
        System.out.println("th : " + th);

        int myLastOne = 1000 - th;

        System.out.println(myLastOne);
    }
}
