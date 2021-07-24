import ATMmethods.*;

public class MyApp{

  public static void main(String[] args){
    //Making some objects
    AtmMethod atmMethod = new AtmMethod();
    LoopMethods loopMeth = new LoopMethods();

    atmMethod.makeUserAcc();
    loopMeth.loopMethods();
  }
}
