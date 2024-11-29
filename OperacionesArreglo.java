import java.util.HashSet;
import java.util.Set;

public class OperacionesArreglo {

    public static int sumaValores(int[] arreglo) {
        int suma = 0;
        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
        }
        return suma;
    }

    public static int valoresUnicos(Object[] arreglo) {
        Set<Object> conjuntoUnico = new HashSet<>();
        
        
        for (Object obj : arreglo) {
            conjuntoUnico.add(obj);
        }
        
        return conjuntoUnico.size();
    }

    public static void main(String[] args) {

        int[] arregloEnteros = {1, 2, 3, 4, 5};
        System.out.println("Suma de valores: " + sumaValores(arregloEnteros));  

        Object[] arregloObjetos = {1, 2, 3, 2, 1, "a", "b", "a"};
        System.out.println("Cantidad de valores únicos: " + valoresUnicos(arregloObjetos));  
    }
}
