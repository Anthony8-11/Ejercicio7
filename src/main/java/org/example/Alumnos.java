package org.example;

import java.util.ArrayList;

public class Alumnos {

    private String carnet;
    private String nombre;
    private String telefono;
    private String direccion;
    private ArrayList<CursoAsignado> cursoAsignados;
    private double sumaMensual;
    private double total;


    public void agregarCursoAsignado(CursoAsignado curso){

        cursoAsignados.add(curso);

    }

    public void getCostoMensual(){

        double t = 0;
        double total = t;
        for (CursoAsignado curso : cursoAsignados){
        t = t+curso.getCostoCurso();
        total= total+t;
        }
        this.sumaMensual = t;
        this.total = total;
    }



    public Alumnos(String carnet, String nombre, String telefono, String direccion) {
        this.carnet = carnet;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.cursoAsignados = new ArrayList<>();

    }

    @Override
    public String toString(){
        return "Carnet: "+this.carnet+"Nombre: "+this.nombre+"Direccion: "+this.direccion;
    }

    public String getCarnet() {
        return carnet;
    }

    public double getSumaMensual() {
        return sumaMensual;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<CursoAsignado> getCursoAsignados() {
        return cursoAsignados;
    }

    public void setCursoAsignados(ArrayList<CursoAsignado> cursoAsignados) {
        this.cursoAsignados = cursoAsignados;
    }

    public void mostrarInformacion(){
        System.out.println("\nNombre: "+this.nombre);
        //System.out.println("Curso Asignado: "+this.cursoAsignados);
        for (CursoAsignado curso : cursoAsignados){
            System.out.println("Curso: "+curso.getNombreCurso());
            System.out.println("Costo: "+curso.getCostoCurso());
            System.out.println("----------------");
            getCostoMensual();


        }

        System.out.println("Total: "+this.sumaMensual);
        System.out.println("Total Final: "+this.total);


    }

}
