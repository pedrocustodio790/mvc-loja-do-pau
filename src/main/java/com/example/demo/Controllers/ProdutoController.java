package com.example.demo.Controllers;

import com.example.demo.BancodeDados.BancoDeProdutos;
import com.example.demo.Models.Produto;


import java.util.List;

public class ProdutoController {

    BancoDeProdutos pf = new BancoDeProdutos();

    public void inserirnobanco(Produto m) {
        pf.insert(m);
    }

    public List<Produto> pegarprodutos() {
        return pf.findAll();
    }

    public void inserirNoBanco(Produto m) {
        pf.insert(m);
    }
}

