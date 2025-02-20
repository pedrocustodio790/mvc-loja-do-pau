package com.example.demo.Models;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Cliente {

public int idCliente;
public String NomeCliente;
public String ClienteCpf;
public Cliente(int idCliente, String NomeCliente, String Clientecpf){
    this.idCliente = idCliente;
    this.NomeCliente = NomeCliente;
    this.ClienteCpf = Clientecpf;
}
public void InformacoesCliente(){
System.out.println("cpf:" + ClienteCpf);
System.out.println("ID Cliente" + idCliente);
System.out.println("Nome" + NomeCliente);
    }
}
