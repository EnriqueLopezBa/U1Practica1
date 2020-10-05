
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


public class NewDialog extends java.awt.Dialog {


    DefaultTableModel m;
    
      public class jpColor extends javax.swing.JPanel{
    private Color color1 = new Color(0,0,0);
    private Color color2 = new Color(0,0,0);
    
    
    public jpColor(Color c1, Color c2){
        color1 = c1;
        color2 = c2;        
    }
    
    @Override
    public void paint(Graphics g) {    
        Graphics2D g2 = (Graphics2D) g.create();
        Rectangle clip = g2.getClipBounds();                        
        g2.setPaint(new GradientPaint(0.0f, 0.0f, color1.darker(),0.0f ,getHeight(), color2.darker()));        
        g2.fillRect(clip.x, clip.y, clip.width, clip.height);        
    }

    
}
    Color c1 = new Color(66,111,166);
        Color c2 = new Color(103,174,118);
        jpColor jpmicolor = new jpColor(c1,c2);
        
    public NewDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        tblAgenda.setOpaque(false);
    ((DefaultTableCellRenderer)tblAgenda.getDefaultRenderer(Object.class)).setOpaque(false);
        jScrollPane1.setOpaque(false);
    jScrollPane1.getViewport().setOpaque(false);
    tblAgenda.setShowGrid(false);
    this.setLocationRelativeTo(null);
        m = (DefaultTableModel) tblAgenda.getModel();
        jpmicolor.setSize(this.getSize());   
        jPanel1.add(jpmicolor);
        this.setTitle("jDialog");
        
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        mEliminar = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        btnRefresh = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAgenda = new javax.swing.JTable();

        mEliminar.setText("Eliminar");
        mEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mEliminarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(mEliminar);

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
            public void windowIconified(java.awt.event.WindowEvent evt) {
                formWindowIconified(evt);
            }
        });

        btnRefresh.setText("Actualizar");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LISTA");

        tblAgenda.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tblAgenda.setForeground(new java.awt.Color(255, 255, 255));
        tblAgenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellidos", "Telefono", "Direccion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAgenda.setComponentPopupMenu(jPopupMenu1);
        tblAgenda.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tblAgenda.setRowHeight(20);
        tblAgenda.setShowVerticalLines(false);
        jScrollPane1.setViewportView(tblAgenda);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRefresh)
                .addGap(36, 36, 36))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRefresh)
                    .addComponent(jLabel1))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog

    private void mEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mEliminarActionPerformed
        if(tblAgenda.getSelectedRow() !=-1){
            m.removeRow(tblAgenda.getSelectedRow());
        }else
        showMessageDialog(null,"Primero seleccione a la persona");
    }//GEN-LAST:event_mEliminarActionPerformed

    private void formWindowIconified(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowIconified
        
    }//GEN-LAST:event_formWindowIconified
       
   

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        m.setRowCount(0);

        for (int i = 0; i < NewJFrame.persona.co; i++) {
            m.addRow(new Object[]{NewJFrame.persona.pe[i].getNombre(),NewJFrame.persona.pe[i].getApellidos(),NewJFrame.persona.pe[i].getTelefono(),NewJFrame.persona.pe[i].getDireccion()});
        }
    }//GEN-LAST:event_btnRefreshActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NewDialog dialog = new NewDialog(new java.awt.Frame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRefresh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem mEliminar;
    private javax.swing.JTable tblAgenda;
    // End of variables declaration//GEN-END:variables
}
