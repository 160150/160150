public class Aloha2  {
	public static void main(String[] args) {
		Alohaman2 am = new Alohaman2();
		am.sayAloha(10, 2);
	}
}
class Alohaman2{
	private  String msg;
	private  String msg2;

	public Alohaman2(){
   this.msg = "ALOHA!";
   this.msg2 = "アロハ";
	}

	public void sayAloha(){
		System.out.println(this.msg);
	}
	public void sayAloha(int num){
		for (int i=0;i<num;i++){			
				
			
			System.out.println(i+this.msg);
         }
		}
		public void sayAloha(int num,int x){
	for (int i=0;i<num;i++){
	if (i%x==0) {
			System.out.println(i+this.msg2);
		}else {
					
		System.out.println(i+this.msg);

	}
	}
}	
}