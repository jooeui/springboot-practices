package ex04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 
 * @SpringBootApplication 메타 어노테이션 (여러 어노테이션을 가짐)
 * 
 * @SpringBootConfiguration(cf. @Configuration)
 * @ComponentScan 
 * @EnableAutoConfiguration
 *
 */
@SpringBootApplication
public class MyApplication {
	public static void main(String[] args) {
		try(ConfigurableApplicationContext c = SpringApplication.run(MyApplication.class, args)){
		}
	}
}
