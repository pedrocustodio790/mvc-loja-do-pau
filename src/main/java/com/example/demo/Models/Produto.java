package com.example.demo.Models;

import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Produto {
    public int idProduto;
    public String nomeproduto;
    public Double preco;
    public Integer quantidade;
}
