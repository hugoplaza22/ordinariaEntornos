package Aplicacion;

import java.util.HashMap;

/**
 * La clase Personas representa una colección de personas con sus respectivas edades.
 * Permite realizar operaciones como agregar personas, obtener la edad mínima y vaciar la colección.
 * 
 * @author Hugo Plaza
 */
public class Personas {

    private HashMap<String, Integer> listadoPersonas;

    /**
     * Crea un objeto Personas con una colección vacía.
     */
    public Personas() {
        listadoPersonas = new HashMap<>();
    }

    /**
     * Vacía la colección de personas, eliminando todos los elementos.
     */
    public void vaciar() {
        listadoPersonas.clear();
    }

    /**
     * Agrega una persona a la colección con su respectivo nombre y edad.
     * 
     * @param nombre el nombre de la persona a agregar
     * @param edad   la edad de la persona a agregar
     * @throws Exception si la edad es negativa o si ya existe una persona con el mismo nombre
     */
    public void addPersona(String nombre, int edad) throws Exception {
        if (edad < 0) {
            throw new Exception("Edad incorrecta");
        } else if (listadoPersonas.containsKey(nombre)) {
            throw new Exception("Ya existe una persona con el nombre " + nombre);
        } else {
            listadoPersonas.put(nombre, edad);
        }
    }

    /**
     * Obtiene la edad mínima entre todas las personas de la colección.
     * 
     * @return la edad mínima
     * @throws Exception si no hay personas en la colección
     */
    public int edadMinima() throws Exception {
        if (listadoPersonas.isEmpty()) {
            throw new Exception("No hay personas");
        } else {
            int minimo = Integer.MAX_VALUE;
            for (int edad : listadoPersonas.values()) {
                if (edad < minimo) {
                    minimo = edad;
                }
            }
            return minimo;
        }
    }

}
