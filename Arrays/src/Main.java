// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int num1 = 5;
        int[] numArray = {2,4,6,8,10};
        double[] numArray2 = {2.23, 4.78, 34.12358473674, 3.0, 12.333, 56.878};
        boolean[] numArray3 = {true, false, true, true};


        int[] numArray4 = new int[7];

        numArray4[0] = 34;
        numArray4[1] = 56;
        numArray4[2] = 876;
        numArray4[3] = 5876;
        numArray4[4] = 123;
        numArray4[5] = -876;
        numArray4[6] = -123;

        for (int i=0; i < numArray4.length; i++ ) {
            System.out.println(numArray4[i]);
        }

        for (int value : numArray4 ) {
            System.out.println(value);
        }


        int[][] my2DArray = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        System.out.println("The value " + my2DArray[3][0]);
        System.out.println("The value " + my2DArray[1][3]);

        for (int[] row : my2DArray) {
            for ( int col : row) {
                System.out.print(col + " ");
            }
            System.out.print("\n");
        }

        for (int r=0; r<my2DArray.length; r++) {
            for (int c=0; c<my2DArray[r].length; c++) {
                System.out.print(my2DArray[r][c] + " ");
            }
            System.out.print("\n");
        }

        int[][] studentIDsInClassrooms = new int[3][];

        studentIDsInClassrooms[0] = new int[3];
        studentIDsInClassrooms[0][0] = 4345566;
        studentIDsInClassrooms[0][1] = 8877663;
        studentIDsInClassrooms[0][2] = 3334445;

        studentIDsInClassrooms[1] = new int[2];
        studentIDsInClassrooms[1][0] = 123;
        studentIDsInClassrooms[1][1] = 345;

        studentIDsInClassrooms[2] = new int[3];
        studentIDsInClassrooms[2][0] = 12333;
        studentIDsInClassrooms[2][1] = 343345;
        studentIDsInClassrooms[2][2] = 3257;

        //here an index helps identify classroom
        for (int r=0; r<studentIDsInClassrooms.length; r++) {
            System.out.print("Students IDS For Classroom " + r + " : ");
            for (int c=0; c<studentIDsInClassrooms[r].length; c++) {
                System.out.print(my2DArray[r][c] + " ");
            }
            System.out.print("\n");
        }

        for (int[] row : studentIDsInClassrooms) {
            System.out.print("Students IDS : ");
            for ( int col : row) {
                System.out.print(col + " ");
            }
            System.out.print("\n");
        }



    }
}