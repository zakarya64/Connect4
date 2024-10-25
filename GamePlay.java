import java.util.Scanner;
public class GamePlay
{
    private Board boa;
    
    public GamePlay(){
    
    boa = new Board();
    
    }
    
    public int askForCol(){
    Scanner reader = new Scanner(System.in);
    System.out.println("Pick a column: ");
    int col = reader.nextInt();
    return col;
    
    }
    
    public static int getComputerCol(){
    
    int col = (int) (Math.random() * 7) + 1;
    return col;
    }
    
    public void playerTurn(String user){
     
    int column = askForCol();
    boa.setBoard(user, column);
    boa.printBoard();
    
    }
    
    public void compTurn(String user){
     
    int colu = getComputerCol();
    boa.setBoard(user, colu);
    boa.printBoard();
    
    }
    
    public boolean hasWinner(String letter){
    
    if(boa.verticalCheck(letter) && boa.horizontalCheck(letter) && boa.diagonalCheck(letter) && boa.reverseDiagonalCheck(letter)){
    
    
    return true;
    
    }
    
    else{
    
    return false;
    
    }
    
    
    }
    
    public boolean noWinner(){
        
    String letter = " ";    
    
    if(hasWinner(letter) && boa.boardIsFull() == false){
    
    return true;
    
    }
    
    else{
    
    return false;
    }
    
    
    }
    
    

}
