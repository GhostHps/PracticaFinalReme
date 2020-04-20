import java.util.Scanner;

/**
 * 
 */

/**
 * @author ghost
 *
 */
	public class viñedo extends Principal{
		Scanner sc=new Scanner(System.in);
		int prodwine1=0,prodwine2=0,prodwine3=0,prodwine4=0,prodwine5=0;
		int wine1=0,wine2=0,wine3=0,wine4=0,wine5=0;
		int yearnullwine3=0;
		int prodtot=0,yearsenior=0,higheraverage=0,yearyounger=0,loweraverage=0;
		
		public viñedo() {
			
		}
		public viñedo(int wine1,int wine2,int wine3,int wine4,int wine5) {
			this.wine1=wine1;
			this.wine2=wine2;
			this.wine3=wine3;
			this.wine4=wine4;
			this.wine5=wine5;
		}
		public int getWine1() {
			return wine1;
		}
		public void setWine1(int wine1) {
			this.wine1 = wine1;
		}
		public int getWine2() {
			return wine2;
		}
		public void setWine2(int wine2) {
			this.wine2 = wine2;
		}
		public int getWine3() {
			return wine3;
		}
		public void setWine3(int wine3) {
			this.wine3 = wine3;
		}
		public int getWine4() {
			return wine4;
		}
		public void setWine4(int wine4) {
			this.wine4 = wine4;
		}
		public int getWine5() {
			return wine5;
		}
		public void setWine5(int wine5) {
			this.wine5 = wine5;
		}
		
		public viñedo produccions(viñedo year[]) {
			viñedo witip= new viñedo();
			int winetype[]=new int[4];
			int con=0,counter=0,pos=0;
			
			for(int i=0;i<year.length;i++) {
				//añado la produccion de cada vino
				System.out.println("¿Cuánto vino se produjo del vino 1?");
				wine1=sc.nextInt();
				witip.setWine1(wine1);
				
				System.out.println("¿Cuánto vino se produjo del vino 2?");
				wine2=sc.nextInt();
				witip.setWine2(wine2);
				
				System.out.println("¿Cuánto vino se produjo del vino 3?");
				wine3=sc.nextInt();
				witip.setWine3(wine3);
				
				System.out.println("¿Cuánto vino se produjo del vino 4?");
				wine4=sc.nextInt();
				witip.setWine4(wine4);
				
				System.out.println("¿Cuánto vino se produjo del vino 5?");
				wine5=sc.nextInt();
				witip.setWine5(wine5);
				
				
				year[pos]=witip;
				pos++;
				prodtot=wine1+wine2+wine3+wine4+wine5;
				con++;
				counter++;
				loweraverage=wine2;
				//para ver el año maximo de produccion
				if(higheraverage<loweraverage) {
					higheraverage=loweraverage;
					yearsenior=con;
				}
				
				if(wine3==0) {
					yearnullwine3=counter;
				}
			}
			return witip;
		}
		//el total de la produccion de cada vino
		public viñedo totalyears(viñedo year[]) {
			viñedo yearwit=new viñedo();
			for(int i=0;i<year.length;i++) {
				prodwine1=+year[i].getWine1();
				prodwine2=+year[i].getWine2();
				prodwine3=+year[i].getWine3();
				prodwine4=+year[i].getWine4();
				prodwine5=+year[i].getWine5();
				
			}
			System.out.println("La producción total del vino 1 fue de: "+prodwine1);
			System.out.println("La producción total del vino 2 fue de: "+prodwine2);
			System.out.println("La producción total del vino 3 fue de: "+prodwine3);
			System.out.println("La producción total del vino 4 fue de: "+prodwine4);
			System.out.println("La producción total del vino 5 fue de: "+prodwine5);
			
			return yearwit;
		}
		//saber el año en que se produjo mas del vino 2
		public viñedo prodhigher2() {
			viñedo prodhigher=new viñedo();
			System.out.println("El año en que se produjo mas del vino 2 fue en el año: "+yearsenior+" y su produccion fue de: "+higheraverage);
			return prodhigher;
		}
		public viñedo yearnullwine3() {
			viñedo yearnull=new viñedo();
			System.out.println("En el año "+yearnullwine3+" no se produjo ninguna cantidad del vino3.");
			return yearnull;
		}
	}


