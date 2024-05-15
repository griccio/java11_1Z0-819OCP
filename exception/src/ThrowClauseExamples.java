

public class ThrowClauseExamples{

	/**
	 * Create a Custom Runtime Exception
	 * this is an unchecked Exception
	 **/
	class CustomRuntimeException extends RuntimeException{

		CustomRuntimeException(String message){
			super(message);
		}
	}

	//create a Custom Exception  this is a Checked Exception

	class CustomException extends Exception{
		CustomException(String message){
			super(message);
		}
	}

	//create an Error
	class CustomError extends Error{
		CustomError(String message){
			super(message);
		}
	}

	//create a Custom Throwable 
	class CustomThrowable extends Throwable{
		CustomThrowable(String message){
			super(message);
		}
	}


	public static void main(String[] args){

		ThrowClauseExamples t = new ThrowClauseExamples();

		for(int i = 0; i<4; i++){

			try{
				switch(i){
				case 0:
					t.methodOne();
					break;
				case 1:
					t.methodTwo();
					break;

				case 2:
					t.methodThree();
					break;	

				case 3:
					t.methodFour();
					break;
				}
			}
			catch(RuntimeException | CustomThrowable | CustomException texc){
				System.out.println("In the catch clause of main" + texc);
			}

		}
	}


	private void methodOne(){
		throw new CustomRuntimeException("Error in methodOne");
	}

	private void methodTwo() throws CustomException{
		throw new CustomException("Error in methodTwo");
	}

	private void methodThree(){
		throw new CustomError("Error in methodThree");
	}

	private void methodFour() throws CustomThrowable{
		throw new CustomThrowable("Error in methodFour");
	}


}