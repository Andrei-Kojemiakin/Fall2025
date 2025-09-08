import java.util.Arrays;

public class ArrayInClass {
    public static void main(String[] args) {
        int[] MIB = {56, 76, 34, 45, -86, 56, 57, 58, 86};

        int[] deltas = new  int[MIB.length];

        for (int i = 0; i < MIB.length; i++) {
            int temp = MIB[i];
            deltas[i] = 60 - temp;
        }
        System.out.println(Arrays.toString(MIB));
        System.out.println(Arrays.toString(deltas));

    }

}
