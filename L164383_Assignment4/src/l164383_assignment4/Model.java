/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l164383_assignment4;

/**
 *
 * @author KHAWAJA ZEESHAUR
 */
public class Model {
    
    boolean gameStatus;
    boolean playerTurn;
    int[][] gameBoard=new int[3][3];
    
    Model(){
        
     gameStatus = true;   
     playerTurn = true;
     
     for(int i=0; i<3; i++)
         for(int j=0; j<3; j++)
             gameBoard[i][j] = 0;
    }
    
    public void setPlayerTurn(boolean pt){
        playerTurn = pt;
    }
    
    public void setGameBoard(int x, int y, int turn){
        gameBoard[x][y] = turn;
    }
    
    public boolean getPlayerTurn(){
        return playerTurn;
    }
    
    public int getGameBoard(int x, int y){
        return gameBoard[x][y];
    }
   
}
