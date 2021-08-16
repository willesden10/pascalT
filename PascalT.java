public class PascalT{
    //Prints a Pascal's triangle with a variable number of rows.
    public static void main(String[] aStrings){
        //TODO: User input for the number of rows.
        int rows = 8;

        for(int row = 1; row <= rows; row++){

            //Print the offset for each row
            for(int i=0; i < rows - row; i++){
                System.out.print(" ");
            }

            //Prints 1s in each line to check that ge get a triangle
            for(int i=0; i<row; i++){
                System.out.print("1 ");
            }

            //Change or line.
            System.out.println();
        }
    }
}