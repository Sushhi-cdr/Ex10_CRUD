package com.example.Ex10.Controllers;

import com.example.Ex10.Models.Tarefa;
import com.example.Ex10.Services.ServicoTarefa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Tarefas")
public class ControleTarefa {

    @Autowired
    private ServicoTarefa servico;

    @PostMapping
    public Tarefa criar(@RequestBody Tarefa tarefa){
        return servico.criar(tarefa);
    }

    @GetMapping
    public List<Tarefa> listar(){
        return servico.listar();
    }

    @GetMapping("/{id}")
    public Tarefa buscarPorId(@PathVariable Long id){
        return servico.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        servico.deletar(id);
    }
}
