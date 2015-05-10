package ordenextraño;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vectnummay vnm = new Vectnummay();
		int ncenter;
		int nlarge;
		Scanner teclado = new Scanner(System.in);
		System.out.println("ingrese el valor central:");
		ncenter =  Integer.parseInt(teclado.nextLine());
		System.out.println("ingrese el largo del arreglo:");
		nlarge =  Integer.parseInt(teclado.nextLine());
		
		vnm.printnumberline( ncenter, nlarge);
		teclado.close();
	}

}
