import java.rmi.*;
import java.io.*;
public interface Add extends Remote
{
	public int numbers(int a,int b) throws RemoteException;
}