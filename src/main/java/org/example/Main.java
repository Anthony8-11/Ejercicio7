package org.example;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<CursoAsignado> cat_curso = new ArrayList<>();
        cat_curso.add(new CursoAsignado(101,"Programacion",500));
        cat_curso.add(new CursoAsignado(105,"Derecho",1));
        cat_curso.add(new CursoAsignado(110,"Estadistica",450));
        cat_curso.add(new CursoAsignado(120,"Electronica",400));



        Alumnos al1 = new Alumnos("2023015","Andrea","55555","5 calle 8-36");
        System.out.println("Total alumno: "+al1.getNombre()+" Q: ",al1.getCostoTotal());


        Alumnos al2 = new Alumnos("2023015","Paco","55555","5 calle 8-26");
//        al1.agregarCursoAsignado(cat_curso.get(1));
//        al1.agregarCursoAsignado(cat_curso.get(2));
//        al1.agregarCursoAsignado(cat_curso.get(1));
//        al1.agregarCursoAsignado(cat_curso.get(2));
        System.out.println(al1.getSumaMensual()+al2.getSumaMensual());


//        Alumnos al3 = new Alumnos("2345564","Mario","66666","8 calle 0-66");
//        al1.agregarCursoAsignado(cat_curso.get(1));
//        al1.agregarCursoAsignado(cat_curso.get(2));
//
//        Alumnos al4 = new Alumnos("2345677","Jose","77777","9 calle 9-67");
//        al1.agregarCursoAsignado(cat_curso.get(1));
//        al1.agregarCursoAsignado(cat_curso.get(2));


        //al1.mostrarInformacion();

        for (CursoAsignado curso : al1.getCursoAsignados()){
            System.out.println("Nombre del curso: "+al1.getCursoAsignados());
            System.out.println("Costo: "+curso.getCostoCurso());

        }





//        Alumnos al2 = new Alumnos("2022020","Monica","11111","6 calle 5-78");
//        al2.agregarCursoAsignado(curso1);
//        al2.agregarCursoAsignado(curso4);
//        al2.agregarCursoAsignado(curso2);
//        al2.mostrarInformacion();
    }
}