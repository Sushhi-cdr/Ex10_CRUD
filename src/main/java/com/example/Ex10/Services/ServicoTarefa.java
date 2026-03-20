package com.example.Ex10.Services;

import com.example.Ex10.Models.Tarefa;
import com.example.Ex10.Repositories.RepositorioTarefa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicoTarefa {

    @Autowired
    private RepositorioTarefa repositorio;

    public Tarefa criar(Tarefa tarefa){
        return repositorio.save(tarefa);
    }

    public List<Tarefa> listar(){
        return repositorio.findAll();
    }

    public Tarefa buscarPorId(Long id){
        return repositorio.findById(id).orElse(null);
    }

    public void deletar(Long id){
        repositorio.deleteById(id);
    }
}
