package brad.tech.util.uuid;

import java.util.UUID;
import javax.swing.JPanel;

/**
 * This is the User Interface view of the Application.
 * 
 * Created  dynamically using the Netbeans form designer tool.
 * 
 * @author brad
 */
class UIPanel extends JPanel {

    public UIPanel() {
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

        lblLogo = new javax.swing.JLabel();
        javax.swing.JLabel lblInfo = new javax.swing.JLabel();
        fldUUID = new javax.swing.JTextField();
        btnGenerate = new javax.swing.JButton();
        btnCopy = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        lblStatus = new javax.swing.JLabel();

        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblInfo.setFont(lblInfo.getFont().deriveFont(lblInfo.getFont().getStyle() | java.awt.Font.BOLD, lblInfo.getFont().getSize()+1));
        lblInfo.setText("<html>\nA Universally Unique Identifier (UUID) is a 128-bit<br />\ninteger number used to identify resources. UUIDs are<br />\nused in programming as database keys, component<br />\nidentifiers, or just about anywhere else a truly unique<br />\nidentifier is required.<br />\n</html>");

        fldUUID.setEditable(false);
        fldUUID.setBackground(new java.awt.Color(255, 255, 255));
        fldUUID.setFont(fldUUID.getFont().deriveFont(fldUUID.getFont().getStyle() | java.awt.Font.BOLD, fldUUID.getFont().getSize()+1));
        fldUUID.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));

        btnGenerate.setText("Generate");
        btnGenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateUUID(evt);
            }
        });

        btnCopy.setText("Copy");
        btnCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyAction(evt);
            }
        });

        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeAction(evt);
            }
        });

        lblStatus.setText("OK");
        lblStatus.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblInfo))
                            .addComponent(fldUUID, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnGenerate, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCopy, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInfo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGenerate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCopy, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fldUUID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void generateUUID(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateUUID
        // empty
        this.fldUUID.setText("");
        this.lblStatus.setText("");
        //generate
        final var uuid = UUID.randomUUID().toString();
        // display results
        this.fldUUID.setText(uuid.toUpperCase());
        this.lblStatus.setText("Generated successfully");
    }//GEN-LAST:event_generateUUID

    private void copyAction(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyAction
        // determine string
        final var uuid = this.fldUUID.getText().trim();
        if (!uuid.isBlank()){
            
            this.lblStatus.setText("Copied to clipboard");
        }
    }//GEN-LAST:event_copyAction

    private void closeAction(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeAction
        System.exit(0);
    }//GEN-LAST:event_closeAction


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnCopy;
    private javax.swing.JButton btnGenerate;
    private javax.swing.JTextField fldUUID;
    javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblStatus;
    // End of variables declaration//GEN-END:variables
}
