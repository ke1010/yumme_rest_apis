package food.delivery.yumme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

@SpringBootApplication
public class YummeApplication {

	public static void main(String[] args) {
		SpringApplication.run(YummeApplication.class, args);

	}
}
