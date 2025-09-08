public class fff {
    public static void main(String[] args) {
        int[] MIB = {156, 76, 34, 45, -86, 56, 57, 58, 86};

        int max = 0;
        for (int i = 0; i < MIB.length; i++) {
           int temp = MIB[i];
           max += temp;
        }

        System.out.println(max);
    }
}
