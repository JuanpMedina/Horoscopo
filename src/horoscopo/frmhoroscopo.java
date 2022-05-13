/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package horoscopo;

import javax.swing.ImageIcon;

/**
 *
 * @author jpmd2
 */
public class frmhoroscopo extends javax.swing.JFrame {

        ImageIcon Signo = new ImageIcon();
    /**
     * Creates new form frmhoroscopo
     */
    public frmhoroscopo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnnuevo1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtdia = new javax.swing.JTextField();
        txtIdentificacion = new javax.swing.JTextField();
        combomes = new javax.swing.JComboBox<>();
        btncalcular = new javax.swing.JButton();
        btnnuevo = new javax.swing.JButton();
        resultado = new javax.swing.JLabel();
        mensaje = new javax.swing.JLabel();
        btnsalir = new javax.swing.JButton();
        regalo = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        categoria = new javax.swing.JLabel();
        lblIdentificacion = new javax.swing.JLabel();
        txtnombre1 = new javax.swing.JTextField();
        lblDulceFavorito = new javax.swing.JLabel();
        txtDulceFavorito = new javax.swing.JTextField();
        lblAñoNacimiento = new javax.swing.JLabel();
        txtAñoNacimiento = new javax.swing.JTextField();

        btnnuevo1.setText("Nuevo");
        btnnuevo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevo1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre:");

        jLabel2.setText("Ingresar Dia:");

        jLabel3.setText("Ingresar Mes:");

        txtdia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdiaActionPerformed(evt);
            }
        });

        txtIdentificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdentificacionActionPerformed(evt);
            }
        });

        combomes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccionar-", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        combomes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combomesActionPerformed(evt);
            }
        });

        btncalcular.setText("Calcular Signo");
        btncalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncalcularActionPerformed(evt);
            }
        });

        btnnuevo.setText("Nuevo");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });

        resultado.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultado Horoscopo", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        mensaje.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mensaje", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        btnsalir.setText("Salir");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        regalo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Regalo", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        categoria.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Niño/Adulto", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        lblIdentificacion.setText("Identificación:");

        txtnombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombre1ActionPerformed(evt);
            }
        });

        lblDulceFavorito.setText("Dulce Favorito:");

        txtDulceFavorito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDulceFavoritoActionPerformed(evt);
            }
        });

        lblAñoNacimiento.setText("Año nacimiento:");

        txtAñoNacimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAñoNacimientoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btncalcular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnnuevo)
                        .addGap(18, 18, 18)
                        .addComponent(btnsalir)
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(regalo, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel1)
                                                    .addComponent(lblIdentificacion))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtnombre1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtIdentificacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblDulceFavorito)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtDulceFavorito, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(5, 5, 5)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addComponent(lblAñoNacimiento)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(txtAñoNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addComponent(jLabel2)
                                                            .addGap(28, 28, 28)
                                                            .addComponent(txtdia, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel3)
                                                        .addGap(23, 23, 23)
                                                        .addComponent(combomes, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(27, 27, 27)
                                .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(24, 24, 24))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblIdentificacion))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txtnombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDulceFavorito)
                            .addComponent(txtDulceFavorito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAñoNacimiento)
                            .addComponent(txtAñoNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtdia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(combomes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(regalo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnnuevo)
                        .addComponent(btnsalir))
                    .addComponent(btncalcular, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtdiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiaActionPerformed

    private void txtIdentificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdentificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdentificacionActionPerformed

    private void btncalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncalcularActionPerformed
        // TODO add your handling code here:
        int  año = Integer.parseInt(txtAñoNacimiento.getText());
        int  dia = Integer.parseInt(txtdia.getText());
        String mes = (String)combomes.getSelectedItem();
        
        Usuario usuario = new Usuario(
                txtIdentificacion.getText(),
                txtnombre1.getText(),
                mes.toLowerCase(),
                txtDulceFavorito.getText(),
                dia,
                año
        );
        
        //calcular edad entre niño y adulto Esto se va para clase horoscopo
        if (usuario.esMayor()) {
            categoria.setText("Adulto");
            regalo.setText("<html>Libro: <p> El codigo de Davinci <p><html>");
        } else {
            categoria.setText("Niño");
            regalo.setText("<html>Dulce: <p> Chocolate <p><html>");
        }
        
        //calcular signo zodiacal Zodiaco
        if (dia>=21 && mes.equals("Marzo")||dia<=2 && mes.equals("Abril")) {
            resultado.setText("Aries");
            mensaje.setText("Quien no arriesga, ¡no gana!");
        }else if(dia>=21 && mes.equals("Abril")||dia<=20 && mes.equals("Mayo")){
            resultado.setText("Tauro");
            mensaje.setText("Piensa antes de actuar.");
        }else if(dia>=21 && mes.equals("Mayo")||dia<=21 && mes.equals("Junio")){
            resultado.setText("Geminis");
            mensaje.setText("Confía, está bien.");
        }else if(dia>=22 && mes.equals("Junio")||dia<=22 && mes.equals("Julio")){
            resultado.setText("Cancer");
            mensaje.setText("No hagas lo que no quieres que te hagan.");
        }else if(dia>=23 && mes.equals("Julio")||dia<=22 && mes.equals("Agosto")){
            resultado.setText("Leo");
            mensaje.setText("Si te caes, ¡levántate!");
        }else if(dia>=23 && mes.equals("Agosoto")||dia<=22 && mes.equals("Septiembre")){
            resultado.setText("Virgo");
            mensaje.setText("El amor es la fuerza más poderosa del mundo.");
        }else if(dia>=23 && mes.equals("Septiembre")||dia<=22 && mes.equals("Octubre")){
            resultado.setText("Libra");
            mensaje.setText("Lucha por lo que quieres.");
        }else if(dia>=23 && mes.equals("Octubre")||dia<=21 && mes.equals("Noviembre")){
            resultado.setText("Escorpio");
            mensaje.setText("Sé fuerte, noble e humilde.");
        }else if(dia>=22 && mes.equals("Noviembre")||dia<=21 && mes.equals("Diciembre")){
            resultado.setText("Sagitario");
            mensaje.setText("A veces las cosas no son como quisiéramos, pero siempre son como deben ser.");
        }else if(dia>=22 && mes.equals("Diciembre")||dia<=20 && mes.equals("Enero")){
            resultado.setText("Capricornio");
            mensaje.setText("A veces no hay próxima vez, a veces es ahora o nunca.");
        }else if(dia>=21 && mes.equals("Enero")||dia<=19 && mes.equals("Febrero")){
            resultado.setText("Acuario");
            mensaje.setText("No me estresaré por cosas que no puedo controlar.");
        }else if(dia>=20 && mes.equals("Febrero")||dia<=20 && mes.equals("Marzo")){
            resultado.setText("Piscis");
            mensaje.setText("Olvídate del qué dirán y ve en busca de tu felicidad.");
        }
        
        String text = "<html>ID: " + usuario.getIdentificacion() + "<p>" +
            "<html>Nombre: " + usuario.getNombre() + "<p>\n" +
            "<html>Fecha nacimiento: " + usuario.getDiaNacimiento() + "/" + usuario.mesAMesNumero() + "/" + usuario.getAñoNacimiento() + "<p>\n" +
            "<html>Edad: " + usuario.calcularEdad() + " años <p>\n" +
            "<html>Dulce favorito: " + usuario.getDulceFavorito() + "<p>\n" + 
            "<html>Signo zodiacal: <p>";
        
        resultado.setText(text);        
    }//GEN-LAST:event_btncalcularActionPerformed

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        // TODO add your handling code here:
        txtIdentificacion.setText("");
        txtDulceFavorito.setText("");
        txtAñoNacimiento.setText("");
        txtnombre1.setText("");
        txtdia.setText("");
        categoria.setText("");
        combomes.setSelectedIndex(0);
        resultado.setText("");
        regalo.setText("");
        mensaje.setText("");
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void btnnuevo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnnuevo1ActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnsalirActionPerformed

    private void combomesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combomesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combomesActionPerformed

    private void txtnombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombre1ActionPerformed

    private void txtDulceFavoritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDulceFavoritoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDulceFavoritoActionPerformed

    private void txtAñoNacimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAñoNacimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAñoNacimientoActionPerformed

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
            java.util.logging.Logger.getLogger(frmhoroscopo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmhoroscopo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmhoroscopo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmhoroscopo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmhoroscopo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncalcular;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JButton btnnuevo1;
    private javax.swing.JButton btnsalir;
    private javax.swing.JLabel categoria;
    private javax.swing.JComboBox<String> combomes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblAñoNacimiento;
    private javax.swing.JLabel lblDulceFavorito;
    private javax.swing.JLabel lblIdentificacion;
    private javax.swing.JLabel mensaje;
    private javax.swing.JLabel regalo;
    private javax.swing.JLabel resultado;
    private javax.swing.JTextField txtAñoNacimiento;
    private javax.swing.JTextField txtDulceFavorito;
    private javax.swing.JTextField txtIdentificacion;
    private javax.swing.JTextField txtdia;
    private javax.swing.JTextField txtnombre1;
    // End of variables declaration//GEN-END:variables

}
