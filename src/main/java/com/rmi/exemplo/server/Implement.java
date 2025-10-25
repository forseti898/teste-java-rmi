package com.rmi.exemplo.server;

import com.rmi.exemplo.comum.RemoteInterface;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Implement extends UnicastRemoteObject implements RemoteInterface{

    protected Implement() throws RemoteException{
        super();
    }

    @Override
    public String sayHello(String name) throws RemoteException{
        return "ola" + name + "Seja bem vindo!";
    }

}