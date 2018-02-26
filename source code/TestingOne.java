class TestingOne {
    
      int x = 10;
      static int y = 20;

      void doit() {
      System.out.println ("Hi");
      }

       static void dontDo() {
       System.out.println ("Bye");
       }
     
public static void main(String args[]) {

       TestingOne t1 = new TestingOne();
       System.out.println("x : " +t1.x);        //object can call variable
       //doit();          //can' call because instance variable
       t1.doit();
       dontDo();
    }
}
