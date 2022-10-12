
package cds.dvds;

public class mainPage extends javax.swing.JFrame {
 
    private Database dataBase = new Database();
    private CadastroPageCD cadastroCds = new CadastroPageCD(new java.awt.Frame(), true, dataBase);
    private CadastroPageDVD cadastroDvds = new CadastroPageDVD(new java.awt.Frame(), true, dataBase);
    private RelatoriosPage relatoriosPageCd = new RelatoriosPage(new java.awt.Frame(), true, dataBase, 0);
    private RelatoriosPage relatoriosPageDvd = new RelatoriosPage(new java.awt.Frame(), true, dataBase, 1);
    private InformacoesPage infosPage = new InformacoesPage(this, true);

    public mainPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        cadastroCD = new javax.swing.JMenuItem();
        cadastroDVD = new javax.swing.JMenuItem();
        relatorios = new javax.swing.JMenu();
        relCD = new javax.swing.JMenuItem();
        relDVD = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenu();
        infos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 135)); // NOI18N
        jLabel1.setText("BEM VINDO");

        jMenu2.setText("Cadastro");

        cadastroCD.setText("CD");
        cadastroCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroCDActionPerformed(evt);
            }
        });
        jMenu2.add(cadastroCD);

        cadastroDVD.setText("DVD");
        cadastroDVD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroDVDActionPerformed(evt);
            }
        });
        jMenu2.add(cadastroDVD);

        jMenuBar1.add(jMenu2);

        relatorios.setText("Relatório");

        relCD.setText("CDs");
        relCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relCDActionPerformed(evt);
            }
        });
        relatorios.add(relCD);

        relDVD.setText("DVDs");
        relDVD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relDVDActionPerformed(evt);
            }
        });
        relatorios.add(relDVD);

        jMenuBar1.add(relatorios);

        jMenuItem20.setText("Sobre");
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });

        infos.setText("Informações Adicionais");
        infos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infosActionPerformed(evt);
            }
        });
        jMenuItem20.add(infos);

        jMenuBar1.add(jMenuItem20);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 737, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(251, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastroCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroCDActionPerformed
        cadastroCds.setVisible(true);
    }//GEN-LAST:event_cadastroCDActionPerformed

    private void cadastroDVDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroDVDActionPerformed
        cadastroDvds.setVisible(true);
    }//GEN-LAST:event_cadastroDVDActionPerformed

    private void relCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relCDActionPerformed
        relatoriosPageCd.setVisible(true);
    }//GEN-LAST:event_relCDActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed

    }//GEN-LAST:event_jMenuItem20ActionPerformed

    private void infosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infosActionPerformed
        infosPage.setVisible(true);
    }//GEN-LAST:event_infosActionPerformed

    private void relDVDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relDVDActionPerformed
        relatoriosPageDvd.setVisible(true);
    }//GEN-LAST:event_relDVDActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem cadastroCD;
    private javax.swing.JMenuItem cadastroDVD;
    private javax.swing.JMenuItem infos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuItem20;
    private javax.swing.JMenuItem relCD;
    private javax.swing.JMenuItem relDVD;
    private javax.swing.JMenu relatorios;
    // End of variables declaration//GEN-END:variables
}
