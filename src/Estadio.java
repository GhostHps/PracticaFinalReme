import java.util.Scanner;

/**
 * 
 */

/**
 * @author ghost
 *
 */
public class Estadio {
	private Scanner sc;
	
	float zona1,zona2,zona3,zona4,zona5,prec_tot=0;
	String r;
	int boletos,cantb = 0,zona,totalb=0,total=0;
	
	public void Estadio() {
		sc= new Scanner(System.in);
	
	
	
	if(r.equals("si")) {
		System.out.println("Ingrese el precio de la zona 1. ");
		zona1=sc.nextFloat();
		System.out.println("Ingrese el precio de la zona 2. ");
		zona2=sc.nextFloat();
		System.out.println("Ingrese el precio de la zona 3. ");
		zona3=sc.nextFloat();
		System.out.println("Ingrese el precio de la zona 4. ");
		zona4=sc.nextFloat();
		System.out.println("Ingrese el precio de la zona 5. ");
		zona5=sc.nextFloat();
		
		System.out.println("¿Cuantos boletos deseas comprar");
		boletos=sc.nextInt();
		
		for(int i=0;i<boletos;i++) {
			System.out.println("¿Para que zona quiere el boleto?");
			System.out.println("zona 1 \n" 
					+ "zona 2 \n"
					+ "zona 3 \n"
					+ "zona 4 \n"
					+ "zona 5 \n");
			zona=sc.nextInt();
			
			switch(zona) {
			
			case 1:
				System.out.println("¿Cuantos boletos desea comprar para esta zona");
				cantb=sc.nextInt();
				if(cantb<=boletos) {
				prec_tot=zona1*cantb;
				}
				total=cantb;
				break;
			case 2:
				
				System.out.println("¿Cuantos boletos desea comprar para esta zona");
				cantb=sc.nextInt();
				if(cantb<=boletos) {
				prec_tot=zona2*cantb;
				}
				total=cantb;
				break;
			case 3:
				
				System.out.println("¿Cuantos boletos desea comprar para esta zona");
				cantb=sc.nextInt();
				if(cantb<=boletos) {
				prec_tot=zona3*cantb;
				}
				total=cantb;
				break;
			case 4:
				
				System.out.println("¿Cuantos boletos desea comprar para esta zona");
				cantb=sc.nextInt();
				if(cantb<=boletos) {
				prec_tot=zona4*cantb;
				}
				 total = cantb;
				break;
			case 5:
				System.out.println("¿Cuantos boletos desea comprar para esta zona");
				cantb=sc.nextInt();
				if(cantb<=boletos) {
				prec_tot=zona5*cantb;
				}
				total=cantb;
				break;
			default:
				break;	
			}
			totalb+=cantb;
			System.out.println("La clave de esta venta es: ");
			System.out.println("el total de esta venta fue de: "+cantb);
			System.out.println("La cantidad de los boletos vendidos fue de: "+total);
			cantb=0;
			prec_tot=0;
			
		}
	}
	}
}

	


