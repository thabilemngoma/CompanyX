import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBoot2JdbcWithH2Application implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    ClientJdbcRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot2JdbcWithH2Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        logger.info("Client id 10001 -> {}", repository.findById(10001L));

        logger.info("Inserting -> {}", repository.insert(new client(10010L, "John", "A1234657")));

        logger.info("Update 10003 -> {}", repository.update(new client(10001L, "Name-Updated", "New-Surname")));

        repository.deleteById(10002L);

        logger.info("All users -> {}", repository.findAll());
    }
}