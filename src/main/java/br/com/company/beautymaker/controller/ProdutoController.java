package br.com.company.beautymaker.controller;


import br.com.company.beautymaker.model.Produto;
import br.com.company.beautymaker.model.User;
import br.com.company.beautymaker.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoController {


    @Autowired
    private ProdutoRepository produtoRepository;

    @GetMapping("/")
    public List<Produto> getProduto() {
        return produtoRepository.findAll();
    }

    @PostMapping("/")
    public Produto createProduto(@RequestBody Produto produto) {
        return produtoRepository.save(produto);
    }


}
