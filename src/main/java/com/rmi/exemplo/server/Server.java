package com.rmi.exemplo.server;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import com.rmi.exemplo.comum.RemoteInterface;


public class Server {
    public static void main(String[] args){

        try{
            Registry registro = LocateRegistry.createRegistry(1099);

            RemoteInterface objRemoto = new Implement();

            registro.rebind("olaRMI", objRemoto);
            System.out.println("Servidor pronto...aguardando conexoes!");


             synchronized (Server.class) {
                Server.class.wait();
            }

        }catch(Exception err){
            err.printStackTrace();
        }
    }
    

}
