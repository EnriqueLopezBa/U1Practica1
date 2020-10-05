
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


public class NewJFrame extends javax.swing.JFrame {

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


    public NewJFrame() {
        initComponents();
   
        jpmicolor.setSize(this.getSize());   
        pnl.add(jpmicolor);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        mEliminar = new javax.swing.JMenuItem();
        pnl = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        mEliminar.setText("Eliminar");
        mEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mEliminarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(mEliminar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnl.setBackground(new java.awt.Color(204, 0, 153));

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("AGENDA");

        txtNombre.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtNombre.setNextFocusableComponent(txtApellidos);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre:");

        txtApellidos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtApellidos.setNextFocusableComponent(txtTelefono);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Apellidos:");

        txtTelefono.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtTelefono.setNextFocusableComponent(txtDireccion);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Telefono:");

        txtDireccion.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtDireccion.setNextFocusableComponent(btnAceptar);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Dirección");

        btnAceptar.setText("Agregar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        jButton1.setText("2da Ventana");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 51));
        jLabel6.setText("<html>CREA UNA LISTA DE AGENTA, INGRESAR LOS DATOS, REGISTRAR. LA SEGUNDA VENTANA (JDIALOG) SE PUEDEN VISUALIZAR LOS REGISTROS</html>");

        javax.swing.GroupLayout pnlLayout = new javax.swing.GroupLayout(pnl);
        pnl.setLayout(pnlLayout);
        pnlLayout.setHorizontalGroup(
            pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jLabel1))
            .addGroup(pnlLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel2)
                .addGap(23, 23, 23)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel4)
                .addGap(20, 20, 20)
                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel5)
                .addGap(23, 23, 23)
                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jButton1))
            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pnlLayout.setVerticalGroup(
            pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel2))
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel3))
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel4))
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel5))
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jButton1)
                .addGap(7, 7, 7)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void validar(String nombre,String apellidos,String telefono) throws ContactException{
        if(!telefono.matches("[1-9][0-9]{9}")){
            throw new ContactException("Numero invalido");}
        if(!nombre.matches("[a-zA-Z]*") || !apellidos.matches("[a-zA-Z\\s]*"))
            throw new ContactException("Nombre iinvalido");
    }
    public static Persona persona = new Persona();
    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        try {
            
            validar(txtNombre.getText(), txtApellidos.getText(), txtTelefono.getText());
            persona.pe[persona.co++] = new Persona(txtNombre.getText(), txtApellidos.getText(), txtTelefono.getText(), txtDireccion.getText());
        } catch (ContactException e) {
            showMessageDialog(null,e.getMessage());
        }
        
        
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void mEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mEliminarActionPerformed

    }//GEN-LAST:event_mEliminarActionPerformed
    NewDialog hijo = new NewDialog(this, true);
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        hijo.setVisible(true);
        hijo.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton1ActionPerformed

    
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JMenuItem mEliminar;
    private javax.swing.JPanel pnl;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}