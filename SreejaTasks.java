package sef;

import java.util.Scanner;

public class tasks {
	
	public String taskID;
	public double task_lengthHrs;
	public String task_title;
	public String location;
	public String day;
	public int time;
	public String task_type;
	public String start_date;
	public String end_date;
	public String course_code;
	public String task_qual;
	public String assigned_staff;
	public String notes;
	
	  // setters start from here
	
	public void setTaskID(String taskID) {
		this.taskID = taskID;
	}

	public void setTask_lengthHrs(double task_lengthHrs) {
		this.task_lengthHrs = task_lengthHrs;
	}

	public void setTask_title(String task_title) {
		this.task_title = task_title;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public void setTask_type(String task_type) {
		this.task_type = task_type;
	}

	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}

	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}

	public void setCourse_code(String course_code) {
		this.course_code = course_code;
	}

	public void setTask_qual(String task_qual) {
		this.task_qual = task_qual;
	}

	public void setAssigned_staff(String assigned_staff) {
		this.assigned_staff = assigned_staff;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public void setT(tasks[] t) {
		this.t = t;
	}
	
   
	//getters start from here 
	

	public String getTaskID() {
		return taskID;
	}

	public double getTask_lengthHrs() {
		return task_lengthHrs;
	}

	public String getTask_title() {
		return task_title;
	}

	public String getLocation() {
		return location;
	}

	public String getDay() {
		return day;
	}

	public int getTime() {
		return time;
	}

	public String getTask_type() {
		return task_type;
	}

	public String getStart_date() {
		return start_date;
	}

	public String getEnd_date() {
		return end_date;
	}

	public String getCourse_code() {
		return course_code;
	}

	public String getTask_qual() {
		return task_qual;
	}

	public String getAssigned_staff() {
		return assigned_staff;
	}

	public String getNotes() {
		return notes;
	}

	public tasks[] getT() {
		return t;
	}

	
	
	Scanner scanner = new Scanner(System.in);
	
	tasks[] t = new tasks[20];	

	int t_count = 0;
	
	
	
	public void addTasks() 
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

  
	}
	
	public void deleteTasks()
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
	}


	public static void main(String[] args) {
	
		
	}
}
