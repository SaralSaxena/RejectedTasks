package Multithreading.RejectedTask;



public class Main {
	public static void main(String[] args){
		
		// Create the server
		Server server=new Server();
		
		// Send 100 request to the server and finish		
		System.out.printf("Main: Starting.\n");
		for (int i=0; i<20; i++){
			Task task=new Task("Task "+i);
			server.executeTask(task);
		}
		
		// Shutdown the executor
		System.out.printf("Main: Shuting down the Executor.\n");
		server.endServer();
		
		// Send a new task. This task will be rejected
		System.out.printf("Main: Sending another Task.\n");
		Task task=new Task("Rejected task");
		server.executeTask(task);

		System.out.printf("Main: End.\n");		
		
	}

}
