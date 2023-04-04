import javax.swing.*;

public class SwingWindow extends JFrame{
    private JPanel main;
    private JPanel titlepanel;
    private JLabel Title;
    private JPanel ButtonPanel;
    private JButton a1PlayerButton;
    private JButton trainingButton;
    private JButton a2PlayerButton;
    private JButton controlsButton;
    private JButton exitButton;

    public SwingWindow(){
        setContentPane(main);
        setTitle("Final Project");
        setSize(800,500);
        setLocation(250,600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }


}
