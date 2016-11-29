package kndev.debug.sdndebug;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

import kndev.module.neo4j.repo.INeo4jRepo;
import lombok.val;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableNeo4jRepositories("kndev.module.neo4j.repo")
@EntityScan({
	"kndev.model.neo4j.outline"})
public class App 
{
	@Autowired
	INeo4jRepo neo4jRepo;
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }

    @Bean
    public boolean testNeoj() {
		val node =  neo4jRepo.findOne(10L,2);
		
		node.getPhrases().forEach(System.out::println);
		node.getChildNodes().forEach(System.out::println);
		System.out.println(node);

		return true;
	}
    
}
