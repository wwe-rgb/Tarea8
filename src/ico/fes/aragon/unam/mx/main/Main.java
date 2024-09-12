package ico.fes.aragon.unam.mx.main;

import ico.fes.aragon.unam.mx.clases.ADTColaPrioAco;
import ico.fes.aragon.unam.mx.clases.Wallet;
import ico.fes.aragon.unam.mx.clases.clienteBanco;

public class Main {
    public static void main(String[] args) {

        ADTColaPrioAco<clienteBanco> Cliente = new ADTColaPrioAco<>(5);
        Cliente.Encolar(4,(new clienteBanco("Alejandro",20,"Ecatepec de Morelos",200)));
        Cliente.Encolar(4,(new clienteBanco("Maria",25,"Cuernavaca",300)));
        Cliente.Encolar(5,(new clienteBanco("Carlos",25,"Nuevo Leon",1200)));
        Cliente.Encolar(5,(new clienteBanco("Israel",19,"Volcan de Fuego",4500)));
        Cliente.Encolar(5,(new clienteBanco("Katterine",20,"Gustavo A Madero",3000)));
        Cliente.Encolar(1,(new clienteBanco("Salama Hayek",62,"EEUU",20000)));
        System.out.println("Primera impresion de los clientes\n"+Cliente);
        clienteBanco clienteAtendido = Cliente.desEncolar();
        if (clienteAtendido != null) {
            clienteAtendido.getBilletera().retirar(10000);
            System.out.println("Primera cliente atendido:\n " + clienteAtendido);
        }
        Cliente.Encolar(3,(new clienteBanco("Cesar",22,"Iztapalapa",3500)));
        Cliente.Encolar(2,(new clienteBanco("Francisco",33,"Inpulsora",7600)));
        clienteBanco clienteAtendido2 = Cliente.desEncolar();
        System.out.println("Cliente atendidos:\n"+clienteAtendido2);
        System.out.println("Segunda impresion de los clientes\n"+Cliente);

        System.out.println("Cliente atendidos\n:"+Cliente);
        System.out.println("Ultima impresion de los clientes\n"+Cliente);













    }
}