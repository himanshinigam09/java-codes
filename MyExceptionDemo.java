class MyException extends Exception{
	protected String s;
	MyException(String s){
		this.s=s;
	}
	public String toString(){
		return("you cannot enter this name " + s);
	}
}
public class MyExceptionDemo{
	void name(String n) throws MyException{
		if(n.equals("sam")){
			throw new MyException(n);
		}
        else{
        	System.out.println("name entered is " + n);
        }
	}
	public static void main(String[] args) {
		MyExceptionDemo ne=new MyExceptionDemo();
		try{
			ne.name("sam");
		}
		catch(MyException e){
			System.out.println(e);
		}
		
	}
	}
