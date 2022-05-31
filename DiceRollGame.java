//RegNo: 3956-FBAS|BSCS4|F18
//Name: Muhammed Asim
//Section: (B)
//Assignment: (B)
package dicerollgame;//added it because I'm using netbeans****
import java.security.SecureRandom;
import java.util.Scanner;
public class DiceRollGame 
{
    public static void main(String[] args) {
        System.out.print("      DICE ROLL GAME\n");
        SecureRandom sr = new SecureRandom();
        Scanner sc = new Scanner(System.in);
        String p1, p2;
        int rand_tempNum1, rand_tempNum2, dice_sum, tempNum;
        
        System.out.println("Player1, Enter your name:");
        p1 = sc.next();
        System.out.println("Now Player2, Enter your name:");
        p2 = sc.next();
        
        rand_tempNum1 = Math.abs(sr.nextInt()%6)+1;
        System.out.println("Dice Rolled for Player1: "+rand_tempNum1);
        
        rand_tempNum2 = Math.abs(sr.nextInt()%6)+1;
        System.out.println("Dice Rolled for Player2: "+rand_tempNum2);
        
        dice_sum = rand_tempNum1 + rand_tempNum2;
        System.out.println("Where sum of Dices Rolled: "+dice_sum);
        
        //for player 1
        if(Math.abs((p1.length()-dice_sum))%2!=0){
            tempNum = Math.abs(sr.nextInt()%100);
            if(tempNum%2 != 0){
                System.out.println("As Dice Rolled is: "+tempNum+", so "+p1+" Won!");
            }else{
                System.out.println("As Dice Rolled is: "+tempNum+", so "+p1+" Lost!");
            }
        }else if((p1.length()-dice_sum)%2==0){
            tempNum = Math.abs(sr.nextInt()%100);
            if(tempNum%2 == 0){
                System.out.println("As Dice Rolled is: "+tempNum+", so "+p1+" Won!");
            }else{
                System.out.println("As Dice Rolled is: "+tempNum+", so "+p1+" Lost!");
            }
        }


        //for player 2
        if(Math.abs((p2.length()-dice_sum))%2!=0){
            tempNum = Math.abs(sr.nextInt()%100);
            if(tempNum%2 != 0){
                System.out.println("As Dice Rolled is: "+tempNum+", so "+p2+" Won!");
            }else{
                System.out.println("As Dice Rolled is: "+tempNum+", so "+p2+" Lost!");
            }
        }else if((p2.length()-dice_sum)%2==0){
            tempNum = Math.abs(sr.nextInt()%100);
            if(tempNum%2 == 0){
                System.out.println("As Dice Rolled is: "+tempNum+", so "+p2+" Won!");
            }else{
                System.out.println("As Dice Rolled is: "+tempNum+", so "+p2+" Lost!");
            }
        }
    }
    
}
