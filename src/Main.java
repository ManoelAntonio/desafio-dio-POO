import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Curso curso1 =  new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição do curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 =  new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição do curso js");
        curso2.setCargaHoraria(4);

        Conteudo conteudo = new Curso();
        Conteudo conteudo1 = new Mentoria();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devZelao = new Dev();
        devZelao.setNome("Zelão");
        devZelao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Zelão:" + devZelao.getConteudosInscritos());

        devZelao.progredir();
        devZelao.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Zelão:" + devZelao.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Zelão:" + devZelao.getConteudosConcluidos());
        System.out.println("XP:" + devZelao.calcularTotalXp());


        System.out.println("--------");


        Dev devJohnWick = new Dev();
        devJohnWick.setNome("JohnWick");
        devJohnWick.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos JohnWick:" + devJohnWick.getConteudosInscritos());

        devJohnWick.progredir();
        devJohnWick.progredir();
        devJohnWick.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos JohnWick:" + devJohnWick.getConteudosInscritos());
        System.out.println("Conteudos Concluidos JohnWick:" + devJohnWick.getConteudosConcluidos());
        System.out.println("XP:" + devJohnWick.calcularTotalXp());


        System.out.println("--------");



    }
}