/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Calendar;

/**
 *
 * @author ElJavi
 */
public abstract class ListaLugares {

    private static Lugar[] lista = new Lugar[250];

    //Elementos para guardar el archivo
    private static final String archivo = "arrayLugares.db";
    private static FileInputStream fis = null;
    private static ObjectInputStream ois = null;
    private static FileOutputStream fos = null;
    private static ObjectOutputStream oos = null;

    public static boolean addLugar(Lugar l) {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == null) {
                lista[i] = l;
                return true;
            }
        }
        return false;
    }

    public static Lugar[] getLista() {
        return lista;
    }

    public static void setLista(Lugar[] lista) {
        ListaLugares.lista = lista;
    }

    public static Lugar[] getBusquedaNombre(String nombreProfe) {
        Lugar[] auxName = new Lugar[250];
        int cont = 0;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] != null) {
                
                String[] nombre = lista[i].getProfe().getNombre().split(" ");
                
                if (lista[i].getProfe().getNombre().compareToIgnoreCase(nombreProfe) == 0){
                    auxName[cont] = lista[i];
                    cont++;
                } else if (nombre[0].compareToIgnoreCase(nombreProfe) == 0) {
                    auxName[cont] = lista[i];
                    cont++;
                } else if (nombre.length>=2){
                    if (nombre[1].compareToIgnoreCase(nombreProfe) == 0){
                        auxName[cont] = lista[i];
                        cont++;
                    }
                }
            }
        }
        return auxName;
    }
    
    public static Lugar[] getBusquedaCurso(String Curso) {
        Lugar[] auxCurs = new Lugar[250];
        int cont = 0;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] != null) {
                if (lista[i].getCurso().compareTo(Curso) == 0) {
                    auxCurs[cont] = lista[i];
                    cont++;
                }
            }
        }
        return auxCurs;
    }
    
    public static Lugar[] getHorarioActual(Calendar calActual) {
        
        Lugar[] auxActual = new Lugar[250];
        
        java.sql.Time actual = new java.sql.Time(calActual.get(Calendar.HOUR_OF_DAY)
                ,calActual.get(Calendar.MINUTE),0);
       
        int cont = 0;
        
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] != null) {
                // Si el horario actual esta despues de la hora de inicio del profesr y 
                // antes de la hora de fin del profesor:
                if (actual.after(lista[i].getHoraInicio()) && actual.before(lista[i].getHoraFin())) {
                    auxActual[cont] = lista[i];
                    cont++;
                }
            }
            
        }
        return auxActual;
    }

    public static Lugar[] getBusquedaEntreHorarios(Profesor[] profes) {
        Lugar[] auxHor = new Lugar[250];
        int cont = 0;
        try {
            for (int i = 0; i < profes.length; i++) {
                if (profes[i] != null) {
                    
                    for (int j = 0; j < lista.length; j++) {
                        if (profes[i].getNombre().compareTo(lista[j].getProfe().getNombre()) == 0) {
                            auxHor[cont] = lista[j];
                            cont++;
                            break;
                        }
                    }   
                }
            }
        } catch (Exception e){
            //JoptionPane Error
            System.out.println("Error: "+e);
        }
        return auxHor;
    }
    
    public static String getHoraProfe(int posicion){
        Lugar[] listaAux = getLista();
        String susHorarios = "";
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] != null) {
                if (listaAux[posicion].getProfe().getNombre().compareToIgnoreCase(lista[i].getProfe().getNombre())==0){
                    susHorarios = susHorarios
                            +"En  "+listaAux[i].getCurso()
                            +"  Desde "
                            +listaAux[i].getsHoraIncio()
                            +" A "+listaAux[i].getsHoraFin()
                            +"hs\n";
                }
            }
            
        }
        return susHorarios;
    }
    
    public static boolean saveLista() {
        try {
            fos = new FileOutputStream(archivo);
            oos = new ObjectOutputStream(fos);
            //for (Clase aux:array), recorre el array y se lo asigna al auxiliar.
            oos.writeObject(lista);

        } catch (FileNotFoundException ex) {
            return false;
        } catch (IOException ex) {
            return false;
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                    oos = null;
                }
                if (fos != null) {
                    fos.close();
                    fos = null;
                }
            } catch (IOException e) {
            }
        }

        return true;
    }

    public static boolean levantarObjeto() {
        Lugar[] aux = null;

        try {
            fis = new FileInputStream(archivo);
            ois = new ObjectInputStream(fis);

            aux = (Lugar[]) ois.readObject();

        } catch (Exception e1) {
            return false;
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                    ois = null;
                }
                if (fis != null) {
                    fis.close();
                    fis = null;
                }
            } catch (IOException e) {
            }
        }
        lista = aux;
        return true;
    }
}
