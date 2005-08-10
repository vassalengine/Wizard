/*
 * CatHairLengthPanel.java
 *
 * Created on August 9, 2005, 10:58 PM
 */

package wizarddemo.panels;

import java.util.Map;
import javax.swing.JRadioButton;
import org.netbeans.spi.wizard.WizardController;

/**
 *
 * @author  Timothy Boudreau
 */
public class DogTempermentPanel extends javax.swing.JPanel {
    public static final String KEY_TEMPERMENT = "hairLength";
    
    private final WizardController controller;
    private final Map wizardData;
    
    /** Creates new form CatHairLengthPanel */
    public DogTempermentPanel(WizardController controller, Map wizardData) {
        initComponents();
        
        this.controller = controller;
        this.wizardData = wizardData;
        controller.setProblem ("No temperment chosen");
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        buttonGroup1 = new javax.swing.ButtonGroup();
        longHairButton = new javax.swing.JRadioButton();
        shortHairButton = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();

        setLayout(new java.awt.GridLayout(4, 1));

        setBorder(new javax.swing.border.EmptyBorder(new java.awt.Insets(1, 5, 1, 1)));
        buttonGroup1.add(longHairButton);
        longHairButton.setText("Playful");
        longHairButton.setBorder(new javax.swing.border.EmptyBorder(new java.awt.Insets(0, 0, 0, 0)));
        longHairButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        longHairButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tempermentSelected(evt);
            }
        });

        add(longHairButton);

        buttonGroup1.add(shortHairButton);
        shortHairButton.setText("Friendly");
        shortHairButton.setBorder(new javax.swing.border.EmptyBorder(new java.awt.Insets(0, 0, 0, 0)));
        shortHairButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        shortHairButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tempermentSelected(evt);
            }
        });

        add(shortHairButton);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Mean");
        jRadioButton1.setBorder(new javax.swing.border.EmptyBorder(new java.awt.Insets(0, 0, 0, 0)));
        jRadioButton1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tempermentSelected(evt);
            }
        });

        add(jRadioButton1);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("I really want a wolf...");
        jRadioButton2.setBorder(new javax.swing.border.EmptyBorder(new java.awt.Insets(0, 0, 0, 0)));
        jRadioButton2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tempermentSelected(evt);
            }
        });

        add(jRadioButton2);

    }
    // </editor-fold>//GEN-END:initComponents

    private void tempermentSelected(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tempermentSelected
        String txt = ((JRadioButton) evt.getSource()).getText();
        wizardData.put (KEY_TEMPERMENT, txt);
        controller.setProblem (null);
    }//GEN-LAST:event_tempermentSelected
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton longHairButton;
    private javax.swing.JRadioButton shortHairButton;
    // End of variables declaration//GEN-END:variables
    
}
