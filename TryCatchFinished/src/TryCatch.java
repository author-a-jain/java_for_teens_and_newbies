
public class TryCatch {

	public static void main(String[] args) {
		
		int a [ ] = new int[10];
	      try{
	         System.out.println("Access element three :" + a[11]);
	      }catch(ArrayIndexOutOfBoundsException e){
	         System.out.println("Inside ArrayIndexOutOfBoundsException Exception Catch Block :" );
	      }
	      finally{
	    	  System.out.println("Inside finally  Block. This gets executed ven after exception. Do some cleanup here." );
	        
	      }

	}

}
