
public class DBConn {
	
	private static DBConn instance1=new DBConn();
	
	private DBConn() {
		
	}
	
	public static DBConn getInstance()
	{
		return instance1;
	}
}
