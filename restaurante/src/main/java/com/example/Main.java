package com.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante("LOS CAREROS", "Oriental", "3F, 227-1 Sinseon-ro, Nam-gu, Busán", 20, "10:00 AM", "17:00 PM", 10, new ArrayList<>(), new HashMap<>());

        List<String> menu = new ArrayList<>();
        menu.add("Huevo");
        menu.add("Carne");
        menu.add("Quesito");
        menu.add("Arroz");
        restaurante.setMenu(menu);

        //Asignación de precios
        Map<String, Double> precioPlato = new HashMap<>();
        precioPlato.put("Huevo", 2.000);
        precioPlato.put("Carne", 5.000);
        precioPlato.put("Quesito", 3.000);
        precioPlato.put("Arroz", 2.500);
        restaurante.setPrecioPlato(precioPlato);

        //Mostrar el menú     
        System.out.println("Menú del Restaurante: ");
        restaurante.mostrarMenu();

        //Reservar la mesa
        System.out.println("Reservando la mesa... ");
        restaurante.reservarMesa(11);

        //Calcular la factura
        List<String> pedido = new ArrayList<>();
        pedido.add("Huevo");
        pedido.add("Arroz");
        restaurante.calcularFactura(pedido);
        

        //Total del pedido
        System.out.println("Total de la factura: $");






    }
}