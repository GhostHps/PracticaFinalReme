import java.util.Scanner;

/*
 * 
 * @author ghost
 */
public class Moto extends Vehiculo{
		private int displacement;
		
		public Moto() {
			
		}
		public Moto(String brand, String enrollment, int mileage, int displacement) {
			super(brand, enrollment, mileage);
			this.displacement = displacement;
		}
		public int getDisplacement() {
			return displacement;
		}
		public void setDisplacement(int displacement) {
			this.displacement = displacement;
		}
		public String toString(){
			return "Coche " + getBrand() + ", MATRICULA = " + getEnrollment() + ", KM = " + getMileage() + ", CILINDRADA = " + getDisplacement()+"\n";
		}
		public Moto NewMoto() {
			Scanner sc= new Scanner(System.in);
			System.out.println("Inserte la matricula nueva.");
			this.setEnrollment(sc.next());
			
			System.out.println("Inserte el kilometraje del carro.");
			this.setMileage(sc.nextInt());
			
			System.out.println("Inserte la marca del carro.");
			String brand=sc.next();
			this.getBrand().equals(brand);
			
			System.out.println("Ingrese el numero de la cilindrada.");
			this.setDisplacement(sc.nextInt());
			
			return this;
		}
		



}
