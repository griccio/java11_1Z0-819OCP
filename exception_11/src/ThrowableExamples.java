
import java.io.FileInputStream;
import java.io.IOException;

public class ThrowableExamples {

	public static void main(String[] args){
		ThrowableExamples te = new ThrowableExamples();
		String fileName = "This_File_Does_Not_Exist.out";

		//try to open the file with filename defined above
		try{
			FileInputStream f = new FileInputStream(fileName);
		}catch(Throwable error){
			if(error instanceof IOException){
				System.out.println("Something went wrong with the processing of " + fileName);
			}

			printErrorStructure(error);
		}
		


	}


	public static void printErrorStructure(Object o){
		Class parent = o.getClass();
		String prefix = "";
		System.out.println("Error caught was: ");
		do{
			System.out.println(prefix + " " + parent.getName());
            prefix +="---";
			parent = parent.getSuperclass();
			if(parent == null) break;
		}while(parent.getSuperclass() != null);

	}

}
