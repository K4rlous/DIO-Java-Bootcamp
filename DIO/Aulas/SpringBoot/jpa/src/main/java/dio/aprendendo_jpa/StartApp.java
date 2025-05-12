package dio.aprendendo_jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import dio.aprendendo_jpa.Model.User;
import dio.aprendendo_jpa.Repository.UserRepository;

@Component
public class StartApp implements CommandLineRunner{
    @Autowired
    private UserRepository repository;

    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setName("Carlos");
        user.setUsername("K4rlous");
        user.setPassword("dio123");

        repository.save(user);

        for(User u: repository.findAll()){
            System.out.println(u);
        }
    }
    
}
