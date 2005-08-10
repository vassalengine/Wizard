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
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Breed");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 370, -1));

        jTextField1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField1CaretUpdate(evt);
            }
        });

        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 200, -1));

        jLabel2.setText("Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, -1, -1));

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
            controller.setCanFinish(true);
        }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
    
}
