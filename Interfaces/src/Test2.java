import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) {

        public class PFinal1 {

            public static double sumMajorDiagonal(double[][] m) {

                double sum = 0;

                for (int = 0; i < m[0].length;i++)  {

                    for (int j=0;j<m[0].length;j++)  {

                        if (i==j)   {

                            sum = sum + m[i][j];

                        }
                    }
                }

                //finally return the sum
                return sum;

            }

            public static void main(String[] args) {

                int n = 4;

                Scanner input = new Scanner(System.in);

                //declare a n x n matrix
                double[][] matrix = new double[n][n];

                System.out.printf("Enter a 4-by-4 matrix row by row:");

                //take input for n x n matrix by iterating for loop for both rows and columns
                for (int i=0;i<n;i++)  {

                    for (int j=0;j<n;j++)

                    {
                        matrix[i][j] = input.nextDouble();
                    }
                }

                //calling sumMajorDiagonal() function and store the returned result
                double sum_value = sumMajorDiagonal(matrix);

                //print the final sum value
                System.out.printf("The sum of major diagonal elements in the given array is %.1f",sum_value);

            }

        }
    }
}
