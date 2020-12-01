
/**
 * 
 * @author Saju
 *
 */


/***
 * 
 * 
 * 
 *  Dependency Inversion Principle(DIP): High-level modules should not depend on low-level modules. Both should depend on abstractions. 
 *  Abstractions should not depend on details. Details should depend on abstractions.
 *  Or simply : Depend on Abstractions not on concretions.
 *  
 *  
 *  There’s a common misunderstanding that dependency inversion is simply 
 *  another way to say dependency injection. 
 *  However, the two are not the same.
 *  In the following code In spite of Injecting MySQLConnection class
 *  in PasswordReminder class but it depends on MySQLConnection.
 *  High-level module PasswordReminder should not depend on low-level module MySQLConnection.
 *  
 *  If we want to change the connection from MySQLConnection to MongoDBConnection, 
 *  we have to change hard-coded constructor injection in PasswordReminder class. 
 *  PasswordReminder class should depend upon on Abstractions not on concretions.
 *  
 *  We can fix this using Dependency Inversion Principle.
 *
 */
public class PasswordReminder {

	private MySQLConnection dbConnection;
	
	public PasswordReminder(MySQLConnection dbConnection) {
		this.setDbConnection(dbConnection);
	}
	
	public MySQLConnection getDbConnection() {
		return dbConnection;
	}
	
	public void setDbConnection(MySQLConnection dbConnection) {
		this.dbConnection = dbConnection;
	}
}
