	public class Aloha {
		public static void main(String[] args) {
			Alohaman am = new Alohaman(args[0],args[1]);
			am.sayAloha(1111, 5);
		}
	}


	class Alohaman {
		private String msg;
		private String msg2;

		
		public Alohaman() {			
			this.msg = "ALOHA!";
			this.msg2 = "青木！";
		}
		public Alohaman(String m1,String m2){
			this.msg = m1;
			this.msg2= m2;		

		}
		public void sayAloha(){
			System.out.println(this.msg2);		
		
		
	}
		public void sayAloha(int n,int x){
			for (int i=0;i<n;i++) {
		if(i%x==0){
		System.out.println(i+this.msg2);		

		}else{
		
			 System.out.println(i+this.msg);
		}
	}
}	
}	







