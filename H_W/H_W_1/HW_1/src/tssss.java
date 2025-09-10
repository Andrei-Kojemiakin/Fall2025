//import java.util.Arrays;
//
//public class tssss {
//
//    public static void main(String[] args) {
//        //Вы ведете записи наивысшей дневной температуры. Найдите самый жаркий день. Найдите второй самый жаркий. Предполагается, что во все дни температура разная.
//        int temperature[] = {29, 30, 31, 32, 25, 27, 22, 23, 33, 34, 35, 36, 21};
//        int[] hottestDaysTemperatures = new int[2];
//        hottestDaysTemperatures[0] = temperature [0];
//        hottestDaysTemperatures[1] = temperature[1];
//        for (int i = 2; i < temperature.length; i = i + 2) {
//            if (hottestDaysTemperatures[0] < temperature[i]) {
//                hottestDaysTemperatures[0] = temperature[i];
//            }
//        }
//        for (int i = 3; i < temperature.length; i = i + 2) {
//            if (hottestDaysTemperatures[1] < temperature[i]) {
//                hottestDaysTemperatures[1] = temperature[i];
//            }
//        }
//        if (hottestDaysTemperatures[0] > hottestDaysTemperatures[1]) {
//            System.out.println("Температура самого жаркого дня - " + hottestDaysTemperatures[0] + " градусов цельсия");
//            System.out.println("Температура второго самого жаркого дня - " + hottestDaysTemperatures[1] + " градусов цельсия");
//        } else {
//            System.out.println("Температура самого жаркого дня - " + hottestDaysTemperatures[1] + " градусов цельсия");
//            System.out.println("Температура второго самого жаркого дня - " + hottestDaysTemperatures[0] + " градусов цельсия");
//        }
//    }
//}
//


public class tssss {
    public static void main(String[] args) {
        int temperature[] = {29, 30, 31, 32, 25, 27, 22, 23, 33, 34, 35, 36, 21};

        int max1 = Integer.MIN_VALUE; // самый жаркий
        int max2 = Integer.MIN_VALUE; // второй по жаре

        for (int temp : temperature) {
            if (temp > max1) {
                max2 = max1; // предыдущий максимум становится вторым
                max1 = temp; // обновляем самый жаркий
            } else if (temp > max2 && temp != max1) {
                max2 = temp; // обновляем второй максимум
            }
        }

        System.out.println("Температура самого жаркого дня - " + max1 + " градусов цельсия");
        System.out.println("Температура второго самого жаркого дня - " + max2 + " градусов цельсия");
    }
}