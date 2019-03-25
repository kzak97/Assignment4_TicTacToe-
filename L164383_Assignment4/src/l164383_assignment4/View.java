/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l164383_assignment4;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author KHAWAJA ZEESHAUR
 */
public class View implements ActionListener{
    
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9;
    JFrame myframe;
    boolean flag = true;
    Controller control;
    
    View(){
         
        myframe= new JFrame();
        myframe.setTitle("Developed by Khawaja Zeeshaur");
        
        Container c = myframe.getContentPane();
        GridLayout layout = new GridLayout(3,3);
        c.setLayout(layout);
        
        b1 = new JButton("");
        b2 = new JButton("");
        b3 = new JButton("");
        b4 = new JButton("");
        b5 = new JButton("");
        b6 = new JButton("");
        b7 = new JButton("");
        b8 = new JButton("");
        b9 = new JButton("");
        
        c.add(b1);
        c.add(b2);
        c.add(b3);
        c.add(b4);
        c.add(b5);
        c.add(b6);
        c.add(b7);
        c.add(b8);
        c.add(b9);
        
        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myframe.setSize(500,500);
        myframe.setVisible(true);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        
        control = new Controller(new Model(), this);
    }
    
    public void showWinningMessage(String str){
        if(str == "O")
            JOptionPane.showMessageDialog(myframe, "***   Player 1 wins   ***");
        else if(str == "X")
            JOptionPane.showMessageDialog(myframe, "***   Player 2 wins   ***");
    }
    
    public void showDrawMessage(){
        JOptionPane.showMessageDialog(myframe, "Match Draw!");
    }
    
    public void showGameOverMessage(){
        JOptionPane.showMessageDialog(myframe, "This Game has been Over, Start a new one!");
    }
    
    public void setButtonText1(String str){
        b1.setText(str);
    }
    public void setButtonText2(String str){
        b2.setText(str);
    }
    public void setButtonText3(String str){
        b3.setText(str);
    }
    public void setButtonText4(String str){
        b4.setText(str);
    }
    public void setButtonText5(String str){
        b5.setText(str);
    }
    public void setButtonText6(String str){
        b6.setText(str);
    }
    public void setButtonText7(String str){
        b7.setText(str);
    }
    public void setButtonText8(String str){
        b8.setText(str);
    }
    public void setButtonText9(String str){
        b9.setText(str);
    }
    
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource() == b1){
            
            if(b1.getText() == ""){
                control.turnCompleted(0);
            }else{
                JOptionPane.showMessageDialog(myframe, "This Box has already been selected!");
            }
            
        }else if(ae.getSource() == b2){
            
            if(b2.getText() == ""){
                control.turnCompleted(1);
            }else{
                JOptionPane.showMessageDialog(myframe, "This Box has already been selected!");
            }
            
        }else if(ae.getSource() == b3){
            
            if(b3.getText() == ""){
                control.turnCompleted(2);
            }else{
                JOptionPane.showMessageDialog(myframe, "This Box has already been selected!");
            }
            
        }else if(ae.getSource() == b4){
            
            if(b4.getText() == ""){
                control.turnCompleted(3);
                
            }else{
                JOptionPane.showMessageDialog(myframe, "This Box has already been selected!");
            }
            
        }else if(ae.getSource() == b5){
            
            if(b5.getText() == ""){
                control.turnCompleted(4);
            }else{
                JOptionPane.showMessageDialog(myframe, "This Box has already been selected!");
            }
            
        }else if(ae.getSource() == b6){
            
            if(b6.getText() == ""){
                control.turnCompleted(5);
            }else{
                JOptionPane.showMessageDialog(myframe, "This Box has already been selected!");
            }
            
        }else if(ae.getSource() == b7){
            
            if(b7.getText() == ""){
                control.turnCompleted(6);
            }else{
                JOptionPane.showMessageDialog(myframe, "This Box has already been selected!");
            }
            
        }else if(ae.getSource() == b8){
            
            if(b8.getText() == ""){
                control.turnCompleted(7);
            }else{
                JOptionPane.showMessageDialog(myframe, "This Box has already been selected!");
            }
            
        }else if(ae.getSource() == b9){
            
            if(b9.getText() == ""){
                control.turnCompleted(8);
            }else{
                JOptionPane.showMessageDialog(myframe, "This Box has already been selected!");
            }
            
        }
    }
}
