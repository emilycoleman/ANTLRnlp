package app;

import javax.swing.*;
import java.awt.*;
import org.antlr.v4.gui.TreeViewer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow {

    public static void main(String[] args) {
        MainWindow mainWindow = new MainWindow();
    }

    public MainWindow() {
        JFrame frame = new JFrame();
        frame.setPreferredSize( new Dimension(600, 800));
        JPanel container = new JPanel();

        JTextField textField = new JTextField("Enter your sentence here!", 40);

        container.add(textField);
        JTabbedPane tabbedPane = new JTabbedPane();
        container.add(tabbedPane);

        textField.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent event) {
                    String sentence = textField.getText();
                    SentenceParse parseSentence = new SentenceParse(sentence);
                    TreeViewer treeViewer = parseSentence.getTreeViewer();
                    JScrollPane newTree = new JScrollPane(treeViewer);
                    tabbedPane.addTab("", newTree);
                    tabbedPane.setSelectedComponent(newTree);
                }
            }
        );

        frame.add(container);
        frame.pack();
        frame.setLocationRelativeTo( null );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setVisible( true );
    }
}

