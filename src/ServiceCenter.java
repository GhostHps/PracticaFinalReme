

public class ServiceCenter
{
	private Vehiculo[] vehiculos;
	
	public ServiceCenter(int NumVeh){
		vehiculos = new Vehiculo [NumVeh];
		
	}	
	//metodo para agregar un nuevo vehiculo
	public boolean Ingresar ( Vehiculo a){
		boolean ing = false;
		for (int i = 0; i < vehiculos.length; i++){
			if ( vehiculos[i] == null){
				ing = true;
				vehiculos[i] = a;
				break;
			}
		}
		
		return ing;
	}
	//metodo para retirar un vehiculo del centro de verificacion
	public boolean retirar ( String NumVeh){
		boolean ret=false;
		for (int i = 0; i < vehiculos.length; i++){
			if ( vehiculos[i].equals(NumVeh)){
				vehiculos[i] = null;
				ret=true;
				if(ret==true) {
					System.out.println("El vehiculo ha sido retirado exitosamente");
				} else {
					System.out.println("La matricula que inserto no pertenece a ningun vehiculo dentro de nuestro Servic Center");
				}
				break;
			}
		}
		return ret; 
	}
	//
	public int Verificados(){
		int cont = 0;
		
		for (int i = 0; i < vehiculos.length; i++){
			if(vehiculos[i] != null)
				if(vehiculos[i].YesCheck()==true){
				cont++;
		}
	  }
		return cont;
	}
	
	public Vehiculo[] getVehiculos(){
		Vehiculo[] temp = new Vehiculo[this.Verificados()];
		for(int j = 0, i = 0; j<temp.length && i<vehiculos.length; i++){
			if(vehiculos[i]!=null){
				temp[j] = vehiculos[i];
				j++;
			}
		}
		return temp;
	}
	public String toString() {
		Moto mot=new Moto();
		Car carro=new Car();
		String mostrar=carro.toString()+mot.toString();
		return mostrar;
	}
	
}