/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p5;

/**
 *
 * @author Dora Di
 */
import java.io.File;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

class FileImpl extends UnicastRemoteObject implements FileInterface
{
    FileImpl()throws RemoteException{}

    public File getFile()
    {
        return new File("files/example.txt");
    }
}



