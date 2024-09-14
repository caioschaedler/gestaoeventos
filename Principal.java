package br.edu.unisep.eventos.view;

import br.edu.unisep.eventos.model.*;

public class Principal {
    public static void main(String[] args) {
    // Criando palestrantes
    Palestrante palestrante1 = new Palestrante(1, "Dr. Ana Costa", "Tecnologia");
    Palestrante palestrante2 = new Palestrante(2, "Prof. João Lima", "Educação");

    // Criando sessões
    Sessao sessao1 = new Sessao(1, "Inovação em Tecnologia", "10:00 - 11:00");
    Sessao sessao2 = new Sessao(2, "Metodologias de Ensino", "11:30 - 12:30");

    // Adicionando palestrantes às sessões
    sessao1.addPalestrante(palestrante1);
    sessao2.addPalestrante(palestrante2);

    // Criando participantes
    Participante participante1 = new Participante(1, "Carlos Pereira", "carlos@gmail.com");
    Participante participante2 = new Participante(2, "Maria Oliveira", "maria@icloud.com");

    // Criando eventos
    Evento evento = new Evento(1, "Tech & Education Conference", "Centro de Convenções");

    // Adicionando sessões ao evento
    evento.addSessao(sessao1);
    evento.addSessao(sessao2);

    // Criando inscrições
    Inscricao inscricao1 = new Inscricao(1, participante1, sessao1);
    Inscricao inscricao2 = new Inscricao(2, participante2, sessao2);

    // Adicionando inscrições às sessões
    sessao1.addInscricao(inscricao1);
    sessao2.addInscricao(inscricao2);

    // Exibindo informações
    System.out.println("Evento:");
    System.out.println("ID: " + evento.getId());
    System.out.println("Nome: " + evento.getNome());
    System.out.println("Local: " + evento.getLocal());

    System.out.println("\nSessões:");
    for (Sessao sessao : evento.getSessoes()) {
        System.out.println("ID: " + sessao.getId());
        System.out.println("Título: " + sessao.getTitulo());
        System.out.println("Horário: " + sessao.getHorario());

        System.out.println("Palestrantes:");
        for (Palestrante palestrante : sessao.getPalestrantes()) {
            System.out.println(" - " + palestrante.getNome() + " (" + palestrante.getEspecialidade() + ")");
        }

        System.out.println("Inscrições:");
        for (Inscricao inscricao : sessao.getInscricoes()) {
            System.out.println(" - " + inscricao.getParticipante().getNome() + " (" + inscricao.getParticipante().getEmail() + ")");
        }
    }
}
}

