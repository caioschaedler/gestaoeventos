package br.edu.unisep.eventos.model;

import java.util.ArrayList;
import java.util.List;

public class Evento {


    private int id;
    private String nome;
    private String local;
    private List<Sessao> sessoes;

    // Construtor
    public Evento(int id, String nome, String local) {
        this.id = id;
        this.nome = nome;
        this.local = local;
        this.sessoes = new ArrayList<>();
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public List<Sessao> getSessoes() {
        return sessoes;
    }

    public void addSessao(Sessao sessao) {
        this.sessoes.add(sessao);
    }
}
