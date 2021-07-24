package ATMmethods;

import java.util.Scanner;

public class User{
  
  static int userBal;
  static int userAge;
  static String userName;
  static String aadhaarId;

  Scanner inp = new Scanner(System.in);

  //Function for making user account
  public void makeUserAcc(){

    System.out.println("Welcome to ATM!\n");

    System.out.print("Enter name:");
    userName = inp.nextLine();

    System.out.print("Enter age:");
    userAge= inp.nextInt();

    System.out.print("Enter Aadhaar ID:");
    aadhaarId = inp.next();

    if (aadhaarId.length() < 12 || aadhaarId.length() > 12) {
      System.out.println("Invalid ID!");
      System.exit(0);
    }else if(userAge <= 18){
      System.out.println("User should be more than 18 years old!");
      System.exit(0);
    }else if(userAge <= 18 && aadhaarId.length() < 12){
      System.out.println("Invalid Aadhaar and Age!");
      System.exit(0);
    }
  }

  public void withMoney(){

    System.out.print("Enter the money to withdraw:");
    int withInp = inp.nextInt();

    userBal -= withInp;
  }

  public void depMoney(){

    System.out.print("Enter the money to deposit:");
    int depInp = inp.nextInt();

    userBal += depInp;
  }

  public void showDetails(){
       System.out.println("===========================");
       System.out.println("\nName:" + userName);
       System.out.println("Age:" + userAge);
       System.out.println("ID:" + aadhaarId);
       System.out.println("Balance:" + userBal + "\n");
       System.out.println("===========================");
    }
}
