
/**
 * 
 * @author Saju
 *
 */


/***
 * 
 * Interface Segregation Principle: A Client should not be forced to implement an interface that it doesn’t use.
 * 
 * Recall inefficient code, RobotWorker no needs sleep, 
 * but the class has to implement the sleep method because 
 * we know that all methods are abstract in the interface. 
 * It breaks the Interface segregation law. 
 * we are forcing RobotWorker to implement sleep method.
 * 
 * To solve this problem we create two different interface, 
 * one WorkAbleInterface for work and another SleepAbleInterface for sleep.
 * For Human worker we are implementing both WorkAbleInterface and SleepAbleInterface as 
 * HumanWorker needs both. Besides, for RobotWorker we are now implementing WorkAbleInterface only
 * because RobotWorker does not care at all about the sleep method.
 * 
 * This is how Interface Segregation Principle divides fat interface into
 * multiple little interfaces with unique behavior.
 * This protects the user from changes in methods that don’t concern it. 
 * It also protects the user from knowing too much about the implementation of the object it is using.
 *
 */

public class RobotWorker implements WorkAbleInterface {

	@Override
	public void work() {
		
	}
}
