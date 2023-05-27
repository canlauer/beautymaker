package br.com.company.beautymaker.repository;

import br.com.company.beautymaker.model.Produto;
import br.com.company.beautymaker.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProdutoRepository extends MongoRepository<Produto, String> {

}
