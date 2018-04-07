package hr_system;

public class Task
{
	public String taskId, taskTitle, location, day, taskType, startDate, endDate,
	taskQual, notes;
	public double taskLengthHrs;
	public int time;
	public CasualStaff[] assignedStaff = new CasualStaff[15];
	
	Task[] tasks = new Task[50];		//NOT SURE WHETHER TO STORE ALL TASKS INSIDE TASK CLASS OR NOT...

	public Task(String taskId, String taskTitle)
	{
		this.taskId = taskId;
		this.taskTitle = taskTitle;
	}
	
	public void getTask()
	{
		
	}
	
	public void setTask()
	{
		
	}
	
	public boolean createTask()		//parameters needs to be coded
	{
		
		return false;
	}
	
	public boolean editTask()
	{
		
		return false;
	}
	
	public boolean deleteTask()
	{
		
		return false;
	}
	
	public boolean taskAllocate()
	{
		
		return false;
	}
	
	public void checkQual()
	{
		
	}
	
	public void massAllocate()
	{
		boolean allocateSuccess = false;
		allocateSuccess = taskAllocate();
		
	}
	
	public void massCreate()
	{
		boolean createSuccess = false;
		createSuccess = createTask();
		
	}
	
}
