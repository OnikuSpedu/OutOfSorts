public class DebugPrint{
    public static boolean DEBUG = true;
  
    public static void dprint(String s){
      if(DEBUG){
        System.out.println(s);
      }
    }

    public static void main(String[]args){
      //do this so you do not forget to turn it off
      dprint("TURN THIS OFF BEFORE SUBMITTING YOUR CODE!!!!!!!!");
    }
  }
  