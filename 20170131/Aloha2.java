public class Aloha2{
	public static void main(String[] args) {
			String[] data = new String[100];
		Dataman dataman = new Dataman();

		dataman.saveData(data);

		System.out.println("ALOHA");
		for(int i = 0;  i < 3;  i++) {
			System.out.println(data[i]);
		}
	}
}
class Dataman {

	String[] data;
	int numData;
public Dataman(){
		data = new String[100];
		int numData = 2;
		data[0] = "Aoki,Ebina,52";
		data[1] = "Horie,Yokohama,55";
	}
	public void saveData(String[] strData){
		strData[0] = "Aoki";
		strData[1] = "Horie";
		strData[2] = "Miwa";
	}
}

