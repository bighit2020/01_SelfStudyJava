package s2.exam04;

public class PrintThread extends Thread {
	public void run() {	
		while(true) {
			System.out.println("���� ��");
			if(Thread.interrupted()) {
				break;
			}
		}
		
		System.out.println("�ڿ� ����");
		System.out.println("���� ����");
	}
}

