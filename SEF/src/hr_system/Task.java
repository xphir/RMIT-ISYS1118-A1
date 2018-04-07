package hr_system;

public class Task extends TaskArea
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
	
	
	
	
	//SET METHODS
	public void setTask(String taskId, String taskTitle, String location, String day,
						String taskType, String startDate, String endDate, String taskQual,
						String notes, double taskLengthHrs, int time)
	{
		setTaskId(taskId);
		setTaskTitle(taskTitle);
		setLocation(location);
		setDay(day);
		setTaskType(taskType);
		setStartDate(startDate);
		setEndDate(endDate);
		setTaskQual(taskQual);
		setNotes(notes);
		setTaskLengthHrs(taskLengthHrs);
		setTime(time);
	}
	public void setTaskId(String taskId)
	{
		this.taskId = taskId;
	}
	
	public void setTaskTitle(String taskTitle)
	{
		this.taskTitle = taskTitle;
	}
	
	public void setLocation(String location)
	{
		this.location = location;
	}
	
	public void setDay(String day)
	{
		this.day = day;
	}
	
	public void setTaskType(String taskType)
	{
		this.taskType = taskType;
	}
	
	public void setStartDate(String startDate)
	{
		this.startDate = startDate;
	}
	
	public void setEndDate(String endDate)
	{
		this.endDate = endDate;
	}
	
	public void setTaskQual(String taskQual)
	{
		this.taskQual = taskQual;
	}
	
	public void setNotes(String notes)
	{
		this.notes = notes;
	}
	
	public void setTaskLengthHrs(double taskLengthHrs)
	{
		this.taskLengthHrs = taskLengthHrs;
	}
	
	public void setTime(int time)
	{
		this.time = time;
	}	
	//END OF SET METHODS
	
	
	
	public boolean createTask()		//parameters needs to be coded
	{
		
		return false;
	}
	
	public boolean editTask(int taskNum, String taskId, String taskTitle, String location, String day,
							String taskType, String startDate, String endDate, String taskQual,
							String notes, double taskLengthHrs, int time)
	{
		if (tasks[taskNum] != null)
		{
			setTask(taskId,taskTitle,location,day,taskType,startDate,endDate,taskQual,notes,taskLengthHrs,
					time);
			return true;
		}
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
