package RelacionCom;
import java.util.Scanner;
/**
 * @author ghost
 * 
 *
 */
public class Planes {
	Scanner sc=new Scanner(System.in);
	public Seating seat[]=new Seating[50];
	public Pasajero pasajero;
	public String plan;
	public Planes(Pasajero pasajero,String plan) {
		this.pasajero=pasajero;
		this.plan=plan;
		}
	public Pasajero getPasajero() {
		return pasajero;
	}

	public void setPasajero(Pasajero pasajero) {
		this.pasajero = pasajero;
	}

	public String getPlan() {
		return plan;
	}

	public void setPlan(String plan) {
		this.plan = plan;
	}
	public void pasajeros() {
		Pasajero pass=new Pasajero();
		Seating as=new Seating();
		pass.assign();
		System.out.println("¿Cual es tu nombre?");
		String name=sc.next();
		System.out.println("Ingresa la cedula.");
		String ced=sc.next();
		if(name!=null && ced!= null) {
			for(int i=0;i<seat.length;i++) {
				pass.assign(sear);
				
			}
		}
	}
	
}
