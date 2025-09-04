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
        int[] array6 = new int[] { 11, 22, 23, 42, 52 };
        for (int i=0; i<array6.length;i++){
            array6[i] = array6[i] * 2;
            System.out.println(array6[i]+"\n");
        }

        int[][] nums = new int[][]
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                };
        for (int i = 0; i < nums.length; i++){
            for(int j=0; j < nums[i].length; j++){

                System.out.printf("%d ", nums[i][j]);
            }
            System.out.println();
        }
    }
}
