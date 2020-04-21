package RelacionCom;

import java.util.Scanner;

/**
 * @author ghost
 *
 */
public class Pasajero {
	Scanner sc=new Scanner(System.in);
	public String identification,name;
	
	public Pasajero() {
	}
	public Pasajero(String identification,String name) {
		this.identification=identification;
		this.name=name;
	}
	public String getIdentification() {
		return identification;
	}
	public void setIdentification(String identification) {
		this.identification = identification;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Pasajero assign() {
		this.name=sc.next();
		this.identification=sc.next();
		return this;
	}
	
}
