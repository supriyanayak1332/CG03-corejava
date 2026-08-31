package com.tnsit.interfacedemo;

interface TechnicalRole{
	void designArchitecture();
	
}
interface ManagementRole{
	void ManageTeam();
	
}
class ProjectManager implements TechnicalRole,ManagementRole{

	private static final int ProjectBudget=0;
	private String name;
	private String Projectname;
	private int teamsize;
	private double projectBudget;
	
	
	public ProjectManager(String name, String projectname, int teamsize, double projectBudget) {
		super();
		this.name = name;
		Projectname = projectname;
		this.teamsize = teamsize;
		this.projectBudget = projectBudget;
	}

	@Override
	public void ManageTeam() {
	System.out.println("Managing a team of "+teamsize+ " Developers");	
		
	}

	@Override
	public void designArchitecture() {
	System.out.println(name +" is architecture for "+Projectname);	
		
	}
	void checkBudget() {
		if(ProjectBudget>1000000) {
			System.out.println("High Budget Project");
		}
		else {
			System.out.println("Standard budget project");
		}
	}
	
	void displayProjectdetails() {
		System.out.println("project details:");
		System.out.println("Manager:"+name);
		System.out.println("project:"+Projectname);
		System.out.println("Team:"+teamsize);
		System.out.println("Budget:"+projectBudget);
	}
}
	
	
public class Organisation {
	public static void main(String[] args) {
		ProjectManager m=new ProjectManager("Anil","E-Commerce Platform",8,250000);
		m.designArchitecture();
		m.ManageTeam();
		m.checkBudget();
		m.displayProjectdetails();
	}
}


