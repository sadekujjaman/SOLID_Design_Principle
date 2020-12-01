
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
 *  Recall InEfficent Code for Dependency Inversion Principle,
 *  PasswordReminder class depends on MySQLConnection.
 *  High-level module PasswordReminder should not depend on low-level module MySQLConnection.
 *  If we want to change the connection from MySQLConnection to MongoDBConnection, 
 *  we have to change hard-coded constructor injection in PasswordReminder class. 
 *  PasswordReminder class should depend upon on Abstractions not on concretions.
 *  
 *  We can fix this using Dependency Inversion Principle.
 *  
 *  For solve this above problem we creates an Abstraction named ConnectionInterface.
 *  and changed MySQLConnection to ConnectionInterface abstraction.
 *  
 *  Now If we want to change the connection from MySQLConnection to MongoDBConnection, 
 *  we no need to change constructor injection in PasswordReminder class. 
 *  Because here PasswordReminder class depends upon on Abstractions, not on concretions.
 *  
 *
 */
public class PasswordReminder {

	private ConnectionInterface dbConnection;
	
	public PasswordReminder(ConnectionInterface dbConnection) {
		this.setDbConnection(dbConnection);
		dbConnection.connect();
	}
	
	public ConnectionInterface getDbConnection() {
		return dbConnection;
	}
	
	public void setDbConnection(ConnectionInterface dbConnection) {
		this.dbConnection = dbConnection;
	}
}
