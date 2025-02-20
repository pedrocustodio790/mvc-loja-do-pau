package com.example.demo.Views;

import com.example.demo.Controllers.ProdutoController;
import com.example.demo.Models.Produto;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@NoArgsConstructor
public class ProdutoView{

    ProdutoController pc = new ProdutoController();

    @GetMapping("/produto")
    public List<Produto> getAllProdutos(){
        return pc.pegarprodutos();
    }

    @PostMapping("/produto")
    public String postNovoProduto(@RequestBody Produto m){
        pc.inserirNoBanco(m);
        return "Sucesso";
    }

}






