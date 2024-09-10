package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Restaurante {

    //Definición de los atributos
    private String nombre;
    private String tipoCocina;
    private String direccion;
    private int capacidad;
    private String horarioApertura;
    private String horarioCierre;
    private int mesasDisponibles;
    private List<String> menu;
    private Map<String, Double> precioPlato;



    //Constructores

    //Por defecto 
    public Restaurante() {
        this.nombre = "sin nombre";
        this.tipoCocina = "sin tipo";
        this.direccion = "sin direccion";
        this.capacidad = 0;
        this.horarioApertura = "sin horario apertura";
        this.horarioCierre = "sin horario cierre";
        this.mesasDisponibles = 0;
        this.menu = new ArrayList<>();
        this.precioPlato = new HashMap<>();
    }

    //Completo 
    public Restaurante(String nombre, String tipoCocina, String direccion, int capacidad, String horarioApertura, String horarioCierre, int mesasDisponibles, List<String> menu, Map<String, Double> precioPlato) {
        this.nombre = nombre;
        this.tipoCocina = tipoCocina;
        this.direccion = direccion;
        this.capacidad = capacidad;
        this.horarioApertura = horarioApertura;
        this.horarioCierre = horarioCierre;
        this.mesasDisponibles = mesasDisponibles;
        this.menu = menu;
        this.precioPlato = new HashMap<>();
    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoCocina(){
        return tipoCocina;
    }

    public void setTipoCocina(String tipoCocina){
        this.tipoCocina = tipoCocina;
     }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getHorarioApertura() {
        return horarioApertura;
    }

    public void setHorarioApertura(String horarioApertura) {
        this.horarioApertura = horarioApertura;
    }

    public String getHorarioCierre() {
        return horarioCierre;
    }

    public void setHorarioCierre(String horarioCierre) {
        this.horarioCierre = horarioCierre;
    }

    public int getMesasDisponibles() {
        return mesasDisponibles;
    }

    public void setMesasDisponibles(int mesasDisponibles) {
        this.mesasDisponibles = mesasDisponibles;
    }

    public List<String> getMenu() {
        return menu;
    }

    public void setMenu(List<String> menu) {
        this.menu = menu;
    }

    public Map<String, Double> getprecioPlatos(){
        return precioPlato;
    }

    public void setPrecioPlato(Map<String, Double> precioPlato){
        this.precioPlato = precioPlato;
    }
    



    //Métodos publicos

    //Recorre la lista y muestra el plato por separado
    public void mostrarMenu (){
        
        for (String plato:menu){
            System.out.println(plato);
        }
    }

    //Verifica si hay mesas y muestra si hay disponibles o no 
    public void reservarMesa(int numeroPersonas){
        if (mesasDisponibles > 0) {
            mesasDisponibles--;
            System.out.println("¡Mesa reservada con exito!");
        } else {
            System.out.println("¡Lo sentimos, no hay mesas diponibles!");
        }
    }


    //Método privado calcular el precio del plato
    private double calcularPrecioPlato(String nombrePlato){
        Double precio = precioPlato.get(nombrePlato.toLowerCase());
            if(precio != null){
                return precio; 
            } else {
                System.out.println("El plato" + nombrePlato + "no está.");
                return 0.0;
            }
    }

    
    //Implementar el método factura
    public void calcularFactura(List<String> platosPedido){
        Double totalFactura = 0.0;
        System.out.println("Factura del Restaurante: " + nombre);
        System.out.println("-------------------------------");

        for(String plato : platosPedido){
            double precio = calcularPrecioPlato(plato);
            totalFactura += precio;
            System.out.println("Plato: " + plato + " - Precio: $" + precio);
        }

        System.out.println("---------------------");
        System.out.println("Total a pagar: $" + totalFactura);
    }






}