class Main extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
   public void run(){
       happy();
       happy();
       //System.out.println("Happy birthday, dear Fred!");
       dear("Stefan");
       happy();
   }

  private void happy(){
    System.out.println("Happy birthday to you!");
   }

  /**
  * output happy birthday to a specified name
  * @param name - The name of the person to sing to
  */
  private void dear(String strName){
    System.out.println("Happy birthday, dear " + strName +"! ");
  }

}