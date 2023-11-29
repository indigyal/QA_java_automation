package JavaArrays;

public class MultiDimArrays {
    public static void main(String[] args) {
//        //traditional way of writing an array in columns/rows
        int[][] arr = new int[3][3];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;
        arr[2][0] = 7;
        arr[2][1] = 8;
        arr[2][2] = 9;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        // new way of writing arrays in columns and rows
        int arr1[][] = {{1, 2, 3}, {2, 3, 4}, {3, 4, 5}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr1[i][j]);
            }
            System.out.println();
        }
        //jagged array
        int[][] arr2 = new int[3][];
        arr2[0] = new int[3];
        arr2[1] = new int[4];
        arr2[2] = new int[2];

        int count = 0;
        for (int i = 0; i < arr2.length; i++)
            for (int j = 0; j < arr2[i].length; j++)
                arr2[i][j] = count++;

        //print
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j]);
            }
            System.out.println();
        }
    }

}