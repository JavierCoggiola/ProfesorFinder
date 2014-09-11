/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.io.Serializable;
import javax.swing.ImageIcon;
import java.sql.Time;

/**
 *
 * @author ElJavi
 */
public class Lugar implements Serializable{

    public final ImageIcon Curso = new ImageIcon(getClass().getResource("/Imagenes/Curso.png"));
    public final ImageIcon EducacionFisica = new ImageIcon(getClass().getResource("/Imagenes/EducacionFisica.png"));
    public final ImageIcon Programacion = new ImageIcon(getClass().getResource("/Imagenes/Programacion.png"));
    public final ImageIcon Quimica = new ImageIcon(getClass().getResource("/Imagenes/Quimica.png"));
    public final ImageIcon Taller = new ImageIcon(getClass().getResource("/Imagenes/Taller.png"));
    
    private String nombreLugar;
    private Profesor profe;
    private String curso;
    private String sHoraIncio, sHoraFin;

    public Lugar(String nombreLugar, Profesor profe, String curso, String sHoraIncio, String sHoraFin) {
        this.nombreLugar = nombreLugar;
        this.profe = profe;
        this.curso = curso;
        this.sHoraIncio = sHoraIncio;
        this.sHoraFin = sHoraFin;

    }

    public String getsHoraIncio() {
        return sHoraIncio;
    }

    public void setsHoraIncio(String sHoraIncio) {
        this.sHoraIncio = sHoraIncio;
    }

    public String getsHoraFin() {
        return sHoraFin;
    }

    public void setsHoraFin(String sHoraFin) {
        this.sHoraFin = sHoraFin;
    }

    public String getNombreLugar() {
        return nombreLugar;
    }

    public void setNombreLugar(String nombreLugar) {
        this.nombreLugar = nombreLugar;
    }

    public Profesor getProfe() {
        return profe;
    }

    public void setProfe(Profesor profe) {
        this.profe = profe;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public ImageIcon getIcon(){
        if ("Taller".equals(this.nombreLugar)){
            return Taller;
        }
        if ("Laboratorio".equals(this.nombreLugar)){
            return Quimica;
        }
        if ("Educación Física".equals(this.nombreLugar)){
            return EducacionFisica;
        }
        if ("Aula".equals(this.nombreLugar)){
            return Curso;
        }        
        return Programacion;
    }
    
    public java.sql.Time getHoraInicio(){
        String[] tiempo = sHoraIncio.split(":");
        java.sql.Time hora = new java.sql.Time(Integer.parseInt(tiempo[0]),Integer.parseInt(tiempo[1]),0);
        return hora;
    }
    public java.sql.Time getHoraFin(){
        String[] tiempo = sHoraFin.split(":");
        java.sql.Time hora = new java.sql.Time(Integer.parseInt(tiempo[0]),Integer.parseInt(tiempo[1]),0);
        return hora;
    }
}
