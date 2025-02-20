package com.example.demo.Models;


import lombok.*;
import java.time.LocalDate;
import java.util.ArrayList;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Venda {
    public int idVenda;
    public LocalDate dataVenda;
    public ArrayList<Produto> produtos;
    public  Cliente cliente;

}
