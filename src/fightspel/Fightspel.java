/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fightspel;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random; 
/**
 *
 * @author georgios.theodosiad
 */
public class Fightspel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
    
    System.out.println("Welcome to Java Fight! ");
    System.out.println(" ");
    
    System.out.println("Please enter 1 or 2 ");
    System.out.println(" ");
        
    int MyHealth = 100; //skapar int för sin health
    
    int OppHealth = 100; //skapar int för opp health 
    
    boolean game = true;    //skapar loops för varje gång vi ska göra ngt 
    
     while(game)  //while loop
     {
        boolean loop = true;
        
        while(loop)
        {
         
        try  //om något går fel
        {
            System.out.println("1 to punch");
            System.out.println("2 to kick");
            
            
        Scanner sc = new Scanner(System.in);     //addar scanner för att leta efter inputs
        
        int num1 = sc.nextInt();
        
        if(num1 == 1)
        {
        System.out.println("You punched your opponent");
        System.out.println(" ");  //för att det ska vara mellanrum mellan varje input
        
        
        Random rnd1 = new Random();//lägger in random tal generator för att slumpa tal, critical slag eller olika slags damage

        
        int PunchAttk;
        PunchAttk = rnd1.nextInt(5); //lägger in 5 random values
        
        switch(PunchAttk)//lägger in switch för att slå vid en random value och hur mycket HP det kommer ta från motståndaren
        {
            case 0://addar loop för att ta bort motståndarens hp (addar 5 cases)
             for(int a = 1; a<= 15; a++)  //a<= 15 kommer ta bort 15 hp
            {
            OppHealth--;  
            }

            break; //om den hittar inte någon siffra 1-4 så kommer det loopas om
            
            
            case 1:
            for(int a = 1; a<= 15; a++)
            {
            OppHealth--;
            }
            break; 
            
            
            case 2:     
            for(int a = 1; a<= 15; a++)
            {
            OppHealth--;
            }
            break;
            
            case 3:
            for(int a = 1; a<= 15; a++)
            {
            OppHealth--;
            }
            break;
            
            
            case 4:  //kommer vara critical damage
            for(int a = 1; a<= 20; a++)
            {
            OppHealth--;
            }
            System.out.println("Critical Hit");
            break;
            
            default: //om en av talen inte hittas så loopas inputen igen tills det hittar en siffra
            break;
                
                
                
    }//switch slutar

        System.out.println("Your opponents health is " + OppHealth);
        System.out.println(" ");

 }
 else if(num1 == 2)
 {
 System.out.println("You kicked your opponent ");
 System.out.println(" ");
 

 
Random rnd2 = new Random();//addar en till/annan random value
int KickAttk;
KickAttk = rnd2.nextInt(5);


switch(KickAttk)
 {

  case 0:
for(int a = 1; a<= 10; a++)
{
OppHealth--;
}
break; 
    
  case 1:
for(int a = 1; a<= 10; a++)
{
OppHealth--;
}
break; 

  case 2:
for(int a = 1; a<= 10; a++)
{
OppHealth--;
}
break; 

  case 3:
for(int a = 1; a<= 10; a++)
{
OppHealth--;
}
break; 

  case 4:
for(int a = 1; a<= 30; a++)
{
OppHealth--;
}
System.out.println("Critical Hit");
break; 
 }//andra switch slutar


System.out.println("Your opponents health is " + OppHealth); //visar motståndarens HP
System.out.println(" ");  

if(OppHealth <= 0)    //om Opphealth är lika med eller mindre än 0 kommer spelet va klar
{

    System.out.println("You win!"); //försöka göra en loop senare?
    
    game = false; //vi måste ha något som göras att kodet ska slutas köra av sig själv 
    
    System.exit(0);  //gör så att spelet stängs när HP <= 0
    
}else{
    break;
}
    
}//if slutar       
        }//try slutar    
catch (InputMismatchException e)    
         {
            System.err.println("Wrong input, try again");
         }     
}
//Motståndares ska attackera här

Random rnd3 = new Random();

int atk;

atk = rnd3.nextInt(6);  //har 6 olika values 
        
switch(atk)
{
    case 0:
        System.out.println("Your opponent punched you");
        System.out.println("Your opponent dealt 15 HP");
        System.out.println(" ");
        for(int c = 1; c < 15; c++)
        {
        MyHealth--;
        }
        break;
        
    case 1:
        System.out.println("Your opponent punched you");
        System.out.println("Your opponent dealt 15 HP");
        System.out.println(" ");
        for(int c = 1; c < 15; c++)
        {
        MyHealth--;
        }
        break;
        
    case 2:
        System.out.println("Your opponent punched you");
        System.out.println("Critical Hit!");
        System.out.println("Your opponent dealt 20 HP");
        System.out.println(" ");
        for(int c = 1; c < 20; c++)
        {
        MyHealth--;
        }
        break;
        
    case 3:
        System.out.println("Your opponent kicked you");
        System.out.println("Your opponent dealt 10 HP");
        System.out.println(" ");
        for(int c = 1; c < 10; c++)
        {
        MyHealth--;
        } 
        break;
    case 4:
        System.out.println("Your opponent kicked you");
        System.out.println("Your opponent dealt 10 HP");
        System.out.println(" ");
        for(int c = 1; c < 10; c++)
        {
        MyHealth--;
        } 
        break;
        
    case 5:
        System.out.println("Your opponent kicked you");
        System.out.println("Critical Hit!");
        System.out.println("Your opponent dealt 40 HP");
        System.out.println(" ");
        for(int c = 1; c < 25; c++)
        {
        MyHealth--;
        }  
        break;
        
    default:
        break;
        
        
}

System.out.println("Your HP is "+ MyHealth);

if(MyHealth <=0)
{
    System.out.println("You lose, Try again next time!");
    System.out.println(" ");
    
    game = false;
    
}else if (MyHealth >=1)
{ 
game = true;    
}   
    
     } //while slutar     
    }//public static void slutar
}  //public class fightspel slutar
