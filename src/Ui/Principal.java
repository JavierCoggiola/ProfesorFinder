package Ui;

import Class.*;
import Class.Reloj;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
/**
 *
 * @author ElJavi
 */
public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        setLocationRelativeTo(null); //centrar
        setResizable(false); //NO redimensionar
        setTitle("ProfesorTracker");

        ListaLugares.levantarObjeto();
        Refresh.refreshTable();
        lblResult.setText("");

        //Creacion clase reloj y seteo Dia 
        Reloj reloj = new Reloj(0, 0, 0, 0); //Crea el Reloj a utilizar
        lblDia.setText(dias[diaSemana - 1]);
        lblDia.setFont(new java.awt.Font("Comic Sans", 1, 14));//tipo de letra y tamaño
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        diaHorario = new javax.swing.JDialog();
        jLabel7 = new javax.swing.JLabel();
        btnBuscarHorario = new javax.swing.JButton();
        btnHorarioActual = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        lblSetHora = new javax.swing.JTextField();
        lblSetMinutos = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lblSetHora1 = new javax.swing.JTextField();
        lblSetMinutos1 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        diaNombre = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnBuscarNombre = new javax.swing.JButton();
        diaCurso = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        btnBuscarCurso = new javax.swing.JButton();
        cmbDiaCurso = new javax.swing.JComboBox();
        diaAdd = new javax.swing.JDialog();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        txtNombreProfe = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        lblSetMinutosNuevo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        lblSetHoraNuevo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblSetHoraFin = new javax.swing.JTextField();
        lblSetMinutosFin = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        cmbCurso = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        cmbLugar = new javax.swing.JComboBox();
        diaVerHorarios = new javax.swing.JDialog();
        lblProfesHorario = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtHorasProfes = new javax.swing.JTextArea();
        lblNombreProfesHorario = new javax.swing.JLabel();
        cmbElige = new javax.swing.JComboBox();
        btnBuscar = new javax.swing.JButton();
        lblHora = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblDia = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        lblResult = new javax.swing.JLabel();
        btnHorarios = new javax.swing.JButton();

        jLabel7.setText("Desde");

        btnBuscarHorario.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnBuscarHorario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Reloj.png"))); // NOI18N
        btnBuscarHorario.setText("Buscar");
        btnBuscarHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarHorarioActionPerformed(evt);
            }
        });

        btnHorarioActual.setBackground(java.awt.Color.lightGray);
        btnHorarioActual.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnHorarioActual.setText("Buscar por horario actual");
        btnHorarioActual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHorarioActualActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jLabel2.setText("Seleccione entre que horarios buscar");

        lblSetHora.setText("00");
        lblSetHora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSetHoraMouseClicked(evt);
            }
        });
        lblSetHora.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                lblSetHoraFocusLost(evt);
            }
        });

        lblSetMinutos.setText("00");
        lblSetMinutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSetMinutosMouseClicked(evt);
            }
        });
        lblSetMinutos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                lblSetMinutosFocusLost(evt);
            }
        });

        jLabel8.setText(":");

        jLabel9.setText("hs");

        jLabel18.setText("A");

        lblSetHora1.setText("00");
        lblSetHora1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSetHora1MouseClicked(evt);
            }
        });
        lblSetHora1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                lblSetHora1FocusLost(evt);
            }
        });

        lblSetMinutos1.setText("00");
        lblSetMinutos1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSetMinutos1MouseClicked(evt);
            }
        });
        lblSetMinutos1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                lblSetMinutos1FocusLost(evt);
            }
        });

        jLabel19.setText(":");

        jLabel20.setText("hs");

        javax.swing.GroupLayout diaHorarioLayout = new javax.swing.GroupLayout(diaHorario.getContentPane());
        diaHorario.getContentPane().setLayout(diaHorarioLayout);
        diaHorarioLayout.setHorizontalGroup(
            diaHorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(diaHorarioLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(diaHorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, diaHorarioLayout.createSequentialGroup()
                        .addGroup(diaHorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(diaHorarioLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(0, 0, 0)
                                .addComponent(lblSetHora, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel8)
                                .addGap(0, 0, 0)
                                .addComponent(lblSetMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel18)
                                .addGap(0, 0, 0)
                                .addComponent(lblSetHora1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(jLabel19)
                                .addGap(0, 0, 0)
                                .addComponent(lblSetMinutos1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(jLabel20))
                            .addComponent(jLabel2)
                            .addComponent(btnHorarioActual, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, diaHorarioLayout.createSequentialGroup()
                        .addComponent(btnBuscarHorario)
                        .addContainerGap())))
        );
        diaHorarioLayout.setVerticalGroup(
            diaHorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(diaHorarioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(btnHorarioActual)
                .addGap(18, 18, 18)
                .addGroup(diaHorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(diaHorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblSetHora1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblSetMinutos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel19)
                        .addComponent(jLabel20))
                    .addGroup(diaHorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(lblSetHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblSetMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addComponent(jLabel9)
                        .addComponent(jLabel18)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscarHorario)
                .addGap(6, 6, 6))
        );

        jLabel3.setFont(new java.awt.Font("Ubuntu", 2, 16)); // NOI18N
        jLabel3.setText("Ingrese el nombre que desea buscar");

        btnBuscarNombre.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btnBuscarNombre.setText("Buscar");
        btnBuscarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarNombreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout diaNombreLayout = new javax.swing.GroupLayout(diaNombre.getContentPane());
        diaNombre.getContentPane().setLayout(diaNombreLayout);
        diaNombreLayout.setHorizontalGroup(
            diaNombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnBuscarNombre, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, diaNombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(diaNombreLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(diaNombreLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel3)))
        );
        diaNombreLayout.setVerticalGroup(
            diaNombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(diaNombreLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscarNombre)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Ubuntu", 2, 16)); // NOI18N
        jLabel4.setText("Seleccione el curso en el cual buscar");

        btnBuscarCurso.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btnBuscarCurso.setText("Buscar");
        btnBuscarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCursoActionPerformed(evt);
            }
        });

        cmbDiaCurso.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1° A", "1° B", "1° C", "2° A", "2° B", "2° C", "3° A", "3° B", "3° C", "4° A", "4° B", "4° C", "5° A", "5° B", "5° C", "6° A", "6° B", "6° C" }));

        javax.swing.GroupLayout diaCursoLayout = new javax.swing.GroupLayout(diaCurso.getContentPane());
        diaCurso.getContentPane().setLayout(diaCursoLayout);
        diaCursoLayout.setHorizontalGroup(
            diaCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(diaCursoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(diaCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, diaCursoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnBuscarCurso))
                    .addComponent(cmbDiaCurso, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(diaCursoLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        diaCursoLayout.setVerticalGroup(
            diaCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(diaCursoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cmbDiaCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscarCurso)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jLabel5.setText("Nombre del profesor:");

        jLabel6.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        jLabel6.setText("Ingresar horario, curso y lugar:");

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Add.png"))); // NOI18N
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jLabel10.setText("hs");

        lblSetMinutosNuevo.setText("00");
        lblSetMinutosNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSetMinutosNuevoMouseClicked(evt);
            }
        });
        lblSetMinutosNuevo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                lblSetMinutosNuevoFocusLost(evt);
            }
        });

        jLabel11.setText(":");

        lblSetHoraNuevo.setText("00");
        lblSetHoraNuevo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                lblSetHoraNuevoFocusLost(evt);
            }
        });
        lblSetHoraNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSetHoraNuevoMouseClicked(evt);
            }
        });

        jLabel12.setText("Desde");

        jLabel13.setText("A");

        jLabel14.setText(":");

        lblSetHoraFin.setText("00");
        lblSetHoraFin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSetHoraFinMouseClicked(evt);
            }
        });
        lblSetHoraFin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                lblSetHoraFinFocusLost(evt);
            }
        });

        lblSetMinutosFin.setText("00");
        lblSetMinutosFin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSetMinutosFinMouseClicked(evt);
            }
        });
        lblSetMinutosFin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                lblSetMinutosFinFocusLost(evt);
            }
        });

        jLabel15.setText("hs");

        jLabel16.setText("En:");

        cmbCurso.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1° A", "1° B", "1° C", "2° A", "2° B", "2° C", "3° A", "3° B", "3° C", "4° A", "4° B", "4° C", "5° A", "5° B", "5° C", "6° A", "6° B", "6° C" }));

        jLabel17.setText("Lugar:");

        cmbLugar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Programación", "Educación Física", "Aula", "Taller", "Laboratorio" }));

        javax.swing.GroupLayout diaAddLayout = new javax.swing.GroupLayout(diaAdd.getContentPane());
        diaAdd.getContentPane().setLayout(diaAddLayout);
        diaAddLayout.setHorizontalGroup(
            diaAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(diaAddLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(diaAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(diaAddLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreProfe, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
                    .addGroup(diaAddLayout.createSequentialGroup()
                        .addGroup(diaAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(diaAddLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(4, 4, 4)
                                .addComponent(lblSetHoraNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel11)
                                .addGap(0, 0, 0)
                                .addComponent(lblSetMinutosNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13)
                                .addGap(2, 2, 2)
                                .addComponent(lblSetHoraFin, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel14)
                                .addGap(0, 0, 0)
                                .addComponent(lblSetMinutosFin, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jLabel10))
                            .addGroup(diaAddLayout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(diaAddLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbLugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        diaAddLayout.setVerticalGroup(
            diaAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(diaAddLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(diaAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNombreProfe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(diaAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSetHoraNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSetMinutosNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12)
                    .addComponent(lblSetHoraFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSetMinutosFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13)
                    .addComponent(jLabel15))
                .addGap(12, 12, 12)
                .addGroup(diaAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(cmbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(diaAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(diaAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel17)
                        .addComponent(cmbLugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnAdd))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblProfesHorario.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        lblProfesHorario.setText("Mostrando los horarios del profesor:");

        txtHorasProfes.setColumns(20);
        txtHorasProfes.setRows(5);
        jScrollPane1.setViewportView(txtHorasProfes);

        lblNombreProfesHorario.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        lblNombreProfesHorario.setText("Profesor");

        javax.swing.GroupLayout diaVerHorariosLayout = new javax.swing.GroupLayout(diaVerHorarios.getContentPane());
        diaVerHorarios.getContentPane().setLayout(diaVerHorariosLayout);
        diaVerHorariosLayout.setHorizontalGroup(
            diaVerHorariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(diaVerHorariosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(diaVerHorariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblProfesHorario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(lblNombreProfesHorario, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE))
                .addContainerGap())
        );
        diaVerHorariosLayout.setVerticalGroup(
            diaVerHorariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(diaVerHorariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblProfesHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNombreProfesHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        cmbElige.setFont(new java.awt.Font("Cambria", 0, 16)); // NOI18N
        cmbElige.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Horario", "Nombre", "Curso" }));

        btnBuscar.setFont(new java.awt.Font("Stencil Std", 0, 14)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Lupa.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        lblHora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHora.setText("Hora");

        lblFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFecha.setText("Fecha");

        jLabel1.setText("Buscar profesor por:");

        lblDia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDia.setText("Dia");

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "", "", ""},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Curso", "Lugar", "Horario"
            }
        ));
        jScrollPane3.setViewportView(tabla);

        btnAgregar.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Margara.png"))); // NOI18N
        btnAgregar.setText("Agregar profesor");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Delete.png"))); // NOI18N
        btnDelete.setText("Eliminar");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Reset.png"))); // NOI18N
        btnReset.setText("Ver todo");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        lblResult.setText("Mostrando resultados de:");

        btnHorarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Reloj.png"))); // NOI18N
        btnHorarios.setText("Ver horarios");
        btnHorarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHorariosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbElige, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar)
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblHora, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDia, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblResult, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(btnHorarios)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnReset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDelete)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFecha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblHora))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cmbElige, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAgregar))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(btnReset)
                    .addComponent(lblResult)
                    .addComponent(btnHorarios))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    Calendar cal = new GregorianCalendar();
    int diaSemana = cal.get(Calendar.DAY_OF_WEEK);
    String[] dias = {"Domingo", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado"};

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // Depende que elige se abre cada dialogo de seleccion
        int metodo = cmbElige.getSelectedIndex();
        switch (metodo) {

            case 0:
                //Si no se ve completo poner: diaHorario.setSize(361, 160);
                diaHorario.setSize(311, 184);
                diaHorario.setVisible(true);
                diaHorario.setLocationRelativeTo(null); //centrar
                diaHorario.setResizable(false); //NO redimensionar
                diaHorario.setTitle("Seleccion de horario");
                break;
            case 1:
                //Si no se ve completo poner: diaNombre.setSize(361, 120);
                diaNombre.setSize(270, 133);
                diaNombre.setVisible(true);
                diaNombre.setLocationRelativeTo(null); //centrar
                diaNombre.setResizable(false); //NO redimensionar
                diaNombre.setTitle("Ingrese nombre");
                break;
            case 2:
                //Si no se ve completo poner: diaCurso.setSize(361, 114);
                diaCurso.setSize(277, 135);
                diaCurso.setVisible(true);
                diaCurso.setLocationRelativeTo(null); //centrar
                diaCurso.setResizable(false); //NO redimensionar
                diaCurso.setTitle("Seleccion de curso");
                break;
        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        //Si no se ve completo poner: diaAdd.setSize(361, 180);
        diaAdd.setSize(350, 201);
        diaAdd.setVisible(true);
        diaAdd.setLocationRelativeTo(null); //centrar
        diaAdd.setResizable(false); //NO redimensionar
        diaAdd.setTitle("Agregar un profesor");
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void lblSetHoraNuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSetHoraNuevoMouseClicked
        lblSetHoraNuevo.setSelectionStart(0);
        lblSetHoraNuevo.setSelectionEnd(lblSetHoraNuevo.getText().length());
    }//GEN-LAST:event_lblSetHoraNuevoMouseClicked

    private void lblSetMinutosNuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSetMinutosNuevoMouseClicked
        lblSetMinutosNuevo.setSelectionStart(0);
        lblSetMinutosNuevo.setSelectionEnd(lblSetMinutosNuevo.getText().length());
    }//GEN-LAST:event_lblSetMinutosNuevoMouseClicked

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        try {
            Profesor prof = new Profesor(txtNombreProfe.getText());
            String hi = lblSetHoraNuevo.getText() + ":" + lblSetMinutosNuevo.getText();
            String hf = lblSetHoraFin.getText() + ":" + lblSetMinutosFin.getText();
            String lugar = (String) cmbLugar.getSelectedItem();
            
            if ("".equals(prof.getNombre())) {
                JOptionPane.showMessageDialog(this, "Ingrese nombre", "Error!", JOptionPane.WARNING_MESSAGE);
            } else {
                Lugar nuevoLugar = new Lugar(lugar, prof, (String) cmbCurso.getSelectedItem()
                        , hi, hf);
                try {

                    if (ListaLugares.addLugar(nuevoLugar)) {
                        Refresh.refreshTable();
                        ListaLugares.saveLista();
                    } else {
                        JOptionPane.showMessageDialog(this, "Ha ocurrido un error, al parecer no hay mas lugar", "Error!", JOptionPane.ERROR_MESSAGE);
                    }

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Error: " + ex, "Error!", JOptionPane.ERROR_MESSAGE);
                }
            }

            //Recargamos la ventana
            Refresh.refreshTable();

            //Clean
            diaAdd.setVisible(false);
            txtNombreProfe.setText(null);
            lblSetHoraNuevo.setText("00");
            lblSetMinutosNuevo.setText("00");
            lblSetHoraFin.setText("00");
            lblSetMinutosFin.setText("00");
            cmbCurso.setSelectedIndex(0);
            cmbLugar.setSelectedIndex(0);
            lblResult.setText("");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Faltan datos", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void lblSetHoraFinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSetHoraFinMouseClicked
        lblSetHoraFin.setSelectionStart(0);
        lblSetHoraFin.setSelectionEnd(lblSetHoraFin.getText().length());
    }//GEN-LAST:event_lblSetHoraFinMouseClicked

    private void lblSetMinutosFinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSetMinutosFinMouseClicked
        lblSetMinutosFin.setSelectionStart(0);
        lblSetMinutosFin.setSelectionEnd(lblSetMinutosFin.getText().length());
    }//GEN-LAST:event_lblSetMinutosFinMouseClicked

    private void btnBuscarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarNombreActionPerformed
        Refresh.refreshTableNombre(txtNombre.getText());
        lblResult.setText("Mostrando profesores por nombre: "+txtNombre.getText());
        diaNombre.setVisible(false);
        txtNombre.setText(null);
    }//GEN-LAST:event_btnBuscarNombreActionPerformed

    private void lblSetHoraNuevoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblSetHoraNuevoFocusLost
        int lblSetHoraNuevoAux = Integer.parseInt(lblSetHoraNuevo.getText());
        String lblSetHoraNuevoAuxS = (lblSetHoraNuevoAux > 9) ? "" + lblSetHoraNuevoAux : "0" + lblSetHoraNuevoAux;
        lblSetHoraNuevo.setText(lblSetHoraNuevoAuxS);
    }//GEN-LAST:event_lblSetHoraNuevoFocusLost

    private void lblSetMinutosNuevoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblSetMinutosNuevoFocusLost
        int lblSetMinutosNuevoAux = Integer.parseInt(lblSetMinutosNuevo.getText());
        String lblSetMinutosNuevoAuxS = (lblSetMinutosNuevoAux > 9) ? "" + lblSetMinutosNuevoAux : "0" + lblSetMinutosNuevoAux;
        lblSetMinutosNuevo.setText(lblSetMinutosNuevoAuxS);
    }//GEN-LAST:event_lblSetMinutosNuevoFocusLost

    private void lblSetHoraFinFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblSetHoraFinFocusLost
        int lblSetHoraFinAux = Integer.parseInt(lblSetHoraFin.getText());
        String lblSetHoraFinAuxS = (lblSetHoraFinAux > 9) ? "" + lblSetHoraFinAux : "0" + lblSetHoraFinAux;
        lblSetHoraFin.setText(lblSetHoraFinAuxS);
    }//GEN-LAST:event_lblSetHoraFinFocusLost

    private void lblSetMinutosFinFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblSetMinutosFinFocusLost
        int lblSetMinutosFinAux = Integer.parseInt(lblSetMinutosFin.getText());
        String lblSetMinutosFinAuxS = (lblSetMinutosFinAux > 9) ? "" + lblSetMinutosFinAux : "0" + lblSetMinutosFinAux;
        lblSetMinutosFin.setText(lblSetMinutosFinAuxS);
    }//GEN-LAST:event_lblSetMinutosFinFocusLost

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            Lugar[] listaAux = new Lugar[ListaLugares.getLista().length - 1];
            int row = tabla.getSelectedRow();

            if (ListaLugares.getLista()[row] != null) {
                ListaLugares.getLista()[row] = null;
            }
            //Ademas de eliminar la fila hay que eliminar la posicion del array y reiniciar.
            for (int i = 0; i < ListaLugares.getLista().length; i++) {
                if (ListaLugares.getLista()[i] != null) {
                    for (int j = 0; j < listaAux.length; j++) {
                        if (listaAux[j] == null) {
                            listaAux[j] = ListaLugares.getLista()[i];
                            break;
                        }
                    }
                }
            }
            ListaLugares.setLista(listaAux);

            Refresh.refreshTable();
            
            lblResult.setText("Mostrando todos los profesores");

            ListaLugares.saveLista();
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Seleccione casilla a eliminar", "Error al borrar", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        ListaLugares.saveLista();
    }//GEN-LAST:event_formWindowClosing

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        Refresh.refreshTable();
        lblResult.setText("Mostrando todos los profesores");
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnHorariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHorariosActionPerformed
        diaVerHorarios.setSize(370, 223);
        diaVerHorarios.setLocationRelativeTo(null); //centrar
        diaVerHorarios.setResizable(false); //NO redimensionar
        diaVerHorarios.setTitle("Horarios del actual profesor");
        txtHorasProfes.setEditable(false);
        try {
        lblNombreProfesHorario.setText("\t"
                +ListaLugares.getLista()[tabla.getSelectedRow()].getProfe().getNombre());
        txtHorasProfes.setText(ListaLugares.getHoraProfe(tabla.getSelectedRow()));
        JOptionPane.showMessageDialog(this, "Este metodo puede funcionar mal si es ejecutado\nluego de una busqueda."
                , "Atencion"
                , JOptionPane.INFORMATION_MESSAGE);
        diaVerHorarios.setVisible(true);
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, "Seleccione la casilla del profesor", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnHorariosActionPerformed

    private void lblSetMinutos1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblSetMinutos1FocusLost
        int lblSetMinutos1Aux = Integer.parseInt(lblSetMinutos1.getText());
        String lblSetMinutos1AuxS = (lblSetMinutos1Aux > 9) ? "" + lblSetMinutos1Aux : "0" + lblSetMinutos1Aux;
        lblSetMinutos1.setText(lblSetMinutos1AuxS);
    }//GEN-LAST:event_lblSetMinutos1FocusLost

    private void lblSetMinutos1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSetMinutos1MouseClicked
        lblSetMinutos1.setSelectionStart(0);
        lblSetMinutos1.setSelectionEnd(lblSetMinutos1.getText().length());
    }//GEN-LAST:event_lblSetMinutos1MouseClicked

    private void lblSetHora1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblSetHora1FocusLost
        int lblSetHora1Aux = Integer.parseInt(lblSetHora1.getText());
        String lblSetHora1AuxS = (lblSetHora1Aux > 9) ? "" + lblSetHora1Aux : "0" + lblSetHora1Aux;
        lblSetHora1.setText(lblSetHora1AuxS);
    }//GEN-LAST:event_lblSetHora1FocusLost

    private void lblSetHora1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSetHora1MouseClicked
        lblSetHora1.setSelectionStart(0);
        lblSetHora1.setSelectionEnd(lblSetHora1.getText().length());
    }//GEN-LAST:event_lblSetHora1MouseClicked

    private void lblSetMinutosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblSetMinutosFocusLost
        int lblSetMinutosAux = Integer.parseInt(lblSetMinutos.getText());
        String lblSetMinutosAuxS = (lblSetMinutosAux > 9) ? "" + lblSetMinutosAux : "0" + lblSetMinutosAux;
        lblSetMinutos.setText(lblSetMinutosAuxS);
    }//GEN-LAST:event_lblSetMinutosFocusLost

    private void lblSetMinutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSetMinutosMouseClicked
        lblSetMinutos.setSelectionStart(0);
        lblSetMinutos.setSelectionEnd(lblSetMinutos.getText().length());
    }//GEN-LAST:event_lblSetMinutosMouseClicked

    private void lblSetHoraFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblSetHoraFocusLost
        int lblSetHoraAux = Integer.parseInt(lblSetHora.getText());
        String lblSetHoraAuxS = (lblSetHoraAux > 9) ? "" + lblSetHoraAux : "0" + lblSetHoraAux;
        lblSetHora.setText(lblSetHoraAuxS);
    }//GEN-LAST:event_lblSetHoraFocusLost

    private void lblSetHoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSetHoraMouseClicked
        lblSetHora.setSelectionStart(0);
        lblSetHora.setSelectionEnd(lblSetHora.getText().length());
    }//GEN-LAST:event_lblSetHoraMouseClicked

    private void btnHorarioActualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHorarioActualActionPerformed
        // Calendar getInstance te da la fecha y horario actual.
        Refresh.refreshTableHoraActual(Calendar.getInstance());
        diaHorario.setVisible(false);
        lblResult.setText("Mostrando profesores en "+"Horario Actual");
    }//GEN-LAST:event_btnHorarioActualActionPerformed

    private void btnBuscarHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarHorarioActionPerformed

        Lugar[] listado = ListaLugares.getLista();

        java.sql.Time hora = new java.sql.Time(Integer.parseInt(lblSetHora.getText())
            ,Integer.parseInt(lblSetMinutos.getText())
            , -1);
        // Los segundos en -1 para que muestre hasta el valor de inicio incluido.
        java.sql.Time horaFin = new java.sql.Time(Integer.parseInt(lblSetHora1.getText())
            , Integer.parseInt(lblSetMinutos1.getText())
            , 1);
        // 1 para que muestre hasta el valor de fin incluido.

        Profesor[] profesPresentes = new Profesor[50];

        for (int i = 0; i < listado.length; i++) {
            if (listado[i]!=null){
                if (listado[i].getHoraInicio().after(hora) && listado[i].getHoraFin().before(horaFin)) {
                    for (int j=0; j<profesPresentes.length; j++){
                        if (profesPresentes[j]==null){
                            profesPresentes[j]=listado[i].getProfe();
                            break;
                        }

                    }
                }
            }
        }

        Refresh.refreshTableHora(profesPresentes);

        //Clear
        lblResult.setText("Mostrando profesores desde "+lblSetHora.getText()
            +":"+lblSetMinutos.getText()
            +" A "+lblSetHora1.getText()
            +":"+lblSetMinutos1.getText());
        diaHorario.setVisible(false);
        lblSetHora.setText("00");
        lblSetHora1.setText("00");
        lblSetMinutos.setText("00");
        lblSetMinutos1.setText("00");
    }//GEN-LAST:event_btnBuscarHorarioActionPerformed

    private void btnBuscarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCursoActionPerformed
        Refresh.refreshTableCurso((String) cmbDiaCurso.getSelectedItem());
        diaCurso.setVisible(false);
        lblResult.setText("Mostrando profesores en "+(String) cmbDiaCurso.getSelectedItem());
        cmbDiaCurso.setSelectedIndex(0);
    }//GEN-LAST:event_btnBuscarCursoActionPerformed
    

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscarCurso;
    private javax.swing.JButton btnBuscarHorario;
    private javax.swing.JButton btnBuscarNombre;
    private javax.swing.JButton btnDelete;
    private javax.swing.JToggleButton btnHorarioActual;
    private javax.swing.JButton btnHorarios;
    private javax.swing.JButton btnReset;
    private javax.swing.JComboBox cmbCurso;
    private javax.swing.JComboBox cmbDiaCurso;
    private javax.swing.JComboBox cmbElige;
    private javax.swing.JComboBox cmbLugar;
    private javax.swing.JDialog diaAdd;
    private javax.swing.JDialog diaCurso;
    private javax.swing.JDialog diaHorario;
    private javax.swing.JDialog diaNombre;
    private javax.swing.JDialog diaVerHorarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    public static javax.swing.JLabel lblDia;
    public static javax.swing.JLabel lblFecha;
    public static javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblNombreProfesHorario;
    private javax.swing.JLabel lblProfesHorario;
    private javax.swing.JLabel lblResult;
    private javax.swing.JTextField lblSetHora;
    private javax.swing.JTextField lblSetHora1;
    private javax.swing.JTextField lblSetHoraFin;
    private javax.swing.JTextField lblSetHoraNuevo;
    private javax.swing.JTextField lblSetMinutos;
    private javax.swing.JTextField lblSetMinutos1;
    private javax.swing.JTextField lblSetMinutosFin;
    private javax.swing.JTextField lblSetMinutosNuevo;
    public static javax.swing.JTable tabla;
    private javax.swing.JTextArea txtHorasProfes;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreProfe;
    // End of variables declaration//GEN-END:variables
}
