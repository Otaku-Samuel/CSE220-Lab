//Assignment Task 02: Matrix Compression
class AssgnTask2{

    //Complete this method so that it gives the Expected Output
    //YOU ONLY HAVE TO SUBMIT THIS METHOD, NO OTHER DRIVER CODE
    public static Integer[][] compressMatrix( Integer[][] matrix ){
        
        //For this task you'll need to create new 2D array
        int x=matrix.length/2;
        int row=0;
        int col=0;
        Integer[][] comp = new Integer[x][x];
        for(int i=0; i<matrix.length; i+=2){
            for(int j=0; j<matrix.length; j+=2){
                int sum=matrix[i][j] + matrix[i][j+1] + matrix[i+1][j] + matrix[i+1][j+1] ;
                comp[row][col]=sum;
                col++;
            }
            row++;
            col=0;
        }
        //TO DO

        //remove the line below and return the newly created Compressed 2D matrix
        return comp;
    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[][] matrix = {
            { 1 , 2 , 3 , 4 },
            { 5 , 6 , 7 , 8 },
            { 1 , 3 , 5 , 2 },
            {-2 , 0 , 6 ,-3 }
        };
        System.out.println("Given Matrix: ");
        Arr.print2D(matrix);
        
        System.out.println("\nExpected Output:");
        System.out.print("| 14 | 22 |\n| 2  | 10 |\n");
        
        System.out.print("\nYour Output:\n");
        Integer[][] returnedArray = compressMatrix( matrix );
        Arr.print2D( returnedArray );
    }
}
