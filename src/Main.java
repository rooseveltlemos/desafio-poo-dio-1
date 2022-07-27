import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());
        
        System.out.println();		
        System.out.println("\t\t\t\t#1: " + curso1);
        System.out.println();
        System.out.println("\t\t\t\t#2: " + curso2);
        System.out.println();     
        System.out.println("\t\t\t\t#3: " + mentoria);
        System.out.println(); 
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");                
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("* Conteúdos onde Camila está inscrita:" + devCamila.getConteudosInscritos());
        devCamila.progredir();       
        devCamila.progredir();
        //devCamila.progredir();
        System.out.println("-");
        System.out.println("* Conteúdos que ainda não foram concluídos:" + devCamila.getConteudosInscritos());
        System.out.println("-");
        System.out.println("* Conteúdos que já foram concluídos:" + devCamila.getConteudosConcluidos());
        System.out.println("* O XP dela é:" + devCamila.calcularTotalXp());

        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");        
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("* Conteúdos onde João está inscrito:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("* Conteúdos que ainda não foram concluídos:" + devJoao.getConteudosInscritos());
        System.out.println("-");
        System.out.println("* Conteúdos que já foram concluidos:" + devJoao.getConteudosConcluidos());
        System.out.println("*O XP dele é:" + devJoao.calcularTotalXp());
        

    }

}
