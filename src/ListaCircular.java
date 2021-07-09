import java.util.Scanner;

public class ListaCircular {
    private Nodo inicio,ultimo;



    public ListaCircular() {
        inicio = null;
    }

    public boolean estaVacia(){
        return inicio == null;
    }

    public void insertarFinal(Object dato){
        Nodo nuevo = new Nodo(dato,null,null);
        nuevo.setDato(dato);
        if (estaVacia()){
            inicio=nuevo;
        }else{
            Nodo aux=inicio;
            while (aux.getSiguiente()!=null){
                aux=aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }

    }
    public void mostrarCiruculo(){
        Scanner teclado= new Scanner(System.in);
        System.out.print("Introdusca el numero de veces a repetir (1 - 10): ");
        int dato = teclado.nextInt();
        while (dato>=11){
            System.out.print("Solo se puede repetir 10 veces: ");
            dato=teclado.nextInt();
        }
        for (int i = 0; i <dato ; i++) {
            System.out.print("");
            mostrar();
        }
        if(dato ==1){
            System.out.print("!!AL SER 1 LA LISTA SE MUESTRA UNA VEZ");
        }

    }

    public void mostrar(){
        Nodo aux = inicio;

        while (aux !=null){
            System.out.print(aux.getDato() +" ");

            aux = aux.getSiguiente();
        }


    }
    //eliminar
    public void eliminarFinal(){
        if(!estaVacia()){
            inicio = inicio.getSiguiente();

        }

    }
}
