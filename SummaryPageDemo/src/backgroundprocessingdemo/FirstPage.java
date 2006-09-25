/*
 * FirstPage.java
 *
 * Created on September 24, 2006, 12:57 PM
 */

package backgroundprocessingdemo;

import java.awt.Component;
import org.netbeans.spi.wizard.WizardPage;

/**
 *
 * @author  Tim Boudreau
 */
public class FirstPage extends WizardPage {
    
    /** Creates new form FirstPage */
    public FirstPage() {
        super ("one", "First step");
        initComponents();
    }
    
    public static String getDescription() {
        return "Check the checkbox";
    }
    
    protected String validateContents(Component component, Object event) {
        if (!jCheckBox1.isSelected()) {
            return "Checkbox must be checked";
        }
        return null;
    }
    
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jCheckBox1 = new javax.swing.JCheckBox();

        setLayout(new java.awt.GridLayout());

        jCheckBox1.setText("Click to enable the Next button");
        jCheckBox1.setBorder(javax.swing.BorderFactory.createEmptyBorder(12, 12, 12, 12));
        jCheckBox1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jCheckBox1.setName("checkbox");
        add(jCheckBox1);

    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBox1;
    // End of variables declaration//GEN-END:variables
    
}