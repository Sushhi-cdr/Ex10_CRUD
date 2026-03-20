package com.example.Ex10.Repositories;

import com.example.Ex10.Models.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioTarefa extends JpaRepository<Tarefa, Long> {
}
