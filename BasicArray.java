import java.util.Arrays;

class BasicArray {
    public static void main(String[] args) {
        int[] ara = new int[10];

        for(int i = 0; i < 10; i++) ara[i] = i * i;

        for(int val: ara) {
            System.out.println(val);
        }

        int length = ara.length;
        System.out.println("Length of array is "+length);

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

        int[][] size_array = new int[5][3];

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 3; j++) {
                size_array[i][j] = i * j;
            }
        }

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(size_array[i][j]);
                System.out.print(" ");
            }
            System.out.println();
            System.out.println();
        }

        int two_DArray[][] = {
            {1, 2, 3},
            {4, 5, 6, 7},
            {9, 10},
        };

        for(int i =0; i < two_DArray.length; i++) {
            for(int j = 0; j < two_DArray[i].length; j++) {
                System.out.print(two_DArray[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

        int threeArray[][][] = {
            {
                {1, 2, 3},
                {4, 5}, 
                {0, 0}
            },
            {
                {-1, -2, -3},
                {-9, 11},
                {7, 8}
            },
            {
                {234, 56}, 
                {9999, 342342, 1111}
            }
        };

        for(int[][] twoD: threeArray) {
            for(int[] oneD: twoD) {
                for(int val: oneD) {
                    System.out.println(val);
                }
            }
        }

        int[] numbers = {1, 2, 3, 4};
        int[] new_number = new int[4];


        for(int i = 0; i < 4; i++) {
            new_number[i] = numbers[i];
        }
        numbers[3] = 2314;
        // for(int i =0; i < 4; i++) {
        //     System.out.println(new_number[i]);

        // }
        System.out.println(Arrays.toString(new_number));

        int [] arr1 = {101, 201, 301, 401, 501, 601};
        int [] arr2 = new int [5];
        int [] arr3 = Arrays.copyOfRange(arr1, 1, 5);

        System.arraycopy(arr1, 0, arr2, 1, 3);
        System.out.println(Arrays.toString(arr3));
    }
}