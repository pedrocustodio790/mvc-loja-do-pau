package com.example.demo.BancodeDados;



import com.example.demo.Models.Cliente;
import com.example.demo.Models.Produto;
import com.example.demo.Models.Venda;

import java.util.ArrayList;
import java.util.List;

public class BancoDeProdutos {
    public static boolean deletarvendas;
    private List<Produto> produtos;

    public BancoDeProdutos() {
        this.produtos = new ArrayList<>();
    }

    public static List<Produto> findAllvenda() {
        return null;
    }

    public static void insertVenda(Venda venda) {
    }

    public static boolean updatevenda(Venda venda) {
        return false;
    }

    public static boolean deletarvendas(int id) {
        return false;
    }

    public void insert(Produto m) {
        produtos.add(m);
    }

    public Produto findOne(int id) {
        for (Produto m : produtos) {
            if (m.getIdProduto() == id) {
                return m;
            }
        }
        return null;
    }

    public List<Produto> findAll() {
        return new ArrayList<>(produtos);
    }

    public boolean update(Produto m) {
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getIdProduto() == m.getIdProduto()) {
                produtos.set(i, m);
                return true;
            }
        }
        return false;
    }


    public boolean delete(int id) {
        return produtos.removeIf(m -> m.getIdProduto() == id);
    }

    public boolean deleteCliente(int id) {
        return false;
    }

    public boolean updateCliente(Cliente cliente) {
        return false;
    }

    public void insertCliente(Cliente cliente) {
    }

    public List<Cliente> findAllCliente() {
        return null;
    }
}