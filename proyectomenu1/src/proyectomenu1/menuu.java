package proyectomenu1;

import java.util.Scanner;

public class menuu {
public static void main(String[] args) {
		
		
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("---Bienvenidos a la cockteleria el inge ;)---");
		System.out.println("¿Que le gustaria comer?");
		System.out.println("Como opciones del menu tenemos: \n1.- cockteles de camaron $100 \n2.-ensaladas de mariscos $120 \n3.- consome de camaron $70 \n4.- filete empanizado $60"); 
		int opcionComida = teclado.nextInt(); 
		
		switch(opcionComida) {
		
		case 1 : System.out.println("Has elegido cocktel de camaron "); 
		break;
		case 2 : System.out.println("Has elegido ensslada de mariscos");
		break;
		case 3 : System.out.println("Has elegido Consome de camaron");
		break;
		case 4 : System.out.println("Has elegido filete empanizado");
		break;
		
		
		
		
		}
		
		
		System.out.println("¿Ahora que desea como Bebida?");
		System.out.println("Como primera Bebida tenemos: \n1.- coca-cola $20 \n2.- fresca $20 \n3.- michelada $45  \n4.- cerveza xx $30"); 
		int opcionBebida = teclado.nextInt(); 
		
        switch(opcionBebida) {
		
		case 1 : System.out.println("Has elegido coca-cola para Beber"); 
		break;
		case 2 : System.out.println("Has elegido fresca para Beber");
		break;
		case 3 : System.out.println("Has elegido michelada para Beber");
		break;
		case 4 : System.out.println("Has elegido cerveza xx para Beber");
		break;
		
		
		
		}
		
        System.out.println("¿Que deseas como Postre?");
		System.out.println("Como primer postre  tenemos: \n1.- platano frito  $25 \n2.- Rebanada de pastel $30 \n3.- marquesita $35 B \n4.- Gelatina  $15");//IMPRIMIMOS LAS OPCIONES DEL MENU
		int opcionPostre = teclado.nextInt(); 
		
        switch(opcionPostre) {
		
		case 1 : System.out.println("Has elegido platano frito  para postre"); 
		case 2 : System.out.println("Has elegido pastel para postre");
		break;
		case 3 : System.out.println("Has elegido marquesita para postre");
		break;
		case 4 : System.out.println("Has elegido Gelatina para postre");
		break;
		
		
		
		
	}
        
        System.out.println("Muy bien amigo/amiga, en 20 minutos maximo tiene su orden . gracias por elegir nuestra  marisqueria :)");
        
  
	}

	/*lorenzo ramirez jimenez 2-A isc dia sabados.
	 */

}
