package ordenextraño;

import java.util.ArrayList;

public class Vectnummay {
	ArrayList<Object> lista = new ArrayList<Object>();
	
	
	public void printnumberline(int centro, int largo)
	{
		int valant;
		int valsig;
		int mitad = (largo/2);
		for (int i = 0 ; i < (largo-1);i++)
		{
			lista.add(i," ");
		}
		valant = centro;
		valsig = centro;
		lista.add(mitad,centro);
		for (int f = (mitad+1); f < (largo-1) ; f++) 
		{
		  valsig --;
		  if(0 <= valsig)
		  {
		  lista.set(f,valsig);
		  }
		}
		for (int g = (mitad-1); g > 0; g--)
		{
		  valant --;		
		  if (0 <= valant)  
		  {
			lista.set(g,valant);
		  }				
			
		}
		System.out.println(lista);
		
	}

}