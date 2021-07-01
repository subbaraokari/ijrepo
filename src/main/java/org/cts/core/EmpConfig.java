package org.cts.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmpConfig {
	@Bean
	public Dept department() {
		Dept d=new Dept();
		d.setDno(100);
		d.setDname("CSE");
		d.setLoc("Chennai");
		return d;
	}
	@Bean
	public Emp employee() {
		Emp e=new Emp();
		e.setEno(1);
		e.setName("Suresh");
		e.setAddress("Chennai");
		e.setDept(department());
		return e;
	}
}
