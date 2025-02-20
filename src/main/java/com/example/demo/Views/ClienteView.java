package com.example.demo.Views;

import com.example.demo.Models.Cliente;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/cliente")
public class ClienteView {
    public ClienteView cc = new ClienteView();
    @GetMapping
    public List<ClienteView> getinformacaoCliente(){
        return cc.ListarClientes();
    }
    @PostMapping
    public String postInformationsClientes(@RequestBody Cliente cliente) {
        cc.postarCliente(cliente);
        return "Sucesso ao cadastrar";
    }

    @PutMapping
    public String putInformationsClientes(@RequestBody Cliente cliente){
        if(cc.atualizarCliente(cliente)){
            return "Sucesso ao atualizar o cliente!";
        } else {
            return "Falha ao atualizar o cliente...";
        }
    }

    @DeleteMapping("/{id}")
    public String deleteInformationsCliente(@RequestParam int id){
        if(cc.deletarCliente(id)){
            return "Deletado com sucesso";
        } else {
            return "Falha ao deletar...";
        }
    }
}}
