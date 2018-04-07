package hr_system;
import java.util.*;
public class Task extends TaskArea
{
	public String taskId, taskTitle, location, day, taskType, startDate, endDate,
	taskQual, notes;
	public double taskLengthHrs;
	public int time;
	public String assignedStaff;
	
	Task[] tasks = new Task[50];		//NOT SURE WHETHER TO STORE ALL TASKS INSIDE TASK CLASS OR NOT...

	//Sreeja to fix START
	Scanner scanner = new Scanner(System.in);
	//Sreeja to fix END
	
	
	
	public Task(String taskId, String taskTitle)
	{
		this.taskId = taskId;
		this.taskTitle = taskTitle;
	}
	//GET METHODS
	public String getTaskID()
	{
		return this.taskId;
	}
	
	
	//END OF GET METHODS
	
	
	
	//SET METHODS
	public void setTask (
			String taskId, 
			String taskTitle, 
			String location, 
			String day,
			String taskType, 
			String startDate, 
			String endDate, 
			String taskQual,
			String notes, 
			double taskLengthHrs, 
			int time,
			String assignedStaff
	)
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
		setAssignedStaff(assignedStaff);
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
	
	public void setAssignedStaff(String assignedStaff)
	{
		this.assignedStaff = assignedStaff;
	}
	//END OF SET METHODS
	
	
	public boolean createTask()		//parameters needs to be coded
	{
		int t_count = 0;
		
		for (int i = 0; i < tasks.length + 1; i++)
		{
			if(tasks[i] == null)
			{
				t_count = i;
				
				System.out.println("Enter the folllowing details to add a task");  
				
				System.out.println(" Enter the ID of the task:");
				String t_ID = scanner.nextLine();
				
				System.out.println(" Enter the length of the task:");
				Double t_len = scanner.nextDouble();
				
				System.out.println(" Enter the title of the task:");
				String t_tit = scanner.nextLine();

				System.out.println(" Enter the location of the task:");
				String t_loc = scanner.nextLine();
				
				System.out.println(" Enter the day of the task:");
				String t_day = scanner.nextLine();
				
				System.out.println(" Enter the time of the task:");
				String t_time = scanner.nextLine();
				
				System.out.println(" Enter the type of the task:");
				String t_type = scanner.nextLine();
				
				System.out.println(" Enter the start date of the task:");
				String t_start= scanner.nextLine();
				
				System.out.println(" Enter the end date of the task:");
				String t_end= scanner.nextLine();
				
				System.out.println(" Enter the course code of the task:");
				String t_courseCode= scanner.nextLine();
				
				System.out.println(" Enter the qualification of the task:");
				String t_qual= scanner.nextLine();
				
				System.out.println(" Enter the qualification of the task:");
				String t_assign= scanner.nextLine();
				
		        tasks[t_count].setTaskId(t_ID);
		        tasks[t_count].setTaskLengthHrs(t_len);
		        tasks[t_count].setTaskTitle(t_tit);
		        tasks[t_count].setLocation(t_loc);
		        tasks[t_count].setTaskType(t_type);
		        tasks[t_count].setStartDate(t_start);
		        tasks[t_count].setEndDate(t_end);
		        tasks[t_count].setCourseCode(t_courseCode);
		        tasks[t_count].setTaskQual(t_qual);
		        tasks[t_count].setAssignedStaff(t_assign);
		        
		        return true;
			}
		}
		return false;
	}
	
	public boolean editTask(int taskNum, String taskId, String taskTitle, String location, String day,
							String taskType, String startDate, String endDate, String taskQual,
							String notes, double taskLengthHrs, int time, String assignedStaff)
	{
		if (tasks[taskNum] != null)
		{
			setTask(taskId,taskTitle,location,day,taskType,startDate,endDate,taskQual,notes,taskLengthHrs,
					time,assignedStaff);
			return true;
		}
		return false;
	}
	
	public boolean deleteTask()
	{
		int taskIndex = 0;     //the task id to be deleted 
        
        System.out.println(" Enter the ID of the task to delete:");
		String taskID = scanner.nextLine();
       	
        for (int i = 0; i < tasks.length + 1; i++)
        {
            if (tasks[i].getTaskID() == taskID)
            {
            	taskIndex = i;
            	tasks[i] = null;
                for(int k = taskIndex; taskIndex < tasks.length; k++)
                {
                	tasks[k] = tasks[k + 1];
                }
                return true;
            }
        }
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
