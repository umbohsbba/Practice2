import java.util.Random;

public class FortuneCookie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int x = 1 + r.nextInt(2);
		int a = 1 + r.nextInt(100);

		if (x == 1) {
			System.out.println("You will find happiness in Texas");
			System.out.println(r.nextInt(100) + "-" + r.nextInt(100) + "-" + r.nextInt(100) + "-" + r.nextInt(100) + "-"
					+ r.nextInt(100) + "-" + r.nextInt(100));

		} else if (x == 2) {
			System.out.println("confucius says, follow your heart");
			System.out.println(r.nextInt(100) + "-" + r.nextInt(100) + "-" + r.nextInt(100) + "-" + r.nextInt(100) + "-"
					+ r.nextInt(100) + "-" + r.nextInt(100));
		}
	}

}
