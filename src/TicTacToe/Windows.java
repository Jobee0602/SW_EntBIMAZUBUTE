package TicTacToe;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import TicTacToe.TicTacToe;

public class Windows extends JFrame{
    private JButton button1;
    private JButton button2;
    private JButton button6;
    private JButton button9;
    private JButton button3;
    private JButton button5;
    private JButton button4;
    private JButton button7;
    private JButton button8;
    private JPanel panel1;
    private TicTacToe game;

    private void createUIComponents() {

    }

    public Windows(TicTacToe pGame){
        game = pGame;
        this.setVisible(true);
        setSize(300,300);
        add(panel1);
        createButtons();
    }

    private String getButtonContent(int row, int col){
        switch(game.getBoard(row, col)){
            case Unknown: return "-";
            case O: return "O";
            case X: return "X";
            default: return "Error";
        }
    }

    private void createButtons(){
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                game.play(0,0);
                button1.setText(getButtonContent(0,0));
                gameChecker();
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                game.play(1,0);
                button2.setText(getButtonContent(1,0));
                gameChecker();
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                game.play(2,0);
                button3.setText(getButtonContent(2,0));
                gameChecker();
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                game.play(0,1);
                button4.setText(getButtonContent(0,1));
                gameChecker();
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                game.play(1,1);
                button5.setText(getButtonContent(1,1));
                gameChecker();
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                game.play(2,1);
                button6.setText(getButtonContent(2,1));
                gameChecker();
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                game.play(0,2);
                button7.setText(getButtonContent(0,2));
                gameChecker();
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                game.play(1,2);
                button8.setText(getButtonContent(1,2));
                gameChecker();
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                game.play(2,2);
                button9.setText(getButtonContent(2,2));
                gameChecker();
            }
        });
    }

    private void gameChecker(){
        if(game.isGameWon()){
            System.out.println(game.getWinner() + " won");
        }
        else if(game.isDraw()){
            System.out.println("Its a draw");
        }
    }
}
