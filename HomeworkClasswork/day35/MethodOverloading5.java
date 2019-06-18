package day35;

public class MethodOverloading5 {
	 public static void main(String[] args) {
		  
		    // ANY literal non-fractional numbers will be seen as int 
		    // ANY literal fractional numbers will be seen as double     
//		    double d ; 
		//    
//		    d = 10 ; 
//		    System.out.println(d);
//		    d = 10L ; 
//		    System.out.println(d);
//		    d = 10F ; 
//		    System.out.println(d);
		    
		    release((byte)10);   // you are passing a byte first will call do we have exact byte method no we will look one level up short if not next level int we have it will printed 
		    
		    release((short)10); // go to int 
		    release(10); 
		    release(10L); // can be fit in  int no higher data ya gidicek 
		    release(10F); // go to double
//		    release(10d);// go to double
//		    release(10.5); //go to double
		    release(15/2); // will go to int int divide by anther int 
	    release(15/2.0);// duble gidicek float olmadan once ki hali 
		  }
		  
	 public static void release(float d) {
		    System.out.println("int "+ d);
		  }
		  
//		  public static void release(double d) {  bunu comment edip ustte gectik 
//		    System.out.println("double "+ d);  
//		  }
		  
		  public static void release(int d) {
		    System.out.println("int "+ d);
		  }
		  
		  
		  
		  
		  
		  // this method can take any argument of type int 
		  // or anything that can be stored inside int variable 
		  // for example short and bytes are allowed 
		  // but not long or double 
		  
		  

		}


