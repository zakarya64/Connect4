public class Connect4
{

    
    public static void main(String[] args){
    
    GamePlay game = new GamePlay();
    Board boa = new Board();
    String userLetter = "R";
    String compLetter = "B";
    int turn = 1;
    while(game.noWinner() == true){
    
    turn++;    
    if(turn % 2 == 0){
    
    game.playerTurn(userLetter);
    
    }
    
    else{
    game.compTurn(compLetter);
    }
    
   
    
    
    
    
    
    }
    
    System.out.println("You win!");
    
    }
}
