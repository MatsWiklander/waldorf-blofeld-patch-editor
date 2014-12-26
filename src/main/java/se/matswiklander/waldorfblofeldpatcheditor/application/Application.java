package main.java.se.matswiklander.waldorfblofeldpatcheditor.application;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.WindowConstants;

import net.miginfocom.swing.MigLayout;

public class Application extends JFrame {
        private static final long serialVersionUID = -3437062978258584126L;

        public static void main(String args[]) {
                java.awt.EventQueue.invokeLater(new Runnable() {
                        @Override
                        public void run() {
                                try {
                                        // UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
                                        // "com.sun.java.swing.plaf.motif.MotifLookAndFeel");
                                        UIManager.setLookAndFeel(UIManager
                                                        .getCrossPlatformLookAndFeelClassName());
                                } catch (Exception ex) {
                                        ex.printStackTrace();
                                }
                                new Application().setVisible(true);
                        }
                });
        }

        public Application() {
                setTitle("Random Acts of Kittens");

                getContentPane().setLayout((new MigLayout()));

                JTextField sourcePatchesFilterTextField = new JTextField();
                JComboBox sourcePatchesCategoryFilterComboBox = new JComboBox();
                JTable sourcePatchesTable = new JTable();

                JButton auditionPatchButton = new JButton("Audition");
                JButton keepPatchButton = new JButton("Keep");

                getContentPane().add(sourcePatchesFilterTextField,
                                "width 160px");
                getContentPane().add(sourcePatchesCategoryFilterComboBox,
                                "width 160px");

                getContentPane().add(auditionPatchButton);
                getContentPane().add(keepPatchButton, "wrap");

                getContentPane().add(sourcePatchesTable, "grow 100");
                pack();

                setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        }
}
