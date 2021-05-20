package Variables;

public class PrimitiveType {
    public  static void  main(String [] args){
        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

    //print the max and min value of an integer
        System.out.println("Interger Minimum Value = " + myMinIntValue);
        System.out.println("Interger my mim Value = " + myMaxIntValue);

        //LETS CHECK IT UP overfloat > than maximum
        System.out.println("BUSTED mAX vALUE = " + (myMaxIntValue + 1) );

        //LETS CHECK IT UP underfloat less than minimum
        System.out.println("BUSTED min vALUE = " + (myMinIntValue - 1) );

        int myMaxIntTest = 2_147_483_647;
    }
}
