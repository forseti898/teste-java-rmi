package com.rmi.exemplo.client;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import com.rmi.exemplo.comum.RemoteInterface;


public class Client {

    public static void main(String[] args){
        try{

            Registry registro = LocateRegistry.getRegistry("localhost", 1099);

            RemoteInterface stub = (RemoteInterface) registro.lookup("olaRMI");

            String resposta = stub.sayHello("Goku");
            System.out.println("Resposta do servidor: " + resposta);

        }catch(Exception err){
            err.printStackTrace();
        }
        
    }

}
