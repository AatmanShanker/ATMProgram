package ATMmethods;

import java.util.Scanner;

public class User{
  Scanner inp = new Scanner();

  static int userBal;
  static int userAge;
  static String userName;
  static String aadhaarId;

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
}
