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
public class Controller {

    Model model;
    View view;
    
    Controller(Model m, View v){
        model = m;
        view = v;
    }
    
    public void turnCompleted(int index){
        
        if(!model.gameStatus){
            view.showGameOverMessage();
            return;
        }
        
        String turn;
        
        if(model.getPlayerTurn())
            turn = "O";
        else
            turn = "X";
        
        boolean temp = (!model.getPlayerTurn());
        model.setPlayerTurn(temp);
        
        int x = index/3;
        int y = index%3;
        
        if(turn == "O")
            model.setGameBoard(x, y, 1);
        else if(turn == "X")
            model.setGameBoard(x, y, 2);
        
        
        switch(index){
            case 0:
                view.setButtonText1(turn);
                break;
            case 1:
                view.setButtonText2(turn);
                break;
            case 2:
                view.setButtonText3(turn);
                break;
            case 3:
                view.setButtonText4(turn);
                break;
            case 4:
                view.setButtonText5(turn);
                break;
            case 5:
                view.setButtonText6(turn);
                break;
            case 6:
                view.setButtonText7(turn);
                break;
            case 7:
                view.setButtonText8(turn);
                break;
            case 8:
                view.setButtonText9(turn);
                break;
            }
        
        for(int i=0; i<3; i++){
            if(model.gameBoard[i][0] == model.gameBoard[i][1] && model.gameBoard[i][1] == model.gameBoard[i][2] && model.gameBoard[i][0] != 0 ){
                view.showWinningMessage(turn);
                model.gameStatus = false;
                return;
            }
                
        }
        
        for(int i=0; i<3; i++){
            if(model.gameBoard[0][i] == model.gameBoard[1][i] && model.gameBoard[1][i] == model.gameBoard[2][i] && model.gameBoard[0][i] != 0 ){
                view.showWinningMessage(turn);
                model.gameStatus = false;
                return;
            }
                
        }
        
        if(model.gameBoard[0][0] == model.gameBoard[1][1] && model.gameBoard[1][1] == model.gameBoard[2][2] && model.gameBoard[0][0] != 0 ){
            view.showWinningMessage(turn);
            model.gameStatus = false;
            return;
        }
        if(model.gameBoard[0][2] == model.gameBoard[1][1] && model.gameBoard[1][1] == model.gameBoard[2][0] && model.gameBoard[0][2] != 0 ){
            view.showWinningMessage(turn);
            model.gameStatus = false;
            return;
        }
        
        boolean gameOver = true;
            
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(model.gameBoard[i][j] == 0){
                    gameOver = false;
                }
            }
        }
        
        if(gameOver){
            view.showDrawMessage();
            model.gameStatus = false;
        }
    }
    
    
}
