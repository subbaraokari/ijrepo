package org.cts.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(EmpConfig.class);
		Emp e=context.getBean(Emp.class);
		Dept dept=e.getDept();
		System.out.println(e.getEno()+"\t"+e.getName()+"\t"+e.getAddress());
		System.out.println(dept.getDname()+"\t"+dept.getLoc());
	
	}

}
