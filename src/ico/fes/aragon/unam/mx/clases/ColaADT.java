package ico.fes.aragon.unam.mx.clases;

import java.util.LinkedList;

public class ColaADT<E> {

    private LinkedList<E> data;

    public ColaADT() {
        this.data = new LinkedList<>();
    }

    public boolean estVacio() {
        boolean res = false;
        if(this.data.size()== 0){
            res = true;

        }
        return res;

    }
public int longitud(){
        return this.data.size();
}
public E frente(){
        return this.data.getFirst();

}
public void Encolar(E valor){
        this.data.addLast(valor);
}
public E desencolar(){
        return this.data.removeFirst();
}

    @Override
    public String toString() {
        return "ColaADT{" +
                "data=" + data +
                '}';
    }
}
