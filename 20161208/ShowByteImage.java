import java.io.*;
public class 	ShowByteImage{
	public static void main(String[] args) {
		FileInputStream inFile = null;
		try{

     inFile = new FileInputStream("Image/n(1).jpg");
    int data;
    int n= 0;
    while((data = inFile.read())!= -1){
    	n++;
    
  	System.out.println("くり返し: "+n+"回:"+data);
	
    }
    	

	

	
    inFile.close();

		}catch(IOException e){
			System.err.println("エラーです。");
			System .exit(1		}
	}

}