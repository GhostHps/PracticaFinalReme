import java.util.Scanner;

public class Car extends Vehiculo{
	private int pasajeros;
	
	public Car() {
		
	}
	
	public Car(String marca, String matricula, int kilometraje, int pasajeros) {
		super(marca, matricula, kilometraje);
		this.pasajeros = pasajeros;
	}
	public int getPasajeros() {
		return pasajeros;
	}
	public void setPasajeros(int pasajeros) {
		this.pasajeros = pasajeros;
	}
		
	public String toString(){
		return "Coche " + getBrand() + ", MATRICULA = " + getEnrollment() + ", KM = " + getMileage() + ", PASAJEROS = " + getPasajeros()+"\n";
	}
	public Car NewCar() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Inserte la matricula nueva.");
		this.setEnrollment(sc.next());
		
		System.out.println("Inserte el kilometraje del carro.");
		this.setMileage(sc.nextInt());
		
		System.out.println("Inserte la marca del carro.");
		String brand=sc.next();
		this.getBrand().equals(brand);
		
		System.out.println("Ingrese el numero de los pasajeros que acepta el carro.");
		this.setPasajeros(sc.nextInt());
		
		return this;
	}
	

}

