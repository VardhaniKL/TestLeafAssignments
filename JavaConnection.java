package AbstractAssignment;

public class JavaConnection implements databseConnection

{
	
	@Override
	public void connect()
	{
		System.out.println("Connect to Database");
		
	}

	@Override
	public void disconnect() 
	{
		System.out.println("Disconnect database");
		
	}

	public void rundb() 
	{
		System.out.println("Run the database");
		
	}
	
	@Override
	public void executeUpdate()
	{
		System.out.println("Execute update in database");
	}
	

	public static void main(String[] args) 
	{
		JavaConnection j=new JavaConnection();
		j.connect();
		j.disconnect();
		j.executeUpdate();
		j.rundb();
	}

	


}
