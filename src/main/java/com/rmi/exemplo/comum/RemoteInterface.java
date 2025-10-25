package com.rmi.exemplo.comum;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RemoteInterface extends Remote {

    String sayHello(String name) throws RemoteException;
    
}
