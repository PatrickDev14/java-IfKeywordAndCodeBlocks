public class OverloadedMethod {

    public static void main(String[] args) {

        System.out.println("5ft, 6in = " + convertToCentimeters(5, 6) + "cm");
        System.out.println("5ft, 3in = " + convertToCentimeters(5, 3) + "cm");

    }

    public static double convertToCentimeters(int inches) {

        return inches * 2.54;
    }

    public static double convertToCentimeters(int heightInFeet, int inches) {

        int totalInches = inches + heightInFeet * 12;
        double result =  convertToCentimeters(totalInches);
        return result;
    }
}
