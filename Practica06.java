/*
 * Clase para ejemplificar el paso de parámetros por valor
 *
 * @author Cruz Cruz Alan Josue
 * @version 1
 */
public class Practica06{
	public static void main(String[] args){
	
		/*Ejemplo de paso de parámetros por valor
		 * @param p - Parámetro
		 */
		public void metodo(int p){
		 p=3;
		}
		int p1=2;
		metodo(p1);
		System.out.println(p1); //Imprimirá 2 porque es lo que vale p1
	}
	
}
