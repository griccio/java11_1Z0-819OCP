
class MyException extends Throwable{

    public MyException() {
        super();
    }

    public MyException(String message) {
        super(message);
    }
}


class MyRunTimeException extends RuntimeException{

    public MyRunTimeException() {
        super();
    }

    public MyRunTimeException(String message) {
        super(message);
    }
}

public class MySampleException {





    public static void main(String[] args){


    throw new MyRunTimeException("This is a RuntimeException");

//    try{
//        throw new  MyException("Hello this is my Exception");
//    }catch( MyException e){
//        System.out.println(e);
//    }


    }
}
