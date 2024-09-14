package br.edu.unisep.eventos.model;

public class Inscricao {
    private int id;
    private Participante participante;
    private Sessao sessao;

    // Construtor
    public Inscricao(int id, Participante participante, Sessao sessao) {
        this.id = id;
        this.participante = participante;
        this.sessao = sessao;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Participante getParticipante() {
        return participante;
    }

    public void setParticipante(Participante participante) {
        this.participante = participante;
    }

    public Sessao getSessao() {
        return sessao;
    }

    public void setSessao(Sessao sessao) {
        this.sessao = sessao;
    }
}
