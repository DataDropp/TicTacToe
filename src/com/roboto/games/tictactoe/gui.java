package com.roboto.games.tictactoe;

import javax.swing.*;
import java.awt.event.*;
import javax.swing.plaf.metal.*;
import javax.swing.table.DefaultTableModel;

public class gui extends JDialog {
    private JPanel contentPane;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private static final String[] titles = {" "," "," "};
    private static String[][] gameData = {
            {" "," "," "},
            {" "," "," "},
            {" "," "," "},
    };
    private static int playerTurn = 0; //0 = O | 1 = X
    private JTable table1;
    private JLabel playerLabel;


    private void sendToTable(String[][] gameData){
        DefaultTableModel tableModel = new DefaultTableModel(gameData,titles);
        table1.setModel(tableModel);
        if(playerTurn == 0) playerLabel.setText("Player: X");
        if(playerTurn == 1) playerLabel.setText("Player: O");
    }
    public gui() {
        if(playerTurn == 0) playerLabel.setText("Player: X");
        if(playerTurn == 1) playerLabel.setText("Player: O");
        setContentPane(contentPane);
        sendToTable(gameData);
        setModal(true);
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int[] coordinates = {0,0};
                if(checkAvailable.checkAvailable(gameData,coordinates) != 1) return;
                if(playerTurn == 1) {
                    gameData[coordinates[0]][coordinates[1]] = "X";
                    sendToTable(gameData);
                    playerTurn = 0;
                    return;
                }
                if(playerTurn == 0) {
                    gameData[coordinates[0]][coordinates[1]] = "O";
                    sendToTable(gameData);
                    playerTurn = 1;
                    return;
                }
                Main.game(gameData);
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int[] coordinates = {0,1};
                if(checkAvailable.checkAvailable(gameData,coordinates) != 1) return;
                if(playerTurn == 1) {
                    gameData[coordinates[0]][coordinates[1]] = "X";
                    sendToTable(gameData);
                    playerTurn = 0;
                    return;
                }
                if(playerTurn == 0) {
                    gameData[coordinates[0]][coordinates[1]] = "O";
                    sendToTable(gameData);
                    playerTurn = 1;
                    return;
                }
                Main.game(gameData);
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int[] coordinates = {0,2};
                if(checkAvailable.checkAvailable(gameData,coordinates) != 1) return;
                if(playerTurn == 1) {
                    gameData[coordinates[0]][coordinates[1]] = "X";
                    sendToTable(gameData);
                    playerTurn = 0;
                    return;
                }
                if(playerTurn == 0) {
                    gameData[coordinates[0]][coordinates[1]] = "O";
                    sendToTable(gameData);
                    playerTurn = 1;
                    return;
                }
                Main.game(gameData);
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int[] coordinates = {1,0};
                if(checkAvailable.checkAvailable(gameData,coordinates) != 1) return;
                if(playerTurn == 1) {
                    gameData[coordinates[0]][coordinates[1]] = "X";
                    sendToTable(gameData);
                    playerTurn = 0;
                    return;
                }
                if(playerTurn == 0) {
                    gameData[coordinates[0]][coordinates[1]] = "O";
                    sendToTable(gameData);
                    playerTurn = 1;
                    return;
                }
                Main.game(gameData);
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int[] coordinates = {1,1};
                if(checkAvailable.checkAvailable(gameData,coordinates) != 1) return;
                if(playerTurn == 1) {
                    gameData[coordinates[0]][coordinates[1]] = "X";
                    sendToTable(gameData);
                    playerTurn = 0;
                    return;
                }
                if(playerTurn == 0) {
                    gameData[coordinates[0]][coordinates[1]] = "O";
                    sendToTable(gameData);
                    playerTurn = 1;
                    return;
                }
                Main.game(gameData);
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int[] coordinates = {1,2};
                if(checkAvailable.checkAvailable(gameData,coordinates) != 1) return;
                if(playerTurn == 1) {
                    gameData[coordinates[0]][coordinates[1]] = "X";
                    sendToTable(gameData);
                    playerTurn = 0;
                    return;
                }
                if(playerTurn == 0) {
                    gameData[coordinates[0]][coordinates[1]] = "O";
                    sendToTable(gameData);
                    playerTurn = 1;
                    return;
                }
                Main.game(gameData);
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int[] coordinates = {2,0};
                if(checkAvailable.checkAvailable(gameData,coordinates) != 1) return;
                if(playerTurn == 1) {
                    gameData[coordinates[0]][coordinates[1]] = "X";
                    sendToTable(gameData);
                    playerTurn = 0;
                    return;
                }
                if(playerTurn == 0) {
                    gameData[coordinates[0]][coordinates[1]] = "O";
                    sendToTable(gameData);
                    playerTurn = 1;
                    return;
                }
                Main.game(gameData);
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int[] coordinates = {2,1};
                if(checkAvailable.checkAvailable(gameData,coordinates) != 1) return;
                if(playerTurn == 1) {
                    gameData[coordinates[0]][coordinates[1]] = "X";
                    sendToTable(gameData);
                    playerTurn = 0;
                    return;
                }
                if(playerTurn == 0) {
                    gameData[coordinates[0]][coordinates[1]] = "O";
                    sendToTable(gameData);
                    playerTurn = 1;
                    return;
                }
                Main.game(gameData);
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int[] coordinates = {2,2};
                if(checkAvailable.checkAvailable(gameData,coordinates) != 1) return;
                if(playerTurn == 1) {
                    gameData[coordinates[0]][coordinates[1]] = "X";
                    sendToTable(gameData);
                    playerTurn = 0;
                    return;
                }
                if(playerTurn == 0) {
                    gameData[coordinates[0]][coordinates[1]] = "O";
                    sendToTable(gameData);
                    playerTurn = 1;
                    return;
                }
                Main.game(gameData);
            }
        });
    }

    private void onOK() {
        dispose();
    }
    private void onCancel() {
        dispose();
    }
    public static void main() {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        gui dialog = new gui();
        dialog.setTitle("Tic Tac Toe");
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
