package poo.desafio.bootcamp;


import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso cursoPOO = new Curso();
        cursoPOO.setTitulo("Curso POO");
        cursoPOO.setDescricao("Descrição do curso de POO");
        cursoPOO.setCargaHoraria(4);

        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Curso Java");
        cursoJava.setDescricao("Descrição do curso de Java");
        cursoJava.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição da mentoria de Java");
        mentoria.setData(LocalDate.now());
        
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Backend");
        bootcamp.setDescricao("Descrição do Bootcamp de Java Backend");
        bootcamp.getConteudos().add(cursoPOO);
        bootcamp.getConteudos().add(cursoJava);
        bootcamp.getConteudos().add(mentoria);

        Dev devGabriella = new Dev();
        devGabriella.setNome("Gabriella");
        devGabriella.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de Gabriella:" + devGabriella.getConteudosInscritos());
        devGabriella.progredir();
        devGabriella.progredir();

        System.out.println("-----");
        System.out.println("Conteúdos Inscritos de Gabriella:" + devGabriella.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos por Gabriella:" + devGabriella.getConteudosConcluidos());
        System.out.println("XP:" + devGabriella.calcularTotalXp());

    }

}