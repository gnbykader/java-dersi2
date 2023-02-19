
public class Main {

	public static void main(String[] args) {
		sayıBulmaca();
	}
	
	public static void sayıBulmaca(){
		int[] sayılar = new int[] {1,2,5,7,9,0};
		int aranacak = 8;
		boolean varMı =false;
		for(int sayı:sayılar) {
			if(sayı==aranacak) {
				varMı=true;
				break;				
			}			
		}
		String mesaj = "";
		if(varMı) {
			mesaj = aranacak+" sayısı mevcuttur."; 
			mesajVer(mesaj);
		}
		else {
			mesajVer(aranacak +" sayısı mevcut değildir.");
		}	
	}
	
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
		
	}
}
