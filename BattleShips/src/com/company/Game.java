package com.company;

import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		boolean exit = false;
	    Player player1 = new Player();
	    player1.inputName();

	    Player player2 = new Player();
	    player2.inputName();

	    Display display1 = new Display(player1, player2);
//	    Display display1 = new Display();

	    while (!exit){
			System.out.println("a)\n"+
								"b)\n"+
								"c)\n"+
								"d)");

			String choise = scn.next();
	    	switch (choise){
				case "a":{
					display1.viewDisplay();
					break;
				}
				case "b":{
					player1.createCrushBlock();
					player1.viewField();
					break;
				}
				case "c":{
					display1.drawBlock();
					break;
				}
				case "d":{
					player1.viewField();
					break;
				}
				case "exit":{
					exit = true;
					break;
				}
			}

			System.out.println("--------------------------");
		}
    }

}
