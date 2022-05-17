package com.example.springdemo;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@Component
@SpringBootApplication
public class SpringdemoApplication {

	public static void main(String[] args) {
	
		ApplicationContext context;
		context=SpringApplication.run(SpringdemoApplication.class, args);
		StudentDetails st;
		st=context.getBean(StudentDetails.class);
		st.setdata();
		st.showdata();
	}

}
