package SpeedConvertion;

public class Main {
    /**
     * Exo Write a method called toMilesPerHour that has 1 parameter of type double with the name kilometersPerHour.
     * this method needs to return the roundes value of the calculation of type long.
     * if the parameter kilometersPerHour is less than 0, the method toMilesPerHour needs to retourn -1 to indicate an invalid value.
     * otherwise, if it is positive, calculate the value of miles per hour, round it and retourn it. for conversion and rounding check the notes in the text bellow.
     *
     * esempio
     * toMilesPerHour(1.); retourn 1;
     * toMilesPerHours(-5,6); retourn 6
     * toMilesPerHour(-5.6) retourn -1
     * toMilesPerHour(25.42) retourn 16
     * @param args
     */


    public static void main(String [] args){
        System.out.println("Speed Convertor");
        long miles = SpeedConvertor.toMilesPerHour(10.5);

        System.out.println("Miles = " + miles);

        SpeedConvertor.printConversion(10.5);
    }
}
