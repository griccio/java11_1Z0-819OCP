
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FinallyExamples{


	public static void main(String[] args){

		FinallyExamples fex = new FinallyExamples();

		try{
			System.out.println("Outer try block start here ...");
			String property = fex.getPropertyFromFile("FinallyProperties.txt");
		}
		catch(IOException | ArrayIndexOutOfBoundsException io){
			System.out.println("Outer Catch exception block starts here ...");
			try{
				System.out.println("Inner try block attemps retry ...");
				String property = fex.getPropertyFromFile("AnotherProperties.txt");
			}
			catch(IOException innerIo){
				System.out.println("Inner Catch exception block starts here ...");
			}
		}

	}


	private String getPropertyFromFile(String filename) throws IOException{

		String property;
		BufferedReader br = new BufferedReader (new FileReader(filename));

		try{
			String line = br.readLine();
			property = line.split("\\s")[2];
			System.out.println("property value: " + property);

		}finally{
			if(br!=null)
				br.close();
		}
		return property;
	} 

	



}
