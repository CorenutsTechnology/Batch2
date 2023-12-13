package lambdaexpression08DEC;
import java.util.function.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringCheck stringCheck=(s)->{if(s.isEmpty())
			                              return true;
		                                   return false;};
		    System.out.println(stringCheck.is_Empty("Hello"));
		    
		    
		    ChangeCase changeCase=(s)->{  
		    	                        return s.toUpperCase(); };
		    System.out.println(changeCase.change("hello"));     
		    
		    PrintNumbers printNumbers=(a)->{   for(int i=1;i<=10;i++)
		    	                                   System.out.println(i);
		    	
		    };
		    	printNumbers.print(10); 
		  //predicate will accept one argument and return boolean
		  Predicate p=(o)->{ String s=(String)o;
			  if(s.isEmpty())
              return true;
          return false;};
          
          System.out.println(p.test("Hello"));
          
          //fuction will accept one argument and return one value
          Function fun=(o)->{
        	  String s=(String)o;
        	  return s.toLowerCase();
          };
          System.out.println(fun.apply("Hello"));
          
          //consumer will accept one argument and return void
          Consumer consumer=(a)->{
        	  System.out.println(a);
          };
          consumer.accept(20);
          
          //supplier will not have no arguments and one value
          Supplier supplier=()->{return "Supplier";};
          supplier.get();
	

  }
}
