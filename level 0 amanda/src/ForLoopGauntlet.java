
public class ForLoopGauntlet {
	public static void main(String[] args) {
		for (int i = 0; i <= 100; i++) {
			System.out.println(i);
		}for (int y = 100; y >=0; y--) {
			System.out.println(y);
		}for (int i = 0; i <= 100; i++) {
			if (i%2 == 0) {
				System.out.println(i);
				}
			}for (int j = 0; j <=99; j++) {
				if (j%2 == 1 ) {
					System.out.println(j);
				}				
		}for (int i = 0; i <= 500; i++) {
			if (i%2 ==0 ) {
				System.out.println(i + " even");
			} else if (i%2 == 1) {
				System.out.println(i + " odd");
			}
		}for (int i = 0; i <= 777; i++) {
			if (i%7 == 0) {
				System.out.println(i);
			}
		}for (int i = 2002; i <= 2017; i++) {
			int age = 1;
			System.out.println(age);
		}
	}
}
