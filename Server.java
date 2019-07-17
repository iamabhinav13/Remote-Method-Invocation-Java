import java.io.*;
import java.rmi.*;
import java.rmi.registry.*;
class Server
{
	public static void main(String args[])
	{
		try
		{
			Add obj=new Addition();
			LocateRegistry.createRegistry(5000);
			Naming.rebind("rmi://localhost:5000/Abhinav",obj);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}