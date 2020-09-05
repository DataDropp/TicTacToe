package com.roboto.games.tictactoe;

public class checkAvailable {
    public static int checkAvailable(String[][] gameData,int[] coordinates){
        if(gameData[coordinates[0]][coordinates[1]].equals(" ")) return 1;
        return 0;
    }
}
