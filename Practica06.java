import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
 * Clase para ejemplificar el paso de parámetros por valor
 * el ejemplo lo encontré en internet,je
 *
 * @author picodotdev
 * @version 1
 */
public class Practica06{
	
	
		/*
		 * Método "constructor" que asigna los valores a las variables 
		 * w, x, y , z
		 * @param x
		 * @param y
		 * @param w
		 * @param z		 * 
		 */
		public static void method(int x, String y, List<String> w, List<String> z) 	{
		//
        	 x = 999;
       	 	 y = "Hola Mundo!";
         	 w = List.of("Hola", "mundo", "!");
         	 z.addAll(List.of("Hola", "mundo", "!"));
    		}
    //Aunque a las variables de los argumentos x y, w les asignemos un nuevo 
    //valor, las variables a,b,c que usamos en la invocación del método
    //continúan con el mismo valor.
   
    public static void main(String[] args) {
        int a = 1;
        String b = "Hello World!";
        List<String> c = Arrays.asList("Hello", "World", "!");
        List<String> d = new ArrayList(List.of("Hello", "World", "!"));
        
    //Sin embargo, si los objetos a los que apuntan esas variables son 
    //modificados en el método, los cambios serán visibles en la invocación
    //con la variable utilizada en el argumento

        Main.method(a, b, c, d);
        
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
	//La lista de "d" es modificada por el método y corresponde a la 
	//variable "z".
	//Sus cambios son visibles en el ámbito de d, al contrario de las otras
	//variables que aunque se les asigna un mnuevo valor en el método 
	//fuera de él conservan su valor original aún después de la invocación
	//del método. Esto pasa porque a "d" se le ha modificado el objeto al
	//cuál d y z apuntan.
        System.out.println("d: " + d);
    }
			
	
}

/*Ahora pondré en forma de comentario el ejemplo de un paso de parámetros por 
 * "referencia"
 *Vamos a manejar un objeto como parámetro. Al manejar objetos en java, las 
  variables mantienen una referencia al objeto, por lo tanto al pasar un objeto
  se está realizando una copia de la referencia. Asíq que tenemos dos 
  variables diferentes apuntando al mismo objeto.

  public class Referencia{
  
  	public int valor;

	//Ahora un método que modifica el valor;
	
	public static void metodo_referencia(MiClase m){
	  m.valor = 3;
	}

	//Aquí se está pasando por valor aunque parece que hay una referencia
	
	Referencia m1 = new Referencia();
	m1.valor= 2;
	SYstem.out.println(m1.valor); // Devuelve 2
	metodo_referencia(m1);
	System.out.println(m1.valor); //Devuelve 3

	//Instanciamos con un valor de 2 el atributo de la clase y el método 
	//lo cambia a 3
	//Como la variable copia m en el método sigue manteniendo la referencia
	//al objeto original, se produce un cambio en el objeto y eso nos hace
	//pensar que pasamos por referencia los objetos.
  }
 *  
