package edu.ceis.umss.laberinto.test.coleccion.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 */
public class Main {

    public static void main(String[] args) {
        // write your code here
        Map<Integer, String> contactos = new HashMap<>();
        contactos.put(772727227, "Jhoselin");
        contactos.put(772727256, "Camila");
        contactos.put(772723227, "Franz");
        contactos.put(774564527, "Jose");
        contactos.put(773242347, "Coco");

        System.out.println("Contactos son = [" + contactos.size() + "]");
        contactos.size();

        contactos.entrySet();
        for (Map.Entry<Integer, String> entrada : contactos.entrySet()) {
            System.out.print("nombre = [" + entrada.getValue() + "]");
            System.out.println("numero = [" + entrada.getKey() + "]");
        }
        for (String valor : contactos.values()) {
            System.out.println("nombre = [" + valor + "]");
            System.out.println("tamanio = [" + valor.length() + "]");
        }
        for (Integer numeroTelefonicos : contactos.keySet()) {
            System.out.println("numero = [" + numeroTelefonicos + "]");
        }

        List<String> agenda = new ArrayList<>();
        agenda.add("Marcos");
        agenda.add("Fabio");
        agenda.add("Maria");
        agenda.add("Marta");
        agenda.add("Roberto");
        agenda.add("Sergio");
        agenda.add("None");

        System.out.println("Cantidad de contactos = ["
                + agenda.size() + "]");
        for (String nombre : agenda) {
            System.out.println("nombre = [" + nombre + "]");
        }
    }
}
