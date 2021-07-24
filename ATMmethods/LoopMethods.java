package ATMmethods;

import java.util.Scanner;

public class LoopMethods{

  Scanner scanInp = new Scanner(System.in);

  public void loopMethods(){

    AtmMethod atmMeth = new AtmMethod();

    System.out.print("Enter operation(S, D, W)for balance, withdrawal and deposit or \"C\" to cancel or \"M\" to make a new account:");
    String userInput = scanInp.nextLine();

    while(!userInput.equals("C")){

      if (userInput.equals("S")) {

        atmMeth.showDetails();

        System.out.print("Do you want to do something again? or enter \"C\" to cancel:");
        String userInp = scanInp.nextLine();

        if (userInp.equals("Yes") || userInp.equals("yes")) {
          loopMethods();
        } else if(userInp.equals("C") || userInp.equals("c")){
          break;
        }

      }else if (userInput.equals("D")){

        atmMeth.depMoney();

        System.out.print("Do you want to do something again? or enter \"C\" to cancel:");
        String userInp2 = scanInp.nextLine();

        if (userInp2.equals("Yes") || userInp2.equals("yes")) {
          loopMethods();
        } else if(userInp2.equals("C") || userInp2.equals("c")){
          break;
        }

      }else if (userInput.equals("W")){

        atmMeth.withMoney();

        System.out.print("Do you want to do something again? or enter \"C\" to cancel:");
        String userInp3 = scanInp.nextLine();

        if (userInp3.equals("Yes") || userInp3.equals("yes")) {
          loopMethods();
        } else if(userInp3.equals("C") || userInp3.equals("c")){
          break;
        }
      }else if (userInput.equals("M")){

        atmMeth.makeUserAcc();
        System.out.println("Made a new account!");

        System.out.print("Do you want to do something again? or enter \"C\" to cancel:");
        String userInp3 = scanInp.nextLine();

        if (userInp3.equals("Yes") || userInp3.equals("yes")) {
          loopMethods();
        } else if(userInp3.equals("C") || userInp3.equals("c")){
          break;
        }
      }
    }
  }
}