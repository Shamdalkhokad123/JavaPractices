package single.ton;

public class EagerSingleTon {

	public static void main(String[] args) {
		Singleton1 son = Singleton1.getInstance();//Eager Initialization
		Singleton1 son1 = Singleton1.getInstance();
		
		
		System.out.println(son.hashCode());
		System.out.println(son1.hashCode());
		
		Singleton2 osn = Singleton2.getInstance();//static block intialization
		Singleton2 osn2 = Singleton2.getInstance();
		System.out.println(osn.hashCode());
		System.out.println(osn.hashCode());
		
		LazySingleton ls = LazySingleton.getInstance();
		LazySingleton ls1 = LazySingleton.getInstance();
		
		System.out.println(ls.hashCode());
		System.out.println(ls1.hashCode());

	}

}
