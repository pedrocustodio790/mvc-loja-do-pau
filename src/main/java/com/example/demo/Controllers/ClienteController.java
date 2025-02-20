package com.example.demo.Controllers;

import com.example.demo.BancodeDados.BancoDeProdutos;
import com.example.demo.Models.Cliente;
import com.example.demo.Models.Venda;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
public class ClienteController {
    public class ControladorCliente {
        private BancoDeProdutos banco = new BancoDeProdutos();

        public List<Cliente> listarClientes() {
            return banco.findAllCliente();
        }

        public void postarCliente(Cliente cliente) {
            banco.insertCliente(cliente);
        }

        public boolean atualizarCliente(Cliente cliente) {
            return banco.updateCliente(cliente);
        }

        public boolean deletarCliente(int id) {
            return banco.deleteCliente(id);
        }
    }

}
