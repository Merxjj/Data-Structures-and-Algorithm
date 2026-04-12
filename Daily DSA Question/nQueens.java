public class nQueens {


    public static void board(char[][] board,int row){
        if(row == board.length){
            printArray(board);
            return;
        }

        for(int j = 0;j<board.length;j++){
            if(isSafe(board, row, j))
            {
            board[row][j] = 'Q';
            board(board,row+1);
            board[row][j] = 'x';
        }
    }
    }

    public static boolean isSafe(char[][] board, int row , int col){

        // vertical 
        for(int i = row-1;i>=0;i--){
            
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //left diagonal up 
        for(int i = row-1,j=col-1;i>=0&&j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
            
        }
        //right diagonal up 
        for(int i = row-1,j=col+1;i>=0&&j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static void printArray(char[][] arr){


        System.out.println("chess board  combinations :    ");
        for(int i = 0;i<arr.length;i++){

            for(int j = 0;j<arr.length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 5;
        char[][] board = new char[n][n];
        for(int i= 0;i<board.length;i++){
            for(int j= 0;j<board.length;j++){
                board[i][j] = 'x';
            }

        }

        board(board,0);
    }
    
}
