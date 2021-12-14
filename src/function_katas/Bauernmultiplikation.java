package function_katas;

public class Bauernmultiplikation {

	public static void start() {
		System.out.println(Mul(31, 399));
	}

	public static int Mul(int zahl1, int zahl2)
	{
		int lösung = 0;
		while(zahl1 >= 1)
		{

			if(zahl1%2 != 0)
			{
				lösung += zahl2;
			}
			zahl2 *= 2;
			zahl1 /= 2;
		}
		return lösung;
	}
}