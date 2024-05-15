
public class TryCatchExamples {

	public static void main(String[] args){
		
		TryCatchExamples te = new TryCatchExamples();
		te.printThreeStatement("Before Block" , 1);
		try{
			te.printThreeStatement("Into The Block", 1);
		}catch(Throwable t){
			t.printStackTrace(System.out);
			printErrorStructure(t);
		}
		te.printThreeStatement("After The Block", 0);
	}

	public static void printErrorStructure(Object o){

		Class parent  = o.getClass();
		String prefix = "";
		System.out.println("Error caught was: ");
		do{
			System.out.println(prefix + " " + parent.getName());
            prefix +="---";
			parent = parent.getSuperclass();
			if(parent == null) break;
		}while(parent.getSuperclass() != null);

	}


	public static void printThreeStatement(String section , int divisor){
		System.out.println(section + " Statement 1 is just fine");
		System.out.println(section + " Statement 2 throws an ArithmeticException" + 2/divisor);
		System.out.println(section + " Statement 3 is Fine but it is not executed");
	}
}
