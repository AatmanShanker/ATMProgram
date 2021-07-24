package ATMmethods;

import java.util.Scanner;

public class LoopMethods{

  Scanner scanInp = new Scanner(System.in);

  public void loopMethods(){

    System.out.print("Enter operation(S, D, W)for balance, withdrawal and deposit or \"C\" to cancel:");
    String userInput = scanInp.nextLine();

    while(!userInput.equals("C")){
      User user = new User();

      if (userInput.equals("S")) {

        user.showDetails();

        System.out.print("Do you want to do something again? or enter \"C\" to cancel:");
        String userInp = scanInp.nextLine();

        if (userInp.equals("Yes") || userInp.equals("yes")) {
          loopMethods();
        } else if(userInp.equals("C") || userInp.equals("c")){
          break;
        }

      }else if (userInput.equals("D")){

        user.depMoney();

        System.out.print("Do you want to do something again? or enter \"C\" to cancel:");
        String userInp2 = scanInp.nextLine();

        if (userInp2.equals("Yes") || userInp2.equals("yes")) {
          loopMethods();
        } else if(userInp2.equals("C") || userInp2.equals("c")){
          break;
        }

      }else if (userInput.equals("W")){

        user.withMoney();

        System.out.print("Do you want to do something again? or enter \"C\" to cancel:");
        String userInp3 = scanInp.nextLine();

        if (userInp3.equals("Yes") || userInp3.equals("yes")) {
          loopMethods();
        } else if(userInp3.equals("C") || userInp3.equals("c")){
          break;
        }
      }else{
        System.out.println("Invalid input!");
        break;
      }
    }
  }
}
