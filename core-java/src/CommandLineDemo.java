
public class CommandLineDemo {

	public static void main(String[] args) {
	  
      for(String a : args)
      {
    	  
    	  //System.out.println(a +"\n");
      }
      
      int x=5;
      Integer xo=x; //Boxing
      int z= xo;
      int sum=0;
      sum= x + xo * z; 
      System.out.println(sum );  // java takes care of boxing and unboxing hence auto boxing
      
	}

}
