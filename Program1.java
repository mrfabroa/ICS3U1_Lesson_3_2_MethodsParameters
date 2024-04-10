class Program1 extends ConsoleProgram {

   /**
  * Description
  * @author:
  */
  
  public void run(){

    String strCelebrant;

    strCelebrant = readLine("Who's birtday is it? ");

    happy();
    happy();
    dear(strCelebrant);
    happy();

    area(5,4);
  }

  /**
   * Say the happy birthday line
   */
  private void happy(){
    System.out.println("Happy Birthday to you!");
  }


  /**
  * output happy birthday to a specified name
  * @param name - The name of the person to sing to
  */
  private void dear(String strName){
    System.out.println("Happy Birthday dear " + strName + "!");
  }

  private void area(int length, int width){
    System.out.println(length * width);
  }

}
