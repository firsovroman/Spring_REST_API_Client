package org.example;

import org.example.configuration.MyConfig;
import org.example.entity.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;


public class App 
{
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication", Communication.class);

//получаем список
//        List<Employee> allEmployees = communication.getAllEmployees();
//        System.out.println(allEmployees);

// получаем сотрудника по id
//        Employee empByID = communication.getEmployee(1);
//        System.out.println(empByID);

// добавляем сотрудника
//        Employee emp = new Employee("Sveta", "Sokolova", "IT", 1200);
//        emp.setId(14);
// или меняем данные у текущего
//        communication.saveEmployee(emp);

// удаляем сотрудника
//        communication.deleteEmployee(14);

    }
}
