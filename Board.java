public class Board
{
    private String[][] board;
    public Board(){
    
    board = new String[][]{{" ", " ", " ", " ", " ", " ", " "}, 
                        {" ", " ", " ", " ", " ", " ", " "}, 
                        {" ", " ", " ", " ", " ", " ", " "}, 
                        {" ", " ", " ", " ", " ", " ", " "}, 
                        {" ", " ", " ", " ", " ", " ", " "}, 
                        {" ", " ", " ", " ", " ", " ", " "}};
    
    }
    
    public void printBoard(){
    
        for(int r = 0; r < board.length; r++)
        {
            for(int c = 0; c < board[r].length; c++)
            {
                System.out.print("| " + board[r][c] + " |");
                
            }
            System.out.println("-----------------------");
        }
    
    }
    
    public int setBoard(String letter, int colNum){
    
    for(int r = board.length - 1; r >= 0; r--)
    {
        if(board[r][colNum] == " "){
        
        board[r][colNum] = letter;
        return 1;
        }
    }
    return -1;
    
    }
    
    public boolean verticalCheck(String letter){
    
    for (int r = 0; r < board.length - 3 ; r++ ){
        for (int c = 0; c < board[0].length; c++){
            if (board[r][c] == letter && board[r+1][c] == letter && board[r+2][c] == letter && board[r+3][c] == letter){
                return true;
            }           
        }
    }
    return false;
}
    
    public boolean horizontalCheck(String letter){
    
    for (int r = 0; r < board.length; r++ ){
        for (int c = 0; c < board[0].length - 3; c++){
            if (board[r][c] == letter && board[r][c+1] == letter && board[r][c+2] == letter && board[r][c+3] == letter){
                return true;
            }           
        }
    }
    return false;
    }
    
    public boolean diagonalCheck(String letter){
    
    for (int r = 3; r < board.length; r++ ){
        for (int c = 0; c < board[0].length - 3; c++){
            if (board[r][c] == letter && board[r-1][c+1] == letter && board[r-2][c+2] == letter && board[r-3][c+3] == letter){
                return true;
            }           
        }
    }
    return false;
    }
    
    public boolean reverseDiagonalCheck(String letter){
    
    for (int r = 0; r < board.length - 3; r++ ){
        for (int c = 0; c < board[0].length - 3; c++){
            if (board[r][c] == letter && board[r+1][c+1] == letter && board[r+2][c+2] == letter && board[r+3][c+3] == letter){
                return true;
            }           
        }
    }
    return false;
    
    
   }
   
   public boolean boardIsFull(){
    
   for(int r = 0; r < board.length; r++){
    
   for(int c = 0; c < board[0].length; c++){
       
    if(board[r][c] != " R " && board[r][c] != " B "){
    
    return false;
    
    
    }
    
   
   } 
    
    
   }
    
    return true;
   }
   
   
   
   
  
}
