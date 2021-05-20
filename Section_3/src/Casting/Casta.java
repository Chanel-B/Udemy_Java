package Casting;

public class Casta {
    public static  void  main(String [] args){
        int minInt = Integer.MAX_VALUE;

        System.out.println("Interger : " + minInt);

        float myNewFloatValue = (float) (minInt / 2);

        System.out.println("Flaot : " + myNewFloatValue);

        byte myNewByteValue = (byte) (myNewFloatValue / 2);

        System.out.println("Byte : " + myNewByteValue);

        short myNewShortValue = (short) (myNewByteValue / 2 );

        System.out.println("Short : " + myNewShortValue);

        long myNewLongValue = (long) (myNewShortValue / 2);

        System.out.println("long : " + myNewLongValue );
    }
}
