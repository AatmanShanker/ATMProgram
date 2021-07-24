import ATMmethods.*;

public class MyApp{

  public static void main(String[] args){
    //Making some objects
    User user = new User();
    LoopMethods loopMeth = new LoopMethods();

    user.makeUserAcc();
    loopMeth.loopMethods();
  }
}
