/*
 * CatBreedPanel.java
 *
 * Created on August 9, 2005, 11:02 PM
 */

package wizarddemo.panels;

import java.util.Arrays;
import java.util.Map;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import org.netbeans.spi.wizard.WizardController;

/**
 *
 * @author  Timothy Boudreau
 */
public class CatBreedPanel extends javax.swing.JPanel {
    
    private final WizardController controller;
    private final Map wizardData;
    
    /** Creates new form CatHairLengthPanel */
    public CatBreedPanel(WizardController controller, Map wizardData) {
        initComponents();
        
        this.controller = controller;
        this.wizardData = wizardData;
        configureComboContents();
    }
    
    public void addNotify() {
        super.addNotify();
        
        //We will selectively change what's in the 
        //combo box based on the contents of the map
        configureComboContents();
    }
    
    private static final String[] SHORT_HAIR_BREEDS = new String[] {
            "Siamese", "Manx", "Burmese" };
            
    private static final String[] LONG_HAIR_BREEDS = new String[] {
        "Persian", "Himalayan"
    };
    
    public static final String KEY_CAT_BREED = "catBreed";
    public static final String KEY_PET_NAME = "petName";
    
    private void configureComboContents() {
        boolean shorthair = CatHairLengthPanel.VALUE_SHORT.equals ( 
                wizardData.get ( CatHairLengthPanel.KEY_HAIR ) );
        
        String[] comboData = shorthair ? 
            SHORT_HAIR_BREEDS : LONG_HAIR_BREEDS;
        
        ComboBoxModel mdl = new DefaultComboBoxModel( comboData );
        
        jComboBox1.setModel(mdl);
        
        Object alreadySetValue = wizardData.get(KEY_CAT_BREED);
        
        if ( alreadySetValue != null && 
             Arrays.asList(comboData).indexOf( alreadySetValue ) != -1 ) {
            
            mdl.setSelectedItem( alreadySetValue );
        }
        wizardData.put (KEY_CAT_BREED, mdl.getSelectedItem());
        update();
    }
    
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("Breed");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 12;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(22, 8, 0, 0);
        add(jLabel1, gridBagConstraints);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 319;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 3, 0, 6);
        add(jComboBox1, gridBagConstraints);

        jTextField1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField1CaretUpdate(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 364;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(37, 2, 200, 0);
        add(jTextField1, gridBagConstraints);

        jLabel2.setText("Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(37, 10, 0, 0);
        add(jLabel2, gridBagConstraints);

    }
    // </editor-fold>//GEN-END:initComponents

    private void jTextField1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField1CaretUpdate
        String name = jTextField1.getText().trim();
        if (name.length() > 0) {
            wizardData.put(KEY_PET_NAME, name);
        }
        update();
    }//GEN-LAST:event_jTextField1CaretUpdate

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        wizardData.put (KEY_CAT_BREED, jComboBox1.getSelectedItem());
        update();
    }//GEN-LAST:event_jComboBox1ActionPerformed
    
    private void update() {
        Object breed = wizardData.get(KEY_CAT_BREED);
        Object name = wizardData.get(KEY_PET_NAME);
        if (breed == null) {
            controller.setProblem ("Select a breed");
        } else if (name == null) {
            controller.setProblem("Your pet needs a name");
        } else {
            controller.setProblem (null);
            controller.setForwardNavigationMode(WizardController.MODE_CAN_FINISH);
        }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
    
}
