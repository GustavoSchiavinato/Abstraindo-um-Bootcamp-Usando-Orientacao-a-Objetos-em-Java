import java.time.LocalDate;

import br.com.dio.desafio.dominio.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição Curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Memoria Java");
        mentoria.setDescricao("Descrição memoria Java");
        mentoria.setData(LocalDate.now());

/*      System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria); */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devGustavo = new Dev();
        devGustavo.setNome("Gustavo");
        devGustavo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de Gustavo " + devGustavo.getConteudosInscritos());
        System.out.println();
        devGustavo.progredir();
        devGustavo.progredir();
        devGustavo.progredir();
        System.out.println("---");
        System.out.println("Conteúdos Inscritos de Gustavo " + devGustavo.getConteudosInscritos());
        System.out.println();
        System.out.println("Conteúdos Concluídos de Gustavo " + devGustavo.getConteudosConcluidos());
        System.out.println();
        System.out.println("XP: " + devGustavo.calcularTotalXp());
        System.out.println();

        System.out.println("*****");
        System.out.println();

        Dev devJarbas = new Dev();
        devJarbas.setNome("Jarbas");
        devJarbas.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de Jarbas " + devJarbas.getConteudosInscritos());
        System.out.println();
        devJarbas.progredir();
        System.out.println("---");
        System.out.println("Conteúdos Inscritos de Jarbas " + devJarbas.getConteudosInscritos());
        System.out.println();
        System.out.println("Conteúdos Concluídos de Jarbas " + devJarbas.getConteudosConcluidos());
        System.out.println();
        System.out.println("XP: " + devJarbas.calcularTotalXp());
        System.out.println();


    }
}
