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
        JPanel container = new JPanel();
        JPanel topPane = new JPanel();
        JPanel bottomPane = new JPanel();
        bottomPane.setSize(new Dimension(40, 100));

        container.setLayout(new GridLayout(2,1));
        topPane.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLUE), ""));
        bottomPane.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLUE), "Syntax Tree"));

        JTextField textField = new JTextField("Enter your sentence here!", 40);
        textField.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent event) {
                    String sentence = textField.getText();
                    SentenceParse parseSentence = new SentenceParse(sentence);
                    TreeViewer treeViewer = parseSentence.getTreeViewer();

                    //bottomPane.remove(); //make treeViewer a variable
                    bottomPane.add(new JScrollPane(treeViewer));
                    bottomPane.repaint();
                    bottomPane.revalidate();
                }
            }
        );

        topPane.add(textField);
        container.add(topPane);
        container.add(bottomPane);

        frame.add(container);
        frame.pack();
        frame.setLocationRelativeTo( null );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setVisible( true );
    }
}

