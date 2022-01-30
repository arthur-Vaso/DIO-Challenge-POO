package com.dio.main;

import com.dio.colors.ConsoleColors;
import com.dio.models.Bootcamp;
import com.dio.models.Course;
import com.dio.models.Dev;
import com.dio.models.Mentorship;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Course co1 = new Course();
        co1.setTitle("Boas-vindas ao Bootcamp GFT Start #3 Java");
        co1.setDescription("Conheça alguns colaboradores GFT Brasil e descubra porque " +
                "ela é referência em inovação e tecnologia!");

        Course co2 = new Course();
        co2.setTitle("Desafios Básicos- GFT Start #3 Java");
        co2.setDescription("Nesse teste você irá praticar através do desenvolvimento de algoritimos os conceitos " +
                "de pensamento computacional java.");
        co2.setWorkload(2);

        Mentorship me1 = new Mentorship();
        me1.setTitle("Abstraindo Situações do Mundo Real com Orientação a Objetos");
        me1.setDescription("Mentoria realizada pela DIO para retirar suas dúvidas sobre POO!");
        me1.setDate(LocalDate.now());

        Bootcamp bo = new Bootcamp();
        bo.setName("Bootcamp GFT #3 Java");
        bo.setDescription("Hey Dev, já considerou a possibilidade de se tornar ainda mais potente para o mercado, " +
                "se especializando na tecnologia de desenvolvimento mais utilizada no mundo? Se sim, este é o seu " +
                "momento de brilhar! O Bootcamp GFT Start #3 Java foi pensado exclusivamente para o seu desenvolvimento " +
                "na tecnologia de Java, contendo uma sequência completa de cursos, mentorias e desafios. Não perca essa " +
                "chance e inscreva-se já!");
        bo.getContents().add(co1);
        bo.getContents().add(co2);
        bo.getContents().add(me1);

        Dev dev1 = new Dev();
        dev1.setNome("Arthur");
        dev1.registerBootcamp(bo);
        System.out.print("\nConteudos " + ConsoleColors.GREEN + "inscritos" + ConsoleColors.RESET + " de " + ConsoleColors.BLUE_BOLD + dev1.getNome() + ":\n" + ConsoleColors.RESET);
        dev1.getSubscribedContents()
                .forEach(contents -> System.out.println(ConsoleColors.RED_BOLD_BRIGHT + " > " + ConsoleColors.RESET + contents.getTitle()));
        dev1.progress();
        dev1.progress();
        dev1.progress();
        System.out.print("\nConteudos " + ConsoleColors.GREEN + "restantes" + ConsoleColors.RESET + " de " + ConsoleColors.BLUE_BOLD + dev1.getNome() + ":\n" + ConsoleColors.RESET);
        dev1.getSubscribedContents()
                .forEach(contents -> System.out.println(ConsoleColors.RED_BOLD_BRIGHT + " > " + ConsoleColors.RESET + contents.getTitle()));
        System.out.print("\nConteudos " + ConsoleColors.GREEN + "concluídos" + ConsoleColors.RESET + " de " + ConsoleColors.BLUE_BOLD + dev1.getNome() + ":\n" + ConsoleColors.RESET);
        dev1.getCompletedContents()
                .forEach(contents -> System.out.println(ConsoleColors.RED_BOLD_BRIGHT + " > " + ConsoleColors.RESET + contents.getTitle()));

        Dev dev2 = new Dev();
        dev2.setNome("Carol");
        dev2.registerBootcamp(bo);

        System.out.print("\nConteudos " + ConsoleColors.GREEN + "inscritos" + ConsoleColors.RESET + " de " + ConsoleColors.BLUE_BOLD + dev2.getNome() + ":\n" + ConsoleColors.RESET);
        dev2.getSubscribedContents()
                .forEach(contents -> System.out.println(ConsoleColors.RED_BOLD_BRIGHT + " > " + ConsoleColors.RESET + contents.getTitle()));

        System.out.print("\nConteudos " + ConsoleColors.GREEN + "restantes" + ConsoleColors.RESET + " de " + ConsoleColors.BLUE_BOLD + dev2.getNome() + ":\n" + ConsoleColors.RESET);
        dev2.getSubscribedContents()
                .forEach(contents -> System.out.println(ConsoleColors.RED_BOLD_BRIGHT + " > " + ConsoleColors.RESET + contents.getTitle()));

        System.out.print("\nConteudos " + ConsoleColors.GREEN + "concluídos" + ConsoleColors.RESET + " de " + ConsoleColors.BLUE_BOLD + dev2.getNome() + ":\n" + ConsoleColors.RESET);
        dev2.getCompletedContents()
                .forEach(contents -> System.out.println(ConsoleColors.RED_BOLD_BRIGHT + " > " + ConsoleColors.RESET + contents.getTitle()));

        Dev dev3 = new Dev();
        dev3.setNome("Vitor");
        dev3.registerBootcamp(bo);

        System.out.print("\nConteudos " + ConsoleColors.GREEN + "inscritos" + ConsoleColors.RESET + " de " + ConsoleColors.BLUE_BOLD + dev3.getNome() + ":\n" + ConsoleColors.RESET);
        dev3.getSubscribedContents()
                .forEach(contents -> System.out.println(ConsoleColors.RED_BOLD_BRIGHT + " > " + ConsoleColors.RESET + contents.getTitle()));

        dev3.progress();

        System.out.print("\nConteudos " + ConsoleColors.GREEN + "restantes" + ConsoleColors.RESET + " de " + ConsoleColors.BLUE_BOLD + dev3.getNome() + ":\n" + ConsoleColors.RESET);
        dev3.getSubscribedContents()
                .forEach(contents -> System.out.println(ConsoleColors.RED_BOLD_BRIGHT + " > " + ConsoleColors.RESET + contents.getTitle()));

        System.out.print("\nConteudos " + ConsoleColors.GREEN + "concluídos" + ConsoleColors.RESET + " de " + ConsoleColors.BLUE_BOLD + dev3.getNome() + ":\n" + ConsoleColors.RESET);
        dev3.getCompletedContents()
                .forEach(contents -> System.out.println(ConsoleColors.RED_BOLD_BRIGHT + " > " + ConsoleColors.RESET + contents.getTitle()));

    }
}
