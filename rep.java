import java.util.Scanner;
public class rep {

  public static void main(String[] args) {
 String T="Hello UserName,how r u?";
 Scanner s= new Scanner(System.in);
 System.out.println("enter u r name");
 String s1=s.nextLine();
 
 if(s1.length()<3)
 { do{
   System.out.println("name should be minimum 3 charecter");
   
   
     System.out.println("enter your name");
     s1=s.nextLine();
   }while(s1.length()<3);
 }
 System.out.println(T.replace("UserName",s1));

  }

}

