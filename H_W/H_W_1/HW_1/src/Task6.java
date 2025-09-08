public class Task6 {
    public static void main(String[] args) {

    }
  public static double[] secondMaxTemperature(double[] temperatures) {
    double[] result = new double[2];
    result[0] = Integer.MIN_VALUE;
    result[1] = Integer.MIN_VALUE;
        for (double temp: temperatures) {
        if (temp > result[0]) {
            result[1] = result[0];
            result[0] = temp;
        } else {
            if (temp > result[1]) {
                result[1] = temp;
            }
        }
    }

        return result;
}
}
