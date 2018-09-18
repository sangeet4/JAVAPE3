package pe3;

class SomeRandomException extends Exception{
    SomeRandomException(String s){
        super(s);
    }
}

public class ExceptionClass {
    public static void main(String args[]){
        try{
            System.out.println("In try block");
            throw new SomeRandomException("You will get some random exception");
        }
        catch(Exception e){
            System.out.println("In catch block: "+e);
        }
        finally{
            System.out.println("In finally block\nExiting main");
        }
    }

}
