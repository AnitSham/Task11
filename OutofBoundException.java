package task11;

public class OutofBoundException {

	public static void main(String[] args) {
		
		try {
			int num[]= {1,2,3,4,5};
			System.out.println(num[5]);
			
			String name= "Hello All";
			System.out.println(name.charAt(9));
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Array Index is out of bound ");
		}catch (StringIndexOutOfBoundsException ae) {
			System.err.println("String Index is out of bound ");
		}
	}

}
