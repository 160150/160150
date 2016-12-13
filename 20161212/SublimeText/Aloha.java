import java.io.*;
public class Aloha  {
public static void main(String[] args) {
	       String  fileName = args[0];
	       FileReader inFile; 
	       int data;
	       int n = 0;
           try{
           	inFile=new FileReader(fileName);
           	while((data = inFile.read())!=-1){
           		n++;
  	System.out.println("くり返し: "+n+"回:"+data);

           	}
           	inFile.close();
           }catch(IOException e){
			System.err.println("エラーです。");
			System .exit(1    }	
		}
	}	
	
