

public class Vehiculo{
		private String brand,enrollment;
		private int mileage; 
		private boolean check;
		
		public Vehiculo(String brand, String enrollment, int mileage) {
			this.brand=brand;
			this.enrollment=enrollment;
			this.mileage=mileage;
		}
		public Vehiculo() {
			
		}
		public String getBrand() {
			return brand;
		}
		public String getEnrollment() {
			return enrollment;
		}
		public void setEnrollment(String matricula) {
			this.enrollment = matricula;
		}
		public int getMileage() {
			return mileage;
		}
		public void setMileage(int kilometraje) {
			this.mileage = kilometraje;
		}
		public void setCheck(boolean verificacion) {
			this.check = verificacion;
		}
		public String definirServicio() {
			String res="";
			if(getMileage()>=10000 && getMileage()<20000){
				res="CAMBIO DE ACEITE";
			}
			if(getMileage()>=20000 && getMileage()<=50000){
				res="CAMBIO FILTROS";
			}
			if(getMileage()>50000 ){
				res="CAMBIO DE LLANTAS";
			}
			if(getMileage()<10000 ){
				res="";
			}
			return res;
		}
		public boolean YesCheck(){
		boolean res=false; 
			if(check==true){
				res=true;
			System.out.println(res);
			}
			else {System.out.println(res);				
			}
		return res; 
		}
		
		
		


}

