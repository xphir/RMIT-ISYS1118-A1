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
	
	//Sreeja to fix START
	Scanner scanner = new Scanner(System.in);
	tasks[] t = new tasks[20];	
	int t_count = 0;
	//Sreeja to fix END
	
	public boolean createTask()		//parameters needs to be coded
	{
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
		
        t[t_count] = new tasks();

        t[t_count].setTaskID(t_ID);
        t[t_count].setTask_lengthHrs(t_len);
        t[t_count].setTask_title(t_tit);
        t[t_count].setLocation(t_loc);
        t[t_count].setTask_type(t_type);
        t[t_count].setStart_date(t_start);
        t[t_count].setEnd_date(t_end);
        t[t_count].setCourse_code(t_courseCode);
        t[t_count].setTask_qual(t_qual);
        t[t_count].setAssigned_staff(t_assign);
        
        
        if (t_count < 21)
        	t_count++;
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
		int temp1 = 0;     //the task id to be deleted 
        
        System.out.println(" Enter the ID of the task to delete:");
		String taskID_1 = scanner.nextLine();
       	
        for (tasks ta : t)
        {
            if (ta.getTaskID() == taskID_1)
            {
                break;
            }
            temp1++;
        }

        while (temp1 < t_count)
        {
            t[temp1] = t[temp1 + 1];
            temp1++;
        }
        t[temp1] = null;
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
