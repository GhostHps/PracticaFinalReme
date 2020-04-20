/**
 * 
 */

/**
 * @author ghost
 *
 */
public class Plane {
	String location,clas,number,identification;
	boolean state;
	Plane seating[]=new Plane[50];
	
	public Plane() {
	}
	public Plane(String location,String clas,String number,String identification,boolean state) {
		this.location=location;
		this.clas=clas;
		this.number=number;
		this.identification=identification;
		this.state=state;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getClas() {
		return clas;
	}
	public void setClas(String clas) {
		this.clas = clas;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getIdentification() {
		return identification;
	}
	public void setIdentification(String identification) {
		this.identification = identification;
	}
	public boolean getState() {
		return state;
	}
	public void setState(boolean state) {
		this.state = state;
	}
	
	//asignacion de clase y ubicacion
	public Plane to_assign() {
		Plane assign=new Plane();
		for(int i=0;i<5;i++) {
			assign.setClas("Ejecutiva");
			assign.setLocation("Ventana");
			assign.setState(false);
			seating[i]=assign;
		}
		for(int i=5;i<9;i++) {
			assign.setClas("Ejecutiva");
			assign.setLocation("Pasillo");
			assign.setState(false);
			seating[i]=assign;
			
		}
		for(int i=9;i<23;i++) {
			assign.setClas("Economica");
			assign.setLocation("Ventana");
			assign.setState(false);
			seating[i]=assign;
		}
		for(int i=23;i<37;i++) {
			assign.setClas("Economica");
			assign.setLocation("Centro");
			assign.setState(false);
			seating[i]=assign;
		}
		for(int i=37;i<50;i++) {
			assign.setClas("Economica");
			assign.setLocation("Pasillo");
			assign.setState(false);
			seating[i]=assign;
		}
		return assign;
	}
	
	public Plane sign_on(String name,String identification,String clas,String location) {
		Plane sign=new Plane();
		if(clas.equalsIgnoreCase("Ejecutiva")) {
			if(location.equalsIgnoreCase("Ventana")) {
				for(int i=0;i<5;i++) {
					if(seating[i].getState()==false) {
						sign.setState(true);
						sign.setNumber(name);
						sign.setIdentification(identification);
						sign.setClas("Ejecutiva");
						sign.setLocation("Ventana");
						seating[i]=sign;
						System.out.print("El asiento que se la a asignado fue "+
						seating[i].getNumber()+" "+
						seating[i].getIdentification()+" "+
						seating[i].getClas()+" "+
						seating[i].getLocation());
						break;
					}
				}
			}
			if(location.equalsIgnoreCase("pasillo")) {
				for(int i=5;i<9;i++) {
					if(seating[i].getState()==false) {
						sign.setState(true);
						sign.setNumber(name);
						sign.setIdentification(identification);
						sign.setClas("Ejecutiva");
						sign.setLocation("Pasillo");
						seating[i]=sign;
						System.out.print("El asiento que se la a asignado fue "+
						seating[i].getNumber()+" "+
						seating[i].getIdentification()+" "+
						seating[i].getClas()+" "+
						seating[i].getLocation());
						break;
					}
					
				}
			}
		}
		if (location.equalsIgnoreCase("Economica")) {
			if(location.equalsIgnoreCase("Ventana")) {
			for(int i=9;i<23;i++) {
				if(seating[i].getState()==false) {
					
					sign.setState(true);
					sign.setNumber(name);
					sign.setIdentification(identification);
					sign.setClas("Economica");
					sign.setLocation("Ventana");
					seating[i]=sign;
					System.out.print("El asiento que se la a asignado fue "+
					seating[i].getNumber()+" "+
					seating[i].getIdentification()+" "+
					seating[i].getClas()+" "+
					seating[i].getLocation());
					break;
			}
		}
	}
			if(location.equalsIgnoreCase("Centro")) {
				for(int i=23;i<37;i++) {
					if(seating[i].getState()==false) {
						sign.setState(true);
						sign.setNumber(name);
						sign.setIdentification(identification);
						sign.setClas("Economica");
						sign.setLocation("Centro");
						seating[i]=sign;
						System.out.print("El asiento que se la a asignado fue "+
						seating[i].getNumber()+" "+
						seating[i].getIdentification()+" "+
						seating[i].getClas()+" "+
						seating[i].getLocation());
						break;
					}
					
				}
			}
			if(location.equalsIgnoreCase("pasillo")) {
				for(int i=37;i<50;i++) {
					if(seating[i].getState()==false) {
						sign.setState(true);
						sign.setNumber(name);
						sign.setIdentification(identification);
						sign.setClas("Ejecutiva");
						sign.setLocation("Pasillo");
						seating[i]=sign;
						System.out.print("El asiento que se la a asignado fue "+
						seating[i].getNumber()+" "+
						seating[i].getIdentification()+" "+
						seating[i].getClas()+" "+
						seating[i].getLocation());
						break;
					}
					
				}
			}
       }
		return sign;
	}
}
