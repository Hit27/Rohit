import java.util.*;
public class practice {
static Scanner in;
static String [] board;
static String turn;
static boolean play;
   public static void main(String[] args)
   {
     in=new Scanner(System.in);
     board=new String[9];
     turn="X";
      play= true;
     for(int i=0;i<9;i++)
     {
       board[i]=String.valueOf(i+1);
     }
     System.out.println("\t\twelcome to tic tak game");
     System.out.println("--------------------------");
     System.out.println();
       print();
     System.out.println("X will play first");
     while(play)
     {
      int numInput;
      System.out.println("enter your slot no");
       
				numInput = in.nextInt();
				if (!(numInput > 0 && numInput <= 9))
				{
			System.out.println("Invalid input; re-enter slot number:");
			
			continue;	  
         }
     
     
     if (board[numInput-1].equals(String.valueOf(numInput)))
         {
				board[numInput-1] = turn;
				 print();
				play=check();
				if(check())
				{
				if (turn.equals("X"))
				 {
					turn = "O";
				}
				 else 
				 {
					turn = "X";
				}
				}
	       }
	else 
	     {
				System.out.println("Slot already taken; re-enter slot number:");
				continue;
			}
	if(!draw())
	{		
	play= draw();
	}
		if(check() && draw()){
		       comp();
		       }
       

      
    }
     
     if(!check())
     {
     System.out.println(turn+" is winner");
     }
     else 
     {
       System.out.println("match draw");
     }
 }
 
 
 static void comp()
 { 
 boolean m=true;
 System.out.println("computer turn  "+turn);
 while(m)
 {
 
     int numInput;
        numInput=(int)(1+(Math.random()*10));
          if (!(numInput > 0 && numInput <= 9))
    	{	
		  	
		  	continue;	  
         }
     
     
     if (board[numInput-1].equals(String.valueOf(numInput)))
         {System.out.println("computer chose slot "+numInput);
				board[numInput-1] = turn;
				 print();
				play=check();
				if(check())
				{
				if (turn.equals("X"))
				 {
					turn = "O";
				}
				 else 
				 {
					turn = "X";
				}
				}
	       }
	 else {
	      
	           continue;
                 }
              
                 m=false;
                  }
   }
   
static void print()
      {
 
		 System.out.println("\t" +board[0] + " | " +board[1] + " | " + board[2] );
		System.out.println("\t------------");
		System.out.println("\t"+board[3] + " | " +board[4] + " | " + board[5] );
		System.out.println("\t------------");
		System.out.println("\t"+board[6] + " | " +board[7] + " | " + board[8] );
   
 }
 
 static boolean check()
{
  if(board[0]==board[1] && board[1]==board[2])
  return false;
  if(board[3]==board[4] && board[4]==board[5])
  return false;
  if(board[6]==board[7] && board[7]==board[8])
  return false;
  if(board[0]==board[4] && board[4]==board[8])
  return false;;
  if(board[6]==board[4] && board[4]==board[2])
  return false;
  if(board[0]==board[3] && board[3]==board[6])
  return false;
  if(board[1]==board[4] && board[4]==board[7])
  return false;
  if(board[2]==board[5] && board[5]==board[8])
  return false;
  return true;
}
static boolean draw()
{
  if(!(board[0].equals("1")) && !(board[1].equals("2")) && !(board[2].equals("3")) && !(board[3].equals("4")) && !(board[4].equals("5")) && !(board[5].equals("6")) && !(board[6].equals("7")) && !(board[7].equals("8")) && !(board[8].equals("9")) )
 {return false;}
  return true;
}
 
 
}

