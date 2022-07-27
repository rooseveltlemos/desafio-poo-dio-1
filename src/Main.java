import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Introdução à Linguagem Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Introdução à Linguagem JS");
        curso2.setCargaHoraria(4); 

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Aplicações da Linguagem Java");
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
        bootcamp.setDescricao("Neste Bootcamp você aprenderá desde os fundamentos dessa linguagem de programação até o uso de abstrações poderosas como o Spring Framework.");
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
