package com.spring.SpringORM;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.SpringORM.dao.studentDao;
import com.spring.SpringORM.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );type name = new type();
    	ApplicationContext context=new ClassPathXmlApplicationContext("Config.xml"); 
    	studentDao studentdao=context.getBean("studentDao",studentDao.class);  
//    	Student student=new Student();  
//    	student.setId(21); 
//    	student.setName("saisravan"); 
//    	student.setCity("mahububad");
//    	studentdao.insert(student); 
    	
    	
    	BufferedReader  br=new BufferedReader(new InputStreamReader(System.in)); 
    	
    	
    	outer:while(true) {
    		System.out.println("Press 1 for add new students"); 
    		System.out.println("Press 2 for display all students");
    		System.out.println("Press 3 for getdetails of single student");
    		System.out.println("Press 4 for  delete students");
    		System.out.println("Press 5 for update Student");
    		System.out.println("Press 6 for exit"); 
    		
    		
    		try {
    			 int input =Integer.parseInt(br.readLine()); 
    			 switch(input) {
    			 case 1:
//    				 add a new student 
    				 Student student1=new Student(); 
    				 System.out.println("enter the student id");
    				 int id=Integer.parseInt(br.readLine());
    				 student1.setId(id);
    				 System.out.println("enter the student name");  
    				 student1.setName(br.readLine()); 
    				 System.out.println("enter the city name"); 
    				 student1.setCity(br.readLine()); 
    				studentdao.insert(student1); 
    				if(true) {
    					System.out.println("Inserted successfully");
    				} 
    				
    				
    				 
    				 
    				 break; 
    			 case 2:
//    				 display all students
    				 ArrayList<Student> al=(ArrayList<Student>) studentdao.getAll(); 
    				 for(Student stu:al) {
    					 System.out.println(stu.getId()+" "+stu.getName()+ " "+stu.getCity());
    				 }
    			
    				 
    				 
    				 
    				 
    				 break;
    			 case 3:
//    				 get details of single student 
    				 System.out.println("enter the id to retrive the data");
    				int check=Integer.parseInt(br.readLine()); 
    				Student stu=new Student(); 
//    				System.out.println("hello");
    				stu.setId(check);
//    				System.out.println("hiio");
    				System.out.println(studentdao.getstudentdetails(stu).getId()+"  "+studentdao.getstudentdetails(stu).getName()+"  "+studentdao.getstudentdetails(stu).getCity()) ;
//    				System.out.println("hey");
//    				 System.out.println(gotstu.getId()+"  "+gotstu.getName()+"  "+gotstu.getCity()); 
    				 
    				 
    				 
    				 
    				 break;
    			 case 4:  
    				System.out.println("enter the id to delete the data");
     				int check1=Integer.parseInt(br.readLine()); 
     				studentdao.delete(check1);
     				System.out.println("deleted suucessfully");
    				 
//    				 delete all student
    				 break;
    			 case 5:
//    				 update student
    				 Student student=new Student(); 
    				 System.out.println("1");
    				 student.setId(5);
    				 student.setName("naveen");
    				 student.setCity("hyderabad");  
    				 System.out.println("2");
    				 boolean flag=studentdao.update(student);  
    				 System.out.println("3");
    				 if(flag) {
    					 System.out.println("updated succesfully");
    				 } 
    				 else {
    					 System.out.println("not updated");
    				 }
    				 break;
    			 case 6: 
//    				 add a new student
//    				 break 
    				 System.out.println("Thanks for visiting");
    				 break outer;
    			 } 
    			 
    		}
    		catch (Exception e) {
//    			e.printStackTrace(); 
    			System.out.println("invalid input");
				// TODO: handle exception
			}
    	} 
    	
    	
    	
    	
    	
    }
}
