public class ms {
    public static void main(String[] args) {



/*
        for (int i = 1; i < 9; i++){
            System.out.printf(" вадрат числа %d равен %d \n", i, i * i);
        }
*/







        int[] array = new int[] { 1, 2, 3, 4, 5 };
        for (int i : array){

            System.out.println(i + "-------\n");
        }


        int[] array1 = new int[] { 8, 9, 3, 4, 5 };
        for (int i = 0; i < array1.length; i++){
            System.out.println(array1[i]+"+\n");


        }
        int[] array6 = new int[] { 1, 2, 3, 4, 5 };
        for (int i=0; i<array6.length;i++){
            array6[i] = array6[i] * 2;
            System.out.println(array6[i]);
        }
    }
}
