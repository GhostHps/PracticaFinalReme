package RelacionCom;

import java.util.Set;

/**
 * @author ghost
 *
 */
public class Seating {
	public boolean state;
	public String location,clas;
	public int num;
	
	public Seating() {
	}
	public Seating(boolean State,String location,String clas,int num) {
		this.state=state;
		this.location=location;
		this.clas=clas;
		this.num=num;
	}
	public boolean isState() {
		return state;
	}
	public void setState(boolean state) {
		this.state = state;
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
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public Seating registered(Seating seat[]) {
		Seating se=new Seating();
		for(int i=0;i<5;i++) {
			seat[i].setClas("Ejecutiva");
			seat[i].setState(true);
			seat[i].setNum(i+1);
			seat[i].setLocation("Ventana");
		}
		for(int i=5;i<9;i++) {
			seat[i].setClas("Ejecutiva");
			seat[i].setState(true);
			seat[i].setNum(i+1);
			seat[i].setLocation("Pasillo");
		}
		for(int i=9;i<23;i++) {
			seat[i].setClas("Economica");
			seat[i].setLocation("Ventana");
			seat[i].setState(false);
			seat[i]=seat[i];
		}
		for(int i=23;i<37;i++) {
			seat[i].setClas("Economica");
			seat[i].setLocation("Centro");
			seat[i].setState(false);
			seat[i]=seat[i];
		}
		for(int i=37;i<50;i++) {
			seat[i].setClas("Economica");
			seat[i].setLocation("Pasillo");
			seat[i].setState(false);
			seat[i]=seat[i];
		}
		return se;
	}
	
}
