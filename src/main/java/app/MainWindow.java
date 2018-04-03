package app;

import javax.swing.*;
import java.awt.*;
import org.antlr.v4.gui.TreeViewer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow {

    public static void main(String[] args) {
        new MainWindow();
    }

    private MainWindow() {
        //playing w GUI

        JTextField jTextField1 = new JTextField();
        JTabbedPane jTabbedPane1 = new JTabbedPane();
        jTabbedPane1.setPreferredSize(new Dimension(600, 600));

        JFrame frame = new JFrame();
        jTextField1.setPreferredSize(new Dimension(500, 30));
        frame.setPreferredSize( new Dimension(600, 800));
        JPanel container = new JPanel();
        container.add(jTextField1);
        container.add(jTabbedPane1);

        jTextField1.setText("Enter your sentence here");

        jTextField1.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent event) {
                    String input = jTextField1.getText();
                    String[] sentences = input.split("\\.");
                    for(String sentence : sentences) {
                        SentenceParse parseSentence = new SentenceParse(sentence);
                        TreeViewer treeViewer = parseSentence.getTreeViewer();

                        JScrollPane jScrollPane1 = new JScrollPane();
                        JScrollPane jScrollPane2 = new JScrollPane();
                        JLabel readabilityScoreLabel = new JLabel();

                        JSplitPane jSplitPane1 = new JSplitPane(JSplitPane.VERTICAL_SPLIT, jScrollPane1, jScrollPane2);
                        jScrollPane1.setViewportView(readabilityScoreLabel);
                        jScrollPane2.getViewport().add(treeViewer);
                        jTabbedPane1.addTab("", jSplitPane1);
                        jTabbedPane1.setSelectedComponent(jSplitPane1);

                        StringBuilder scores = new StringBuilder();
                        scores.append(String.format("<html>\"%s\"<br />", sentence));
                        scores.append(String.format("Original Flesch Readability Ease Score: %.2f <br />", parseSentence.getFleschScore()));
                        scores.append(String.format("Adjusted readability score: %.2f </html>", parseSentence.getAdjustedScore()));
                        readabilityScoreLabel.setText(scores.toString());
                    }
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
