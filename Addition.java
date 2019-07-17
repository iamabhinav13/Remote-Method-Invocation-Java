import java.io.*;
import java.rmi.*;
import java.rmi.server.*;
public class Addition extends UnicastRemoteObject implements Add
{
	Addition() throws RemoteException
	{
		super();
	}
	public int numbers(int a,int b) throws RemoteException
	{
		int ans;
		ans=a+b;
		return ans;
	}
}