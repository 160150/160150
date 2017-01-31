public class Aloha{
	public static void main(String[] args) {


		for (int i=0;i<30 ;i++ ) {
			if (i%5==0) {
				System.out.println("アロハ");
				
			}else {
			System.out.println("Aloha");
	
			}
			
		}
				String msg = args[0];
	           System.out.println(msg);

	           String msg2;
	           	System.out.print("入力してください >");
	msg2 = new java.util.Scanner(System.in).nextLine();
		System.out.println("my name is "+msg2);
		}
}