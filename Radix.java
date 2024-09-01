import java.util.List;
import java.util.Scanner;
public class Radix {
    int exponente = 1;
    public void pasar_elementos(List<String> destino, List <String> cero, List<String> uno, List<String> dos, List<String> tres, List <String>cuatro, int exp){
        int exponente = exp;
        while (!destino.isEmpty()){
            int numero_obtenido = Integer.parseInt(destino.getFirst());
            int penultimo = numero_obtenido % exponente;
            penultimo = penultimo / (exponente/10);
            switch (penultimo){
                case 0 ->{
                    cero.add(destino.getFirst());
                    destino.removeFirst();
                }
                case 1 ->{
                    uno.add(destino.getFirst());
                    destino.removeFirst();
                }
                case 2 ->{
                    dos.add(destino.getFirst());
                    destino.removeFirst();
    
                }
                case 3 ->{
                    tres.add(destino.getFirst());
                    destino.removeFirst();
                }
                case 4 ->{
                    cuatro.add(destino.getFirst());
                    destino.removeFirst();
                }
            }
        }
        destino.addAll(cero);
        cero.clear();
        destino.addAll(uno);
        uno.clear();
        destino.addAll(dos);
        dos.clear();
        destino.addAll(tres);
        tres.clear();
        destino.addAll(cuatro);
        cuatro.clear();
    }
    public static void ingresar_datos(List <String> lista, int numero_elementos){
        Scanner leido = new Scanner (System.in);
        for(int i = 0; i< numero_elementos; i++){
            System.out.println("Ingresa los numeros. Recuerda que los numeros deben ser de 4 dígitos y entre 0 y 4 Te quedan "+(numero_elementos-(i)) + " elementos");
            String numero = leido.next();
            lista.add(numero);
        }
    }

    public void radixsort(int tamano_digito, List<String> destino, List <String> cero, List<String> uno, List<String> dos, List<String> tres, List <String>cuatro){

        if(tamano_digito > 0){
            exponente = exponente *10;
            pasar_elementos(destino, cero, uno, dos, tres, cuatro, exponente);
            
            radixsort(tamano_digito-1,destino,cero,uno,dos,tres,cuatro);
        }

    }
}
