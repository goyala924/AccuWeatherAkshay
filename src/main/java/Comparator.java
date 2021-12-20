public class Comparator {

	public static void comparatorLogic(String uiTemp, float APITemp) {
		float uiTemp2 = Float.valueOf(uiTemp);
		float APITemp2 = (float) (APITemp - 273.15f);

		if (uiTemp2 > APITemp2)
			System.out.println("UI temp = " + uiTemp2 + " is greater then API temp = " + APITemp2);
		else if (uiTemp2 < APITemp2)
			System.out.println("UI temp = " + uiTemp2 + " is less then API temp = " + APITemp2);
		else
			System.out.println("UI temp = " + uiTemp2 + " is equal to API temp = " + APITemp2);
	}

	public static String varianceLogic(String uiTemp, float APITemp, float range) throws CustomException {
		float uiTemp2 = Float.valueOf(uiTemp);
		float APITemp2 = (float) (APITemp - 273.15f);

		float diff = uiTemp2 - APITemp2;

		if (diff > range)
			throw new CustomException("UI and API temperature are not in range");
		else
			return "success";
	}
}
