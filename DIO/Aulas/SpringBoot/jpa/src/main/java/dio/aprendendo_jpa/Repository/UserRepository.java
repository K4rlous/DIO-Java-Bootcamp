package dio.aprendendo_jpa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dio.aprendendo_jpa.Model.User;

public interface UserRepository extends JpaRepository<User, Integer>{ // <- Usaremos o repositório User e o id dele é Integer
    
}
