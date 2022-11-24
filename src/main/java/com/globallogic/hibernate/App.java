package com.globallogic.hibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.globallogic.Dao.StudentDao;
import com.globallogic.Dao.StudentDaoImpl;
import com.globallogic.Entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
       StudentDao studentDaoImpl=(StudentDao) context.getBean("studentDao");
       Student student = new Student();
       student.setId(3);
       student.setCity("noida");
       student.setName("James");
       
       int res= studentDaoImpl.Insert(student);
       System.out.println(res);
       System.out.println("hello");
      
      
      
    }
}
