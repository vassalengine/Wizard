/*
 *                 Sun Public License Notice
 * 
 * The contents of this file are subject to the Sun Public License
 * Version 1.0 (the "License"). You may not use this file except in
 * compliance with the License. A copy of the License is available at
 * http://www.sun.com/
 * 
 * The Original Code is NetBeans. The Initial Developer of the Original
 * Code is Sun Microsystems, Inc. Portions Copyright 1997-2005 Sun
 * Microsystems, Inc. All Rights Reserved.
 */
/*
 * AnimalTypePage.java
 *
 * Created on August 20, 2005, 2:22 PM
 */

package wizardpagedemo;

import java.awt.Component;
import org.netbeans.spi.wizard.WizardPage;

/**
 * Example extension of WizardPage.  All updating of the wizard settings is
 * done automagically - we just set the component names for all of the radio
 * buttons to whatever the map key for them should be.
 *
 * @author  Tim Boudreau
 */
public class AnimalTypePage extends WizardPage {
    
    /** Creates new form AnimalTypePage */
    public AnimalTypePage() {
        initComponents();
    }
    
    public static final String getID() {
        return "animalType";
    }
    
    public static final String getDescription() {
        return "Choose a kind of animal";
    }
    
    protected String validateContents (Component component, Object o) {
        //Initially, no radio button is selected, so set the problem string
        if (!jRadioButton1.isSelected() && !jRadioButton2.isSelected() && !jRadioButton3.isSelected()) {
            return "You must select an animal";
        } else {
            return null;
        }
    }
    
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        buttonGroup1 = new javax.swing.ButtonGroup();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();

        setLayout(new java.awt.GridLayout());

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Mammal");
        jRadioButton1.setBorder(new javax.swing.border.EmptyBorder(new java.awt.Insets(0, 0, 0, 0)));
        jRadioButton1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jRadioButton1.setName("mammal");
        add(jRadioButton1);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Reptile");
        jRadioButton2.setBorder(new javax.swing.border.EmptyBorder(new java.awt.Insets(0, 0, 0, 0)));
        jRadioButton2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jRadioButton2.setName("reptile");
        add(jRadioButton2);

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Insect");
        jRadioButton3.setBorder(new javax.swing.border.EmptyBorder(new java.awt.Insets(0, 0, 0, 0)));
        jRadioButton3.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jRadioButton3.setName("insect");
        add(jRadioButton3);

    }
    // </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    // End of variables declaration//GEN-END:variables
    
}
