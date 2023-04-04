public class DecimalComparator {

    //  the purpose of the method is to use casting

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {

        int iNum1 = (int) (num1 * 1000);
        int iNum2 = (int) (num2 * 1000);

        return iNum1 - iNum2 == 0;
    }
}
