import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaCircular listaCircular = new ListaCircular();

        //System.out.println(listaCircular.estaVacia());

        for (int i = 0; i <10 ; i++) {
            listaCircular.insertarFinal(i);
        }
        listaCircular.insertarFinal(3 );



        listaCircular.eliminarFinal();
        listaCircular.mostrar();
        System.out.println("");
        //listaCircular.mostrarCiruculo();
    }
}
