
/**
 * 
 * @author Saju
 *
 */


/***
 * 
 * Interface Segregation Principle: A Client should not be forced to implement an interface that it doesn’t use.
 * 
 * RobotWorker no needs sleep, 
 * but the class has to implement the sleep method because 
 * we know that all methods are abstract in the interface. 
 * It breaks the Interface segregation law. 
 * we are forcing RobotWorker to implement sleep method.
 *
 */

public class RobotWorker implements WorkInterface {

	@Override
	public void work() {
		
	}

	// RobotWorker no needs sleep
	@Override
	public void sleep() {
		
	}

}
