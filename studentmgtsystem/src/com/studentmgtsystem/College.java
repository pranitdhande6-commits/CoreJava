package com.studentmgtsystem;

public class College {
	
	public void addStudent() {
		Student std = new Student();
		std.sid = 42;
		std.name = "Lokesh";
		std.address = "PCMC";
		
		Student std1 = new Student();
		std1.sid =  27;
		std1.name ="Saurbh";
		std1.address= "Pune";
		
		return std1;	
	}
	
	public AllStudent addAllStudent() {
		
		AllStudent all = new AllStudent();
		all.Sarthak.sid = 28;
		all.Sarthak.name = "SARTHAK ";
		all.Sarthak.address = "Ahilyanagar ";
		
		all.Dinesh.sid = 18;
		all.Dinesh.name = "DINESH ";
		all.Dinesh.address = "Karjat ";
		
		all.Sahil.sid = 87;
		all.Sahil.name = "SAHIL ";
		all.Sahil.address = "KARMALA ";
		
		all.Santosh.sid = 65;
		all.Santosh.name = "SANTOSH";
		all.Santosh.address = "NAGAR";
		
		return all;
		
	}

}
