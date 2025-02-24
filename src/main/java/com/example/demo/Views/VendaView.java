package com.example.demo.Views;

import com.example.demo.Controllers.VendaController;
import com.example.demo.Models.Venda;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class VendaView {
}
@RestController
@RequestMapping
class Vendaview{
    private final VendaController cv;

    public Vendaview(VendaController cv) {
        this.cv = cv;
    }
    @GetMapping
    public List<Venda> getInformationsVendas(){
        return cv.listarVendas();
    }

    @PostMapping
    public void postInformationsVendas(@RequestBody Venda venda){
        cv.postarVenda(venda);
    }

    @PutMapping
    public String putInformationsVendas(@RequestBody Venda venda){
        if(cv.atualizarVenda(venda)){
            return "Sucesso ao atualizar a venda!";
        } else {
            return "Falha ao atualizar a venda...";
        }
    }

    @DeleteMapping("/{id}")
    public String deleteInformationsVendas(@RequestParam int id){
        if(cv.deletarVenda(id)){
            return "Deletado com sucesso!";
        } else {
            return "Falha ao deletar...";
        }
    }




}