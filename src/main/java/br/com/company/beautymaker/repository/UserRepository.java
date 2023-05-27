package br.com.company.beautymaker.repository;


import br.com.company.beautymaker.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}