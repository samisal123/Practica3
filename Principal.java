import java.util.LinkedList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List <String> arreglo_og = new LinkedList<String>();
        /*arreglo_og.add("1111");
        arreglo_og.add("2222");
        arreglo_og.add("3333");
        arreglo_og.add("4444");
        arreglo_og.add("0000");
        arreglo_og.add("1234");
        arreglo_og.add("4321");
        arreglo_og.add("1234");
        arreglo_og.add("0123");
        arreglo_og.add("0432");
        arreglo_og.add("1230");
        arreglo_og.add("4320");
        arreglo_og.add("2310");
        arreglo_og.add("1221");
        arreglo_og.add("1122");*/
        List<String> cero = new LinkedList<String>();
        List<String> uno = new LinkedList<String>();
        List<String> dos = new LinkedList<String>();
        List<String> tres = new LinkedList<String>();
        List<String> cuatro = new LinkedList<String>();
        Radix ordenar_con = new Radix();
        Radix.ingresar_datos(arreglo_og,15);
        ordenar_con.radixsort(4,arreglo_og,cero,uno,dos,tres,cuatro);
        System.out.println(arreglo_og);
    }
}
