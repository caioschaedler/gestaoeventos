package br.edu.unisep.eventos.model;

import java.util.ArrayList;
import java.util.List;

public class Sessao {
    private int id;
    private String titulo;
    private String horario;
    private List<Palestrante> palestrantes;
    private List<Inscricao> inscricoes;

    // Construtor
    public Sessao(int id, String titulo, String horario) {
        this.id = id;
        this.titulo = titulo;
        this.horario = horario;
        this.palestrantes = new ArrayList<>();
        this.inscricoes = new ArrayList<>();
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public List<Palestrante> getPalestrantes() {
        return palestrantes;
    }

    public void addPalestrante(Palestrante palestrante) {
        this.palestrantes.add(palestrante);
    }

    public List<Inscricao> getInscricoes() {
        return inscricoes;
    }

    public void addInscricao(Inscricao inscricao) {
        this.inscricoes.add(inscricao);
    }
}
