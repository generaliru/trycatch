
public class Main {
	public static float div = 0;
	public static Integer num = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Antes de la divicion");
		try {
			div = 1/num;
		} catch(ArithmeticException ex) {
			div = 0;
			System.out.println("Error: " + ex.getMessage());
		} catch(NullPointerException ex){
			System.out.println("Error: " + ex.getMessage());
			System.out.println("Segundo Catch");
		} finally {
			System.out.println("División: " + div);
			System.out.println("Despues de la divicion");			
		}
		String[] frutas = new String[] {"Peras","Mango","Manzana","Uva"};
		
		for(String fruta: frutas) {
			System.out.println(fruta);
		}
		
	}

}
