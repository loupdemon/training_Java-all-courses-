//checked -> Exception
//Unchecked -> RuntimeException

public class InvalidAmountException extends Exception{
    public InvalidAmountException(){
        super("Invalid amount");
    }

    public InvalidAmountException(String message){
        super(message);
    }
}
