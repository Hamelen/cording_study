package chap04;

public class Ex24 {

	public static void main(String[] args) {
		int i=11;
		
		System.out.println("카운트 다운을 시작합니다.");
		
		while(i--!=0) {
			System.out.println(i);
			
			for(int j=0; j<2_000_000_000; j++) {
				;
			}
		}
        System.out.println("GAME OVER");
	}

}