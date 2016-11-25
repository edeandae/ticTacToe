import java.util.Arrays;
import java.util.Scanner; 
public class Game {
	public static void main(String[] args) {
        String[][] ticTacToe = new String[3][3];
        //initialize array 
        ticTacToe[0][0]= "a1"; 
        ticTacToe[0][1]= "a2";
        ticTacToe[0][2]= "a3";
        ticTacToe[1][0]= "b1";
        ticTacToe[1][1]= "b2";
        ticTacToe[1][2]= "b3";
        ticTacToe[2][0]= "c1";
        ticTacToe[2][1]= "c2";
        ticTacToe[2][2]= "c3";
        
        //prints array
        {for (int i = 0; i < ticTacToe.length; i++) {
            for (int j = 0; j < ticTacToe[i].length; j++) {
                System.out.print(ticTacToe[i][j] + " ");
            }
            System.out.println();
        }
        }
        
        System.out.println("This is a Tic Tac Toe, Please type the value that you wish to fill ");
        
        //starts the big loop
        for(int r=0; r<=5; r++) {
        System.out.println("Your turn");
        //reads Value & sets in in Array
        Scanner scan = new Scanner(System.in);
        String userInput = scan.next();
        for (int i=0; i<=2; i++){
        	 for (int j=0; j<=2; j++){
             	if (ticTacToe[i][j].equals(userInput)){
             		ticTacToe[i][j]="X";             		             	
             	} 	
             }
        }
        
        //printArray
        {for (int i = 0; i < ticTacToe.length; i++) {
            for (int j = 0; j < ticTacToe[i].length; j++) {
                System.out.print(ticTacToe[i][j] + " ");
            }
            System.out.println();
        }
        }
       
        
        //check winner
        {if (ticTacToe[0][0].equals("X") && ticTacToe[0][1].equals("X") && ticTacToe[0][2].equals("X")){
     		System.out.println("You Won");
        	return;}
        if (ticTacToe[1][0].equals("X") && ticTacToe[1][1].equals("X") && ticTacToe[1][2].equals("X")){
     		System.out.println("You Won");
     		return;}
        if (ticTacToe[2][0].equals("X") && ticTacToe[2][1].equals("X") && ticTacToe[2][2].equals("X")){
     		System.out.println("You Won");
     		return;}
        if (ticTacToe[0][0].equals("X") && ticTacToe[1][0].equals("X") && ticTacToe[2][0].equals("X")){
     		System.out.println("You Won");
     		return;}
        if (ticTacToe[0][1].equals("X") && ticTacToe[1][1].equals("X") && ticTacToe[2][1].equals("X")){
     		System.out.println("You Won");
     		return;}
        if (ticTacToe[0][2].equals("X") && ticTacToe[1][2].equals("X") && ticTacToe[2][2].equals("X")){
     		System.out.println("You Won");
     		return;}
        if (ticTacToe[0][0].equals("X") && ticTacToe[1][1].equals("X") && ticTacToe[2][2].equals("X")){
     		System.out.println("You Won");
     		return;}
        if (ticTacToe[0][2].equals("X") && ticTacToe[1][1].equals("X") && ticTacToe[2][0].equals("X")){
     		System.out.println("You Won");
     		return;}
     	} 
        
        { //check draw
        	if(ticTacToe[0][0].equals("a1")||ticTacToe[0][1].equals("a2")||ticTacToe[0][2].equals("a3")||ticTacToe[1][0].equals("b1")||ticTacToe[1][1].equals("b2")||ticTacToe[1][2].equals("b3")||ticTacToe[2][0].equals("c1")||ticTacToe[2][1].equals("c2")||ticTacToe[2][2].equals("c3")){
        	}   
        	else {
        		System.out.println("It´s a Draw");
        		return;
        	}
        }     
        
        System.out.println("My Turn");
      //MyMove
        { 
        	if(ticTacToe[0][0].equals("a1")){
        		ticTacToe[0][0]="O";
        	}
        	else if(ticTacToe[0][1].equals("a2")){
        		ticTacToe[0][1]="O";
        	}
        	else if(ticTacToe[0][2].equals("a3")){
        		ticTacToe[0][2]="O";
        	}
        	else if(ticTacToe[1][0].equals("b1")){
        		ticTacToe[1][0]="O";
        	}
        	else if(ticTacToe[1][1].equals("b2")){
        		ticTacToe[1][1]="O";
        	}
        	else if(ticTacToe[1][2].equals("b3")){
        		ticTacToe[1][2]="O";
        	}
        	else if(ticTacToe[2][0].equals("c1")){
        		ticTacToe[2][0]="O";
        	}
        	else if(ticTacToe[2][1].equals("c2")){
        		ticTacToe[2][1]="O";
        	}
        	else if(ticTacToe[2][2].equals("c3")){
        		ticTacToe[2][2]="O";
        	}   
        	
        }
        
      //printArray
        {for (int i = 0; i < ticTacToe.length; i++) {
            for (int j = 0; j < ticTacToe[i].length; j++) {
                System.out.print(ticTacToe[i][j] + " ");
            }
            System.out.println();
        }
        }
    
        //check winner
        {if (ticTacToe[0][0].equals("O") && ticTacToe[0][1].equals("O") && ticTacToe[0][2].equals("O")){
     		System.out.println("I Won");
     		return;}
        if (ticTacToe[1][0].equals("O") && ticTacToe[1][1].equals("O") && ticTacToe[1][2].equals("O")){
     		System.out.println("I Won");
     		return;}
        if (ticTacToe[2][0].equals("O") && ticTacToe[2][1].equals("O") && ticTacToe[2][2].equals("O")){
     		System.out.println("I Won");
     		return;}
        if (ticTacToe[0][0].equals("O") && ticTacToe[1][0].equals("O") && ticTacToe[2][0].equals("O")){
     		System.out.println("I Won");
     		return;}
        if (ticTacToe[0][1].equals("O") && ticTacToe[1][1].equals("O") && ticTacToe[2][1].equals("O")){
     		System.out.println("I Won");
     		return;}
        if (ticTacToe[0][2].equals("O") && ticTacToe[1][2].equals("O") && ticTacToe[2][2].equals("O")){
     		System.out.println("I Won");
     		return;}
        if (ticTacToe[0][0].equals("O") && ticTacToe[1][1].equals("O") && ticTacToe[2][2].equals("O")){
     		System.out.println("I Won");
     		return;}
        if (ticTacToe[0][2].equals("O") && ticTacToe[1][1].equals("O") && ticTacToe[2][0].equals("O")){
     		System.out.println("I Won");
     		return;}
     	} 
        
        { //check draw
        	if(ticTacToe[0][0].equals("a1")||ticTacToe[0][1].equals("a2")||ticTacToe[0][2].equals("a3")||ticTacToe[1][0].equals("b1")||ticTacToe[1][1].equals("b2")||ticTacToe[1][2].equals("b3")||ticTacToe[2][0].equals("c1")||ticTacToe[2][1].equals("c2")||ticTacToe[2][2].equals("c3")){
        	}   
        	else {
        		System.out.println("It´s a Draw");
        		return;
        	}
        }   
       
       //end big loop
        }
        	
	}
}
