/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Class;

import Ui.*;
import java.util.Calendar;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ElJavi
 */
public class Refresh {
    public static void refreshTable() {
        //Levantamos los datos a cargar
        Lugar[] listado = ListaLugares.getLista();

        //Creamos el modelo de datos de la tabla.
        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
            Object[][] data = {};
            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return getValueAt(0, columnIndex).getClass();
            }
        };

        model.addColumn("Lugar");
        model.addColumn("Profesor");
        model.addColumn("Curso");
        model.addColumn("Hora Inicio");
        model.addColumn("Hora Fin");

        for (int i = 0; i < listado.length; i++) {
            if (listado[i] != null) {
                Object[] fila = new Object[5];
                fila[0] = listado[i].getIcon();
                fila[1] = listado[i].getProfe().getNombre();
                fila[2] = listado[i].getCurso();
                fila[3] = listado[i].getsHoraIncio();
                fila[4] = listado[i].getsHoraFin();
                model.addRow(fila);
            }
        }
        Principal.tabla.setModel(model);
    }
    
    public static void refreshTableHora(Profesor[] profes) {
        //Levantamos los datos a cargar
        Lugar[] listado = ListaLugares.getBusquedaEntreHorarios(profes);

        //Creamos el modelo de datos de la tabla.
        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
            Object[][] data = {};
            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return getValueAt(0, columnIndex).getClass();
            }
        };

        model.addColumn("Lugar");
        model.addColumn("Profesor");
        model.addColumn("Curso");
        model.addColumn("Hora Inicio");
        model.addColumn("Hora Fin");

        for (int i = 0; i < listado.length; i++) {
            if (listado[i] != null) {
                Object[] fila = new Object[5];
                fila[0] = listado[i].getIcon();
                fila[1] = listado[i].getProfe().getNombre();
                fila[2] = listado[i].getCurso();
                fila[3] = listado[i].getsHoraIncio();
                fila[4] = listado[i].getsHoraFin();
                model.addRow(fila);
            }
        }
        Principal.tabla.setModel(model);
    }
    
    public static void refreshTableHoraActual(Calendar horaActual) {
        //Levantamos los datos a cargar
        Lugar[] listado = ListaLugares.getHorarioActual(horaActual);

        //Creamos el modelo de datos de la tabla.
        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
            Object[][] data = {};
            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return getValueAt(0, columnIndex).getClass();
            }
        };

        model.addColumn("Lugar");
        model.addColumn("Profesor");
        model.addColumn("Curso");
        model.addColumn("Hora Inicio");
        model.addColumn("Hora Fin");

        for (int i = 0; i < listado.length; i++) {
            if (listado[i] != null) {
                Object[] fila = new Object[5];
                fila[0] = listado[i].getIcon();
                fila[1] = listado[i].getProfe().getNombre();
                fila[2] = listado[i].getCurso();
                fila[3] = listado[i].getsHoraIncio();
                fila[4] = listado[i].getsHoraFin();
                model.addRow(fila);
            }
        }
        Principal.tabla.setModel(model);
    }
    
    public static void refreshTableCurso(String curso) {
        //Levantamos los datos a cargar
        Lugar[] listado = ListaLugares.getBusquedaCurso(curso);

        //Creamos el modelo de datos de la tabla.
        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
            Object[][] data = {};
            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return getValueAt(0, columnIndex).getClass();
            }
        };

        model.addColumn("Lugar");
        model.addColumn("Profesor");
        model.addColumn("Curso");
        model.addColumn("Hora Inicio");
        model.addColumn("Hora Fin");

        for (int i = 0; i < listado.length; i++) {
            if (listado[i] != null) {
                Object[] fila = new Object[5];
                fila[0] = listado[i].getIcon();
                fila[1] = listado[i].getProfe().getNombre();
                fila[2] = listado[i].getCurso();
                fila[3] = listado[i].getsHoraIncio();
                fila[4] = listado[i].getsHoraFin();
                model.addRow(fila);
            }
        }
        Principal.tabla.setModel(model);
    }
    
    
    public static void refreshTableNombre(String nombre) {
        //Levantamos los datos a cargar
        Lugar[] listado = ListaLugares.getBusquedaNombre(nombre);

        //Creamos el modelo de datos de la tabla.
        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
            Object[][] data = {};
            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return getValueAt(0, columnIndex).getClass();
            }
        };

        model.addColumn("Lugar");
        model.addColumn("Profesor");
        model.addColumn("Curso");
        model.addColumn("Hora Inicio");
        model.addColumn("Hora Fin");

        for (int i = 0; i < listado.length; i++) {
            if (listado[i] != null) {
                Object[] fila = new Object[5];
                fila[0] = listado[i].getIcon();
                fila[1] = listado[i].getProfe().getNombre();
                fila[2] = listado[i].getCurso();
                fila[3] = listado[i].getsHoraIncio();
                fila[4] = listado[i].getsHoraFin();
                model.addRow(fila);
            }
        }
        Principal.tabla.setModel(model);
    }
}
