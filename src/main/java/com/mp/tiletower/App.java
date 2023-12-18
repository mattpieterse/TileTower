
package com.mp.tiletower;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class App extends JFrame {
    
    final Color clrActive = new Color(204, 214, 220);
    final Color clrOff = new Color(79, 111, 133);
    
    Game game = new Game();
    
    // --

    public App() {
        initComponents();
        gameStart();
    }

    // <editor-fold defaultstate="collapsed" desc="IDE Code">   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panContainer = new javax.swing.JPanel();
        panGame = new javax.swing.JPanel();
        tileA1 = new javax.swing.JPanel();
        tileA2 = new javax.swing.JPanel();
        tileB1 = new javax.swing.JPanel();
        tileB2 = new javax.swing.JPanel();
        tileC1 = new javax.swing.JPanel();
        tileC2 = new javax.swing.JPanel();
        tileD1 = new javax.swing.JPanel();
        tileD2 = new javax.swing.JPanel();
        tileE1 = new javax.swing.JPanel();
        tileE2 = new javax.swing.JPanel();
        tileF1 = new javax.swing.JPanel();
        tileF2 = new javax.swing.JPanel();
        panElements = new javax.swing.JPanel();
        scoreText = new javax.swing.JLabel();
        topText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TileTower (0.1.0)");
        setAlwaysOnTop(true);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                keyClick(evt);
            }
        });

        panContainer.setBackground(new java.awt.Color(56, 92, 117));

        panGame.setOpaque(false);
        panGame.setLayout(new java.awt.GridLayout(6, 2, 6, 6));

        tileA1.setBackground(new java.awt.Color(79, 111, 133));
        tileA1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(131, 154, 169), 2, true));
        tileA1.setMinimumSize(new java.awt.Dimension(100, 60));
        tileA1.setPreferredSize(new java.awt.Dimension(340, 60));

        javax.swing.GroupLayout tileA1Layout = new javax.swing.GroupLayout(tileA1);
        tileA1.setLayout(tileA1Layout);
        tileA1Layout.setHorizontalGroup(
            tileA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 155, Short.MAX_VALUE)
        );
        tileA1Layout.setVerticalGroup(
            tileA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
        );

        panGame.add(tileA1);

        tileA2.setBackground(new java.awt.Color(79, 111, 133));
        tileA2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(131, 154, 169), 2, true));
        tileA2.setMinimumSize(new java.awt.Dimension(100, 60));
        tileA2.setPreferredSize(new java.awt.Dimension(340, 60));

        javax.swing.GroupLayout tileA2Layout = new javax.swing.GroupLayout(tileA2);
        tileA2.setLayout(tileA2Layout);
        tileA2Layout.setHorizontalGroup(
            tileA2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 155, Short.MAX_VALUE)
        );
        tileA2Layout.setVerticalGroup(
            tileA2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
        );

        panGame.add(tileA2);

        tileB1.setBackground(new java.awt.Color(79, 111, 133));
        tileB1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(131, 154, 169), 2, true));
        tileB1.setMinimumSize(new java.awt.Dimension(100, 60));
        tileB1.setPreferredSize(new java.awt.Dimension(340, 60));

        javax.swing.GroupLayout tileB1Layout = new javax.swing.GroupLayout(tileB1);
        tileB1.setLayout(tileB1Layout);
        tileB1Layout.setHorizontalGroup(
            tileB1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 155, Short.MAX_VALUE)
        );
        tileB1Layout.setVerticalGroup(
            tileB1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
        );

        panGame.add(tileB1);

        tileB2.setBackground(new java.awt.Color(79, 111, 133));
        tileB2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(131, 154, 169), 2, true));
        tileB2.setMinimumSize(new java.awt.Dimension(100, 60));
        tileB2.setPreferredSize(new java.awt.Dimension(340, 60));

        javax.swing.GroupLayout tileB2Layout = new javax.swing.GroupLayout(tileB2);
        tileB2.setLayout(tileB2Layout);
        tileB2Layout.setHorizontalGroup(
            tileB2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 155, Short.MAX_VALUE)
        );
        tileB2Layout.setVerticalGroup(
            tileB2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
        );

        panGame.add(tileB2);

        tileC1.setBackground(new java.awt.Color(79, 111, 133));
        tileC1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(131, 154, 169), 2, true));
        tileC1.setMinimumSize(new java.awt.Dimension(100, 60));
        tileC1.setPreferredSize(new java.awt.Dimension(340, 60));

        javax.swing.GroupLayout tileC1Layout = new javax.swing.GroupLayout(tileC1);
        tileC1.setLayout(tileC1Layout);
        tileC1Layout.setHorizontalGroup(
            tileC1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 155, Short.MAX_VALUE)
        );
        tileC1Layout.setVerticalGroup(
            tileC1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
        );

        panGame.add(tileC1);

        tileC2.setBackground(new java.awt.Color(79, 111, 133));
        tileC2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(131, 154, 169), 2, true));
        tileC2.setMinimumSize(new java.awt.Dimension(100, 60));
        tileC2.setPreferredSize(new java.awt.Dimension(340, 60));

        javax.swing.GroupLayout tileC2Layout = new javax.swing.GroupLayout(tileC2);
        tileC2.setLayout(tileC2Layout);
        tileC2Layout.setHorizontalGroup(
            tileC2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 155, Short.MAX_VALUE)
        );
        tileC2Layout.setVerticalGroup(
            tileC2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
        );

        panGame.add(tileC2);

        tileD1.setBackground(new java.awt.Color(79, 111, 133));
        tileD1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(131, 154, 169), 2, true));
        tileD1.setMinimumSize(new java.awt.Dimension(100, 60));
        tileD1.setPreferredSize(new java.awt.Dimension(340, 60));

        javax.swing.GroupLayout tileD1Layout = new javax.swing.GroupLayout(tileD1);
        tileD1.setLayout(tileD1Layout);
        tileD1Layout.setHorizontalGroup(
            tileD1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 155, Short.MAX_VALUE)
        );
        tileD1Layout.setVerticalGroup(
            tileD1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
        );

        panGame.add(tileD1);

        tileD2.setBackground(new java.awt.Color(79, 111, 133));
        tileD2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(131, 154, 169), 2, true));
        tileD2.setMinimumSize(new java.awt.Dimension(100, 60));
        tileD2.setPreferredSize(new java.awt.Dimension(340, 60));

        javax.swing.GroupLayout tileD2Layout = new javax.swing.GroupLayout(tileD2);
        tileD2.setLayout(tileD2Layout);
        tileD2Layout.setHorizontalGroup(
            tileD2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 155, Short.MAX_VALUE)
        );
        tileD2Layout.setVerticalGroup(
            tileD2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
        );

        panGame.add(tileD2);

        tileE1.setBackground(new java.awt.Color(79, 111, 133));
        tileE1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(131, 154, 169), 2, true));
        tileE1.setMinimumSize(new java.awt.Dimension(100, 60));
        tileE1.setPreferredSize(new java.awt.Dimension(340, 60));

        javax.swing.GroupLayout tileE1Layout = new javax.swing.GroupLayout(tileE1);
        tileE1.setLayout(tileE1Layout);
        tileE1Layout.setHorizontalGroup(
            tileE1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 155, Short.MAX_VALUE)
        );
        tileE1Layout.setVerticalGroup(
            tileE1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
        );

        panGame.add(tileE1);

        tileE2.setBackground(new java.awt.Color(79, 111, 133));
        tileE2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(131, 154, 169), 2, true));
        tileE2.setMinimumSize(new java.awt.Dimension(100, 60));
        tileE2.setPreferredSize(new java.awt.Dimension(340, 60));

        javax.swing.GroupLayout tileE2Layout = new javax.swing.GroupLayout(tileE2);
        tileE2.setLayout(tileE2Layout);
        tileE2Layout.setHorizontalGroup(
            tileE2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 155, Short.MAX_VALUE)
        );
        tileE2Layout.setVerticalGroup(
            tileE2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
        );

        panGame.add(tileE2);

        tileF1.setBackground(new java.awt.Color(79, 111, 133));
        tileF1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(131, 154, 169), 2, true));
        tileF1.setMinimumSize(new java.awt.Dimension(100, 60));
        tileF1.setPreferredSize(new java.awt.Dimension(340, 60));

        javax.swing.GroupLayout tileF1Layout = new javax.swing.GroupLayout(tileF1);
        tileF1.setLayout(tileF1Layout);
        tileF1Layout.setHorizontalGroup(
            tileF1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 155, Short.MAX_VALUE)
        );
        tileF1Layout.setVerticalGroup(
            tileF1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
        );

        panGame.add(tileF1);

        tileF2.setBackground(new java.awt.Color(79, 111, 133));
        tileF2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(131, 154, 169), 2, true));
        tileF2.setMinimumSize(new java.awt.Dimension(100, 60));
        tileF2.setPreferredSize(new java.awt.Dimension(340, 60));

        javax.swing.GroupLayout tileF2Layout = new javax.swing.GroupLayout(tileF2);
        tileF2.setLayout(tileF2Layout);
        tileF2Layout.setHorizontalGroup(
            tileF2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 155, Short.MAX_VALUE)
        );
        tileF2Layout.setVerticalGroup(
            tileF2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
        );

        panGame.add(tileF2);

        panElements.setOpaque(false);
        panElements.setLayout(new java.awt.GridLayout(2, 2));

        scoreText.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        scoreText.setForeground(new java.awt.Color(204, 214, 220));
        scoreText.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        scoreText.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mp/tiletower/assets/icons8-star-16.png"))); // NOI18N
        scoreText.setText("0000");
        scoreText.setToolTipText("");
        scoreText.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        panElements.add(scoreText);

        topText.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        topText.setForeground(new java.awt.Color(204, 214, 220));
        topText.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        topText.setText("Highest: 0");
        topText.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        panElements.add(topText);

        javax.swing.GroupLayout panContainerLayout = new javax.swing.GroupLayout(panContainer);
        panContainer.setLayout(panContainerLayout);
        panContainerLayout.setHorizontalGroup(
            panContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panGame, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panContainerLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(panElements, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panContainerLayout.setVerticalGroup(
            panContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panElements, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panGame, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // </editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="Event Listeners"> 
    private void keyClick(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_keyClick
        switch (evt.getKeyCode()) {
            case (KeyEvent.VK_RIGHT) -> {
                //
            }
            case (KeyEvent.VK_LEFT) -> {
                //
            } 
        }
    }//GEN-LAST:event_keyClick
    // </editor-fold> 
    
    public static void main(String args[]) {
        
        //<editor-fold defaultstate="collapsed" desc="UI Skin">
        /* Set the Nimbus look and feel */
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        EventQueue.invokeLater(() -> {
            new App().setVisible(true);
        });
    }
    
    // --
    
    void gameStart() {
        
    }
    
    void gameUpdate() {
        
        scoreText.setText(String.valueOf(game.getScore()));
    }
    
    void gameEnd() {
        
    }
    
    void generateTop() {
        
    }
    
    void incrementScore() {
        
    }

    // <editor-fold defaultstate="collapsed" desc="IDE Variables">   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panContainer;
    private javax.swing.JPanel panElements;
    private javax.swing.JPanel panGame;
    private javax.swing.JLabel scoreText;
    private javax.swing.JPanel tileA1;
    private javax.swing.JPanel tileA2;
    private javax.swing.JPanel tileB1;
    private javax.swing.JPanel tileB2;
    private javax.swing.JPanel tileC1;
    private javax.swing.JPanel tileC2;
    private javax.swing.JPanel tileD1;
    private javax.swing.JPanel tileD2;
    private javax.swing.JPanel tileE1;
    private javax.swing.JPanel tileE2;
    private javax.swing.JPanel tileF1;
    private javax.swing.JPanel tileF2;
    private javax.swing.JLabel topText;
    // End of variables declaration//GEN-END:variables
    // </editor-fold> 
}
