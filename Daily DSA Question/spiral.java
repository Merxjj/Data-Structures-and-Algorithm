public class spiral {
    public static void main(String[] args) {
        int n= 3;
       /*  int[][] arr = {
    {1,2,3},
    {4,5,6},
    {7,8,9}};*/

    int [][] arr =
    {
        {1,2,3,4},
        {5,6,7,8},
        {9,10,11,12},
        {13,14,15,16}
    };
    for(int i = 0;i<arr.length;i++){
        for(int j = 0 ;j<arr.length ;j++){
            System.out.print(arr[i][j]+"");
        }
        System.out.println();
    }


    int startRow = 0;
    int startCol = 0;
    int endRow = arr.length-1;
    int endCol = arr.length-1;


    while(startRow<=endRow&& startCol<=endCol){
        for(int j = startCol;j<=endCol;j++){
            System.out.println(arr[startRow][j]);

        }
        for(int i = startRow+1;i<=endRow;i++){
            System.out.println(arr[i][endCol]);
        }
        for(int j = endCol-1;j>=startCol;j--){
            if(startCol == endCol) break;
            System.out.println(arr[endRow][j]);
        }
        for(int i = endRow-1;i>startRow;i--){
            if(startRow==endRow) break;
            System.out.println(arr[i][startCol]);
        }
        startRow++;
        startCol++;
        endCol--;
        endRow--;
    }



    }
    
}
