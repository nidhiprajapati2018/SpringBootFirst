package com.jnit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context= SpringApplication.run(Main.class, args);
		Student st= context.getBean(Student.class);
		st.setSid(304);
        st.setSname("Ravi");
        st.setMarks(475);

        System.out.println(st.getSid()+" "+st.getSname()+" "+st.getMarks());

	}

}
