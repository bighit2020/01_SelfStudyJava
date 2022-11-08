package s4;

public class E04_QStopExample {
	public static void main(String[] args) throws Exception {
		int keyCode;

		while(true) {
			keyCode = System.in.read();
			System.out.println("keyCode: " + keyCode);
			if(keyCode == 113) {  				       
				break;		//keyCode가 113과 동일할 경우 실행
			}
		}
		
		System.out.println("종료");
	}
}

