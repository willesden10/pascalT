public class PascalT{
    //Prints a Pascal's triangle with a variable number of rows.
    public static void main(String[] aStrings){
        //TODO: User input for the number of rows.
        int rows = 10;

        //Array to store the numers or each row.
        int[] numbers = new int[rows];
        numbers[0] = 1;

        //Temporary array to calculate the current row's numbers from the previous row.
        int[] temp = new int[rows];
        temp[0] = 1;

        for(int row = 1; row <= rows; row++){

            //Print the offset for each row
            for(int i=0; i < rows - row; i++){
                System.out.print(" ");
            }

            //Populating the temp array
            for(int i=1; i<row; i++){
                temp[i] += numbers[i-1];
            }

            //Copying the temp array into numbers.
            for(int i=0; i<temp.length; i++){
                numbers[i] = temp[i];
            }

            //Prints the row's numbers from the numbers arrray.
            for(int i=0; i<row; i++){
                System.out.print(numbers[i] + " ");
            }

            //Change or line.
            System.out.println();
        }
    }
}