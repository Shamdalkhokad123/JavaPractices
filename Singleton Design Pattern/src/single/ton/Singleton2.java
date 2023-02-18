package single.ton;

public class Singleton2
{
	private static  Singleton2 INSTANCE = null;
	
	private Singleton2()
	{
		
	}
	
	static {
		try {
			if(INSTANCE == null)
				INSTANCE = new Singleton2();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static Singleton2 getInstance()
	{
		return INSTANCE;
	}

}
