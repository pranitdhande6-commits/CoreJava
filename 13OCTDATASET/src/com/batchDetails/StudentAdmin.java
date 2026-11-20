package com.batchDetails;

public class StudentAdmin {

public static void main(String[] args)
{
	Student std = new Student();
	  std.sid=77;
	  std.sname = "Pranit";
	  std.scontact = 9970787957l;
	  
	  std.faculty.fid = 18;
	  std.faculty.fname = "Vivek";
	  std.faculty.fcontact = 8087201799l;
	  
	  std.faculty.course.cid = 37;
	  std.faculty.course.cname = "FullStack ";
	  std.faculty.course.cgrade= 'A';
	  
	  std.faculty.course.batch.bid = 18;
	  std.faculty.course.batch.bname = "B77A";
	  
	  System.out.println(std.sid + " "+ std.sname + " "+ std.scontact );
	  System.out.println(std.faculty.fid+" "+std.faculty.fname +" "+ std.faculty.fcontact);
	  System.out.println(std.faculty.course.cid+" "+ std.faculty.course.cname+" "+ std.faculty.course.cgrade);
	  System.out.println(std.faculty.course.batch.bid +" "+ std.faculty.course.batch.bname);
	  
	  
		
	}
}
