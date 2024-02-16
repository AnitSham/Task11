package task11;

public class IntergerException {

	public static void main(String[] args) {
		
		try {
			int a,b;
			a=10;
			b=0;
      System.out.println(a/b);
		} catch (ArithmeticException e) {
			System.err.println("Arithmetic Excerption has occured");
		}finally {
			System.out.println("I would run at any case");
		}
	}

}
