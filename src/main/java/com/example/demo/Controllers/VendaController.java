package com.example.demo.Controllers;



import com.example.demo.BancodeDados.BancoDeProdutos;
import com.example.demo.Models.Cliente;
import com.example.demo.Models.Produto;
import com.example.demo.Models.Venda;
import org.yaml.snakeyaml.events.Event;

import java.security.PublicKey;
import java.util.List;

public class VendaController {
 private BancoDeProdutos = new BancoDeProdutos();

  public List<Produto> listarvenda(){
    return BancoDeProdutos.findAllvenda();
  }
 public void postarvenda(Venda venda){
   BancoDeProdutos.insertVenda(venda);
 }
 public boolean atualizarVenda(Venda venda){
   return BancoDeProdutos.updatevenda(venda);
 }
  public boolean deletarVenda(int id){
   return BancoDeProdutos.deletarvendas(id);
  }
}