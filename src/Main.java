import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

       Curso  curso1 = new Curso();


        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso de Java");
        curso1.setCargaHoraria(8);
        System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição do curso de JavaScript");
        curso2.setCargaHoraria(8);
        System.out.println(curso2);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descrição mentoria de Java");
        mentoria1.setData(LocalDate.now());
        System.out.println(mentoria1);

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria JavaScript");
        mentoria2.setDescricao("Descrição mentoria de JavaScript");
        mentoria2.setData(LocalDate.now());
        System.out.println(mentoria2);


     BootCamp bootCamp = new BootCamp();
     bootCamp.setNome("BootCamp Java Developer");
     bootCamp.setDescricao("Descrição Java Developer");
     bootCamp.getConteudos().add(curso1);
     bootCamp.getConteudos().add(curso2);
     bootCamp.getConteudos().add(mentoria1);
     bootCamp.getConteudos().add(mentoria2);

     System.out.println();
     System.out.println("==============================================================");
     System.out.println();

     Dev developer1 = new Dev();
     developer1.setNome("Elaine");
     developer1.increverBootCamp(bootCamp);
     System.out.println("Conteúdos inscritos de Elaine: " + developer1.getConteudosInscritos());
     System.out.println();
     developer1.progredir();
     System.out.println();
     System.out.println("Conteúdos concluídos de Elaine: " + developer1.getConteudosConcluidos());
     System.out.println();
     System.out.println("Conteúdos para concluir de Elaine: " + developer1.getConteudosInscritos());
     System.out.println("XP: " + developer1.calcularXP());

     System.out.println();
     System.out.println("==============================================================");
     System.out.println();

     Dev developer2 = new Dev();
     developer2.setNome("Daniel");
     developer2.increverBootCamp(bootCamp);

     System.out.println("Conteúdos inscritos de Daniel: " + developer2.getConteudosInscritos());
     System.out.println();

     developer2.progredir();

     developer2.progredir();

     System.out.println();
     System.out.println("Conteúdos concluídos de Daniel: " + developer1.getConteudosConcluidos());
     System.out.println();

     System.out.println("Conteúdos para concluir de Daniel: " + developer2.getConteudosInscritos());
     System.out.println("XP: " + developer2.calcularXP());

    }
}
