package ico.fes.aragon.unam.mx.clases;

import java.util.Arrays;
import java.util.LinkedList;


public class ADTColaPrioAco<E> {

    private ColaADT<E>[] colas;
    private LinkedList<E> data;

    private int MaxPrioridad;




    public ADTColaPrioAco(int MaxPrioridad) {
        this.colas = colas;
        this.MaxPrioridad = MaxPrioridad;
        this.colas = new ColaADT[MaxPrioridad + 1];
        for (int i = 0; i <= this.MaxPrioridad; i++) {
            this.colas[i] = new ColaADT<>();
        }
        this.data = new LinkedList<>();
    }

    public int longitud() {
        int total = 0;
        for (int i = 0; i < MaxPrioridad + 1; i++) {
            total += this.colas[i].longitud();
        }
        return total;
    }

    public boolean estaVacio() {
        return this.longitud() == 0;
    }

    public void Encolar(int prioridad, E elementos) {

        if (prioridad >= 1 && prioridad <= this.MaxPrioridad) {
            this.colas[prioridad].Encolar(elementos);
        }
    }

    public E desEncolar() {
        if (this.estaVacio()) {
            System.out.println("no hay elementos nunca");
        }else {
            for (int i = 1; i <= MaxPrioridad; i++) {
                if (!colas[i].estVacio()) {
                    return colas[i].desencolar();
                }
            }
        }
        System.out.println("No hay elementos para desEncolar");
        return null;
    }
    @Override
    public String toString() {
        return "ADTColaPrioAco{" +
                "colas=" + Arrays.toString(colas) +
                ", MaxPrioridad=" + MaxPrioridad +
                '}';
    }
}