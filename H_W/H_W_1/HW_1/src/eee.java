//
//import java.util.Arrays;
//
//public class Task6 {
//    public static void main(String[] args) {
//        //�� ������ ������ ��������� ������� �����������. ������� ����� ������ ����. ������� ������ ����� ������. ��������������, ��� �� ��� ��� ����������� ������.
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
//            System.out.println("����������� ������ ������� ��� - " + hottestDaysTemperatures[0] + " �������� �������");
//            System.out.println("����������� ������� ������ ������� ��� - " + hottestDaysTemperatures[1] + " �������� �������");
//        } else {
//            System.out.println("����������� ������ ������� ��� - " + hottestDaysTemperatures[1] + " �������� �������");
//            System.out.println("����������� ������� ������ ������� ��� - " + hottestDaysTemperatures[0] + " �������� �������");
//        }
//    }
//}
