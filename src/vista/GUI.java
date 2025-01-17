package vista;

import modelo.*;

public class GUI extends javax.swing.JFrame {

    public GUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barraMenu = new javax.swing.JMenuBar();
        menuCombate = new javax.swing.JMenu();
        menuCombate_pikachu = new javax.swing.JMenuItem();
        menuCombate_electrode = new javax.swing.JMenuItem();
        menuCombate_hitMonLee = new javax.swing.JMenuItem();
        menuCombate_gyarados = new javax.swing.JMenuItem();
        menuGestion = new javax.swing.JMenu();
        menuTienda_Tienda = new javax.swing.JMenuItem();
        menuTienda_Informacion = new javax.swing.JMenuItem();
        menuTienda_Cambiar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        barraMenu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        menuCombate.setText("Combate");
        menuCombate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        menuCombate_pikachu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        menuCombate_pikachu.setText("Pikachu");
        menuCombate_pikachu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCombate_ActionPerformed(evt);
            }
        });
        menuCombate.add(menuCombate_pikachu);

        menuCombate_electrode.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        menuCombate_electrode.setText("Electrode");
        menuCombate_electrode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCombate_ActionPerformed(evt);
            }
        });
        menuCombate.add(menuCombate_electrode);

        menuCombate_hitMonLee.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        menuCombate_hitMonLee.setText("HitMonLee");
        menuCombate_hitMonLee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCombate_ActionPerformed(evt);
            }
        });
        menuCombate.add(menuCombate_hitMonLee);

        menuCombate_gyarados.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        menuCombate_gyarados.setText("Gyarados");
        menuCombate_gyarados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCombate_ActionPerformed(evt);
            }
        });
        menuCombate.add(menuCombate_gyarados);

        barraMenu.add(menuCombate);

        menuGestion.setText("Gestión");
        menuGestion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        menuTienda_Tienda.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        menuTienda_Tienda.setText("Tienda");
        menuTienda_Tienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTienda_ActionPerformed(evt);
            }
        });
        menuGestion.add(menuTienda_Tienda);

        menuTienda_Informacion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        menuTienda_Informacion.setText("Información");
        menuTienda_Informacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTienda_ActionPerformed(evt);
            }
        });
        menuGestion.add(menuTienda_Informacion);

        menuTienda_Cambiar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        menuTienda_Cambiar.setText("Cambiar");
        menuTienda_Cambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTienda_ActionPerformed(evt);
            }
        });
        menuGestion.add(menuTienda_Cambiar);

        barraMenu.add(menuGestion);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 564, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuCombate_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCombate_ActionPerformed
        this.getContentPane().removeAll();

        if (evt.getSource() == menuCombate_pikachu) {
            Pikachu.definirPikachuEnemigo();
        } else if (evt.getSource() == menuCombate_electrode) {
            Electrode.definirElectrodeEnemigo();
        } else if (evt.getSource() == menuCombate_hitMonLee) {
            HitMonLee.definirHitMonLeeEnemigo();
        } else if (evt.getSource() == menuCombate_gyarados) {
            Gyarados.definirGyaradosEnemigo();
        }

        PanelCombateEnemigo panelCE = new PanelCombateEnemigo();
        panelCE.setSize(800, 560);
        panelCE.setVisible(false);
        this.add(panelCE);
        panelCE.mostrar();
    }//GEN-LAST:event_menuCombate_ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        inicializarStarters();
        PanelSeleccionStarter panelSP = new PanelSeleccionStarter();
        panelSP.setSize(800, 560);
        panelSP.setVisible(false);
        this.add(panelSP);
        panelSP.mostrar();
        System.out.println("Se acaba de abrir la ventana");
    }//GEN-LAST:event_formWindowOpened

    private void inicializarStarters() {
        Personajes.teemo = new Teemo();
        Personajes.gnar = new Gnar();
        Personajes.poppy = new Poppy();

        Personajes.starter = Personajes.teemo; //Por defecto
    }

    private void menuTienda_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTienda_ActionPerformed
        this.getContentPane().removeAll();

        if (evt.getSource() == menuTienda_Tienda) {
            PanelTienda panelT = new PanelTienda();
            panelT.setSize(800, 560);
            panelT.setVisible(false);
            this.add(panelT);
            panelT.mostrar();
        } else if (evt.getSource() == menuTienda_Informacion) {
            PanelInformacion panelI = new PanelInformacion();
            panelI.setSize(800, 560);
            panelI.setVisible(false);
            this.add(panelI);
            panelI.mostrar();
        } else if (evt.getSource() == menuTienda_Cambiar) {
            PanelSeleccionStarter panelSS = new PanelSeleccionStarter();
            panelSS.setSize(800, 560);
            panelSS.setVisible(false);
            this.add(panelSS);
            panelSS.mostrar();
        }
    }//GEN-LAST:event_menuTienda_ActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JMenu menuCombate;
    private javax.swing.JMenuItem menuCombate_electrode;
    private javax.swing.JMenuItem menuCombate_gyarados;
    private javax.swing.JMenuItem menuCombate_hitMonLee;
    private javax.swing.JMenuItem menuCombate_pikachu;
    private javax.swing.JMenu menuGestion;
    private javax.swing.JMenuItem menuTienda_Cambiar;
    private javax.swing.JMenuItem menuTienda_Informacion;
    private javax.swing.JMenuItem menuTienda_Tienda;
    // End of variables declaration//GEN-END:variables
}
