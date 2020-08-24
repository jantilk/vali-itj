public class Lesson1MathUtil {

    public static void main(String[] args) {
        System.out.println("min = " + min(1, 5));
        System.out.println("max = " + max(1, 5));
        System.out.println("abs = " + abs(-1));
        System.out.println("isEven = " + isEven(2));
        System.out.println("min3 = " + min(1,1,3));
        System.out.println("max3 = " + max(1,3,3));

    }

    public static int min(int a, int b){
        // TODO tagasta a ja b väikseim väärtus
        int minValue;
        if (a<b) {
            minValue = a;
        } else {
            minValue = b;
        }
        return minValue;
    }

    public static int max(int a, int b){
        // TODO tagasta a ja b suurim väärtus
        int maxValue;
        if (a>b) {
            maxValue = a;
        } else {
            maxValue = b;
        }
        return maxValue;
    }

    public static int abs(int a){
        // TODO tagasta a absoluut arv
        int absoluutArv;
        if (a>0) {
            absoluutArv = a;
        } else {
            absoluutArv = a * -1;
        }
        return absoluutArv;
    }

    public static boolean isEven(int a){
        // TODO tagasta true, kui a on paaris arv
        if (a%2 == 0) {
            return true;
        } else {
            // tagasta false kui a on paaritu arv
            return false;
        }
    }

    public static int min(int a, int b, int c){
        // TODO tagasta a, b ja c väikseim väärtus
        int minValue;
        if (a<=b && a<=c) {
            minValue = a;
        } else if (b<=a && b<=c) {
            minValue = b;
        } else {
            minValue = c;
        }
        return minValue;
    }

    public static int max(int a, int b, int c){
        // TODO tagasta a, b ja c suurim väärtus
        int maxValue;
        if (a>=b && a>=c) {
            maxValue = a;
        } else if (b>=a && b>=c) {
            maxValue = b;
        } else {
            maxValue = c;
        }
        return maxValue;
    }

}
