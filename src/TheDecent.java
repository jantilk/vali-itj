public class TheDecent {

    public static void main(String[] args) {
        System.out.println(HighestMountain());
    }

    public static int HighestMountain() {
        int[] mountains = {10, 20, 30, 70, 60, 50, 40};
        int mountainsCount = mountains.length;
        int highestMountain = mountains[0];
        for (int i = 1; i < mountainsCount; i++) {
            if (mountains[i] > highestMountain) {
                highestMountain = mountains[i];
            }
        }
        return highestMountain;
    }
}
