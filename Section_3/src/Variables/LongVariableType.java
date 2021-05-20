package Variables;

public class LongVariableType {
    public static void main(String [] args){
        
        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Max Long = " + myMaxLongValue);
        System.out.println("Min Long = " + myMinLongValue);
        long bigLongLiteralValue = 2_147_483_647_234L;

        System.out.println(bigLongLiteralValue);
    }
}
