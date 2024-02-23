public class DiagonalSum {

    public static int Diagonal(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
            sum += matrix[i][matrix.length - 1 - i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        int sum = Diagonal(matrix);
        System.out.println(sum);
    }
}
