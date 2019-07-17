import java.io.*;
import java.rmi.*;
import java.util.*;
class Client
{
	public static void main(String args[])
	{
		try
		{
			Add obj=(Add)Naming.lookup("rmi://localhost:5000/Abhinav");
			int ans=obj.numbers(10,13);
			System.out.println(ans);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}