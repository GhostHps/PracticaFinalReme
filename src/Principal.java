import java.util.Scanner;

/**
 * 
 */

/**
 * @author ghost
 *
 */
public class Principal { 
	private static final Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int respuesta;
		
		//OPCION 1
		
		int alumnos_materia=0, suma=0, au =0, de=0, aprovados=0, na=0, number_alumno=0;
		float media=0, calif_mat=0;
		String name_alumno="";
		name_alumno.trim();
		String name_mat="";
		
		
		//OPCION 2
		int serie;
		
		//OPCION 3
		int operacion=0,numero,res=0;
		
		//OPCION 4 vinos
		
		int prodtot=0,yearsenior=0,higheraverage=0,yearyounger=0,loweraverage=0,yearnullwine3=0;
		int wine1=0,wine2=0,wine3=0,wine4=0,wine5=0;
		
		//	OPCION 5
		String r;
		int boletos,cantb = 0,zona,totalb=0,total=0;
		
		//OPCION 6
		
		//se ocupara tambien la variable de año del ejercicio 4
		
		do {
			System.out.println("--------------------------------------------");
			System.out.println("Seleccione la opcion que desee hacer");
			System.out.println("Opcion 1: Calificaciones.");
			System.out.println("Opcion 2: Serie.");
			System.out.println("Opcion 3: Perfectos.");
			System.out.println("Opcion 4: Viñedo.");
			System.out.println("Opcion 5: Estadio.");
			System.out.println("Opcion 6: Viñedo con objetos.");
			System.out.println("Opcion 7: Estadio con objetos.");
			System.out.println("Opcion 8: Centro de Servicio Automotriz.");
			System.out.println("Opcion 9: Exit.");
			System.out.println("--------------------------------------------");
			
			
			respuesta=sc.nextInt();
			switch(respuesta) {
			case 1:
				System.out.println("¿Cuantas materias deseas ingresas?");
				int materia=sc.nextInt();
				
				for(int i=0; i<materia;i++) {
					System.out.println("Inserta el nombre de la materia");
					name_mat=sc.next();
					System.out.println("¿Cuantos alumnos hay en la materia de "+ name_mat);
					number_alumno=sc.nextInt();
					for(int n=0; n<number_alumno;n++) {
						System.out.println("¿Cual es el nombre del alumno?");
						name_alumno=sc.next().trim();
						System.out.println("Ingresar la calificacion del alumno."
								+ " NOTA:"
								+ " En el caso de que el alumno no se halla presentado al examen"
								+ "o no este inscrito a esta materia, favor de poner un: " + "-1");
						calif_mat=sc.nextFloat();
						//saber la cantidad de los alumnos que presentaron la materia
						if(calif_mat != -1) {
							alumnos_materia++;
							
							suma+=calif_mat;
					}
						//numero de alumnos que no aprobaron
						if(calif_mat < 8 && calif_mat >0) {
							na++;
						}
						//numero de alumnos aprovados
						if(calif_mat > 7.9) {
							aprovados++;
						}
						/*numero de alumnos con DESTACADO
						 * Destacado= > 8.9 && < 10 */
						if (calif_mat > 8.9 && calif_mat < 10) {
							de++;
						}
						/* numero de alumnos con AUTONOMO
						* Autonomo = 10*/
						if (calif_mat == 10) {
							au++;
						}
							
						}
					media=suma/alumnos_materia;
					System.out.println("los alumnos que ingresaron a la materia "+ name_mat +" son: "+ alumnos_materia);
					System.out.println("Los media de la materia "+name_mat+" es: "+ media);
					System.out.println("La cantidad de los alumnos REPROBADOS fue de:"+na);
					System.out.println("La cantidad de los alumnos con DESTACADO es de: "+de);
					System.out.println("La cantidad de los alumnos con AUTONOMO es de: "+au);
					
					alumnos_materia=0;
					suma=0;
					au =03;
					de=0;
					aprovados=0;
					na=0;
					media=0;
				}
				
				break;
				
			case 2:
				int n=2;
				System.out.println("ingrese el tope de la serie");
				
				serie=sc.nextInt();
				
				for (int i=1; i<=serie;i++){
					
					if(i==1) {
						System.out.println("1/"+n);
						n=+3;
					}
					if(i==2) {
						System.out.println("1/"+n);
						n=+2;
					}
					if (i==3) {
						System.out.println("1/"+n);
						n=+3;
						i=1;
					}
					
					if(n>serie) {
						i=serie+1;
					}
				}
				
				
				break;
				
			case 3:
				System.out.println("ingrese el numero que desse saber sobre sus numeros perfectos ");
				numero=sc.nextInt();
				int sum=0;
				for(int i=1;i<numero;i++) {
					sum=0;
					for(int j=1;j<numero;j++) {
						if(i % j==0) {
							sum=+j;
						}
					}
				
					
					if(i==sum) {
						System.out.println("Es un numero perfecto, y sus numeros perfectos son: "+i);
					}
				}
				break;
			case 4:
				System.out.println("ingrese los años que desee saber su produccion de viñedo.");
				int yearprod,año=0;
				yearprod=sc.nextInt();
				int year[]=new int[yearprod],winetype[]=new int[4];
				for (int i=0;i<yearprod;i++) {
					//lectura de los vinos
					System.out.println("cuanto se produjo del vino 1.");
					winetype[0]=sc.nextInt();
					wine1=+winetype[0];
					System.out.println("cuanto se produjo del vino 2.");
					winetype[1]=sc.nextInt();
					wine2=+winetype[1];
					System.out.println("cuanto se produjo del vino 3.");
					winetype[2]=sc.nextInt();
					wine3=+winetype[2];
					System.out.println("cuanto se produjo del vino 4.");
					winetype[3]=sc.nextInt();
					wine4=+winetype[3];
					System.out.println("cuanto se produjo del vino 5.");
					winetype[4]=sc.nextInt();
					wine5=+winetype[4];
					
					//el total de la producción de todos los vinos
					prodtot=winetype[0]+winetype[1]+winetype[2]+winetype[3]+winetype[4];
					
					año++;
					loweraverage=winetype[2];
					//produccion
					if(higheraverage<loweraverage) {
						higheraverage=loweraverage;
					}
					//produccion nula del vino 3
					if(winetype[2]==0) {
						yearnullwine3=año;
					}
					System.out.println("lo que se produjo en total fue de: "+prodtot);
					
				}
				System.out.println("la produccion total del vino 1 fue de: "+wine1);
				System.out.println("la produccion total del vino 2 fue de: "+wine2);
				System.out.println("la produccion total del vino 3 fue de: "+wine3);
				System.out.println("la produccion total del vino 4 fue de: "+wine4);
				System.out.println("la produccion total del vino 5 fue de: "+wine5);
				
				break;
			case 5:
				
				Estadio est = new Estadio();
				System.out.println("Desea realizar una venta?");
				r=sc.next();
				if(r.equals("si")) {
					est.Estadio();
				}
				break;
			case 6:
				viñedo wine=new viñedo();
				System.out.println("¿Cuántos años de produccion desea ingresar?");
				int position=sc.nextInt();
				viñedo years[]=new viñedo[position];
				//seleccionar la produccion de los vinos
				wine.produccions(years);
				//ver el total de produccion de los años de los vinos
				wine.totalyears(years);
				//produccion mayor del vino 2
				wine.prodhigher2();
				//produccion nula del vino 3
				wine.yearnullwine3();
				
				break;
			case 7:
				//Vehiculo vehiculos[]= new Vehiculo[20];
				Plane plan=new Plane();
				plan.to_assign();
				System.out.println("Ingrese su nombre");
				String name=sc.next();
				System.out.println("Ingrese su cedula");
				String identification=sc.next();
				System.out.println("¿En qué clase le gustaria viajar?");
				System.out.println("Ejecutiva");
				System.out.println("Economica");
				String clas=sc.next();
				System.out.println("¿En qué ibicacion desea su asciento?");
				System.out.println("----------------");
				System.out.println("Ejecutiva:");
				System.out.println("Ventana" +"Pasillo"+"\n");
				System.out.println("----------------");
				System.out.println(" ");
				System.out.println("----------------");
				System.out.println("Economica:");
				System.out.println("Ventana" +"Pasillo"+"Centro"+"\n");
				System.out.println("----------------");
				String location=sc.next();
				plan.sign_on(name, identification, clas, location);
				break;
			case 8:
				System.out.println("¿De cuantos vehiculos sera la capacidad maxima del centro de verificación?");
				int lim=sc.nextInt();
				int resp;
				ServiceCenter serv=new ServiceCenter(lim);
				
				do {
					System.out.println("-------------------------------------------------------");
					System.out.println("Bienvenido a nestro Service Senter.");
					System.out.println("-------------------------------------------------------");
					System.out.println("Seleccione la opción que dese realizar.");
					System.out.println("Opcion 1: Ingresar un nuevo vehiculo.");
					System.out.println("Opcion 2: Retirar un vehiculo.");
					System.out.println("Opcion 3: Mostrar todos los vehiculos que se encuentren en el centro de verificación.");
					System.out.println("Opcion 4: Exit.");
					System.out.println("-------------------------------------------------------");
					System.out.println("Gracias por su preferencia.");
					System.out.println("-------------------------------------------------------");
					resp=sc.nextInt();
					Vehiculo a;
					switch(resp) {
					case 1:
						/*
						 * se da a escojer el vehiculo que va a entrar al ServiceCenter
						 */
						System.out.println("¿Qué desea agregar?");
						System.out.println(" Carro.");
						System.out.println(" Moto.");
						String answ=sc.next();
						/*
						 * se hace las condiciones para que lea la respuesta que se dio por teclado.
						 * y se hacen las condiciones para ver cual de los dos tipos de vehiculos se agregan.
						 */
						if(answ.equalsIgnoreCase("Carro")) {
							Car carro= new Car();
							carro.NewCar();
							/*
							 * verificar si esta lleno el servicio automotriz.
							 * de ser asi imprimira que el servicio esta lleno por el momento
							 * de ser lo contrario solo lo barrera.
							 */
							if(!serv.Ingresar(a)) {
								System.out.println("Nuestro ServiceCenter esta lleno por el momento.");
								
							}
						}
						if(answ.equalsIgnoreCase("Moto")) {
							Moto mot= new Moto();
							mot.NewMoto();	
							if(!serv.Ingresar(a)) {
								System.out.println("Nuestro ServiceCenter esta lleno por el momento.");
						}
						
					}
						break;
					case 2:
					//metodo para quitar un vehiculo
						System.out.println("ingrese la matricula que del vehiculo el cual desea retirar del ServiceCenter");
						String enrollm=sc.next();	
							serv.retirar(enrollm);
							
							break;
					case 3:
						//mostrar todos los vehiculos registrados
						System.out.println("los vehiculos que estan en el registro presente del Server Center es.");
						System.out.println(serv.toString());
						break;
						
						default:
							resp=4;
						break;
				}
			}
				while(resp!=4);
				break;
			case 9:
				
		  }
		}
		while (respuesta != 10);
	}


}
