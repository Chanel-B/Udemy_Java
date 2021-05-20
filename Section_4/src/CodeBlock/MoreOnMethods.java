package CodeBlock;

public class MoreOnMethods {

    public static void main(String [] args){
        int number = 0;

        incrementValue(number);
        //no change to this number
        System.out.println("the value is " + number);
    }

    private static void incrementValue(int number) {
        while (number < 50)
            number++;
        printValue(number);
    }

    private static void printValue(int number) {
        System.out.println("the value is " + number);
    }

}
