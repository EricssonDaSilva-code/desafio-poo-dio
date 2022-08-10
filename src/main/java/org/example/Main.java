package org.example;

import org.example.dominio.BootCamp;
import org.example.dominio.Curso;
import org.example.dominio.Dev;
import org.example.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescrição("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso1.setTitulo("Curso JS");
        curso1.setDescrição("Descrição curso JS");
        curso1.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescrição("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());

        /*
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
        */

        BootCamp bootCamp = new BootCamp();
        bootCamp.setName("Bootcamp Java Developer");
        bootCamp.setDescrição("Descrição Bootcamp Java Developer");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria);

        Dev devEricsson = new Dev();
        devEricsson.setName("Ericsson");
        devEricsson.inscreverBootCamp(bootCamp);
        System.out.println("Conteudos inscritos" + devEricsson.getConteudosInscritos());
        devEricsson.progress();
        System.out.println("-");
        System.out.println("Conteudos inscritos" + devEricsson.getConteudosInscritos());
        System.out.println("Conteudos concluidos" + devEricsson.getConteudosConcluidos());
        System.out.println("XP:" + devEricsson.calcularTotalXp());

        System.out.println("-----------------------------------");

        Dev devTainara = new Dev();
        devTainara.setName("Tainara");
        devTainara.inscreverBootCamp(bootCamp);
        System.out.println("Conteudos inscritos" + devTainara.getConteudosInscritos());
        devTainara.progress();
        devTainara.progress();
        devTainara.progress();
        System.out.println("-");
        System.out.println("Conteudos inscritos" + devTainara.getConteudosInscritos());
        System.out.println("Conteudos concluidos" + devTainara.getConteudosConcluidos());
        System.out.println("XP:" + devTainara.calcularTotalXp());
    }
}