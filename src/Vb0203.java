import javax.swing.*;
import java.awt.event.*;

public class Vb0203 extends JFrame
{
    public static void main (String args[])
    {
        JFrame frame = new Vb0203();
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Voorbeeld 0203");
        JPanel paneel = new Paneel();
        frame.setContentPane(paneel);
        frame.setVisible(true);
    }
}
class Paneel extends JPanel
{
    private JButton knop;
    private JTextField tekstvak;

    public Paneel()
    {
        knop = new JButton("Klikken");
        KnopHandler kh = new KnopHandler();
        knop.addActionListener(kh);
        tekstvak = new JTextField(10);
        add(knop);
        add(tekstvak);
    }
    class KnopHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            tekstvak.setText("Je hebt geklikt!");
        }
    }
}
