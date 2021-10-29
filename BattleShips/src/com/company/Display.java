package com.company;

public class Display {
    private Player player1;
    private Player player2;

    private String[][] map = new String[10][25];
    private static final String NOTHING = "   ";

//    Display(){
//        for (int i = 0; i < map.length; i++) {
//            for (int j = 0; j < map[i].length; j++) {
//                System.out.print(" D ");
//            }
//            System.out.println("");
//        }
//    }

    Display(Player player1, Player player2){
        String[][] p1 = player1.getField();
        String[][] p2 = player1.getField();
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {

                if(j < 10){
                    map[i][j] = p1[i][j];
                }else if(j <= 14){
                    map[i][j] = NOTHING;
                }else{
                    map[i][j] = p2[i][j-15];
                }
//                map[i][j] = (j <10)?p1[i][j]:NOTHING;
//                map[i][j] = (j > 14)?p1[i][j-15]:NOTHING;
            }
        }
    }

    public void viewDisplay(){
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println("");
        }
    }

    public void drawBlock(){
        player1.createBlock();
    }
}
