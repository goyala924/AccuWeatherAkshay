
import java.util.Scanner;

public class Test {

	@org.junit.Test
	public void test() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter city");
		String city = sc.nextLine();

		System.out.println("Please enter temp range for variance logic");
		float range = sc.nextFloat();

		String UItemp = UITemp.getUItemp(city);
		float APItemp = APITest.getAPITemp(city);

		Comparator.comparatorLogic(UItemp, APItemp);

		try {
			if (Comparator.varianceLogic(UItemp, APItemp, range) == "success")
				System.out.println("Temp variance within range");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
