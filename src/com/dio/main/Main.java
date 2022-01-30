package com.dio.main;

import com.dio.models.Course;
import com.dio.models.Mentorship;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Course co = new Course();
        co.setTitle("Teste");
        co.setDescription("Teste realizado");
        co.setWorkload(5);

        System.out.println(co);

        Mentorship me = new Mentorship();
        me.setTitle("novo");
        me.setDescription("description");
        me.setDate(LocalDate.now());

        System.out.println(me);
    }
}
