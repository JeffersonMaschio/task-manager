package com.todo.demo.controller;

import com.todo.demo.model.Tarefa;
import com.todo.demo.repository.TarefaRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

    @Autowired
    private TarefaRepository tarefaRepository;

    @PostMapping
    public Tarefa criar(@Valid @RequestBody Tarefa tarefa) {
        tarefa.setDataCriacao(LocalDateTime.now());
        return tarefaRepository.save(tarefa);
    }

    @GetMapping
    public List<Tarefa> listarTodas() {
        return tarefaRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Tarefa> buscarPorId(@PathVariable Long id) {
        Optional<Tarefa> tarefa = tarefaRepository.findById(id);
        return tarefa.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Tarefa> atualizar(@PathVariable Long id, @RequestBody Tarefa novaTarefa) {
        Optional<Tarefa> tarefaExistente = tarefaRepository.findById(id);
        if (tarefaExistente.isPresent()) {
            Tarefa tarefa = tarefaExistente.get();
            tarefa.setTitulo(novaTarefa.getTitulo());
            tarefa.setConcluida(novaTarefa.isConcluida());
            return ResponseEntity.ok(tarefaRepository.save(tarefa));
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
       if (!tarefaRepository.existsById(id)) {
           return ResponseEntity.notFound().build();
       }
       tarefaRepository.deleteById(id);
       return ResponseEntity.noContent().build();
    }


}