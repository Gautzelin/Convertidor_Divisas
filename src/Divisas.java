import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Divisas {
    private JPanel mainPanel;
    private JButton convertirBTN;
    private JTextField destinoTF;
    private JComboBox origenCB;
    private JComboBox destinoCB;
    private JTextField origenTF;
    private JLabel DestinoTXT;

    public Divisas() {
        double [] tarifa = {1, 0.98, 4289.67, 20.37, 3.93, 17.91};
        origenCB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int m = origenCB.getSelectedIndex()+1;
                switch(m){
                    case 1: //dolares
                        tarifa[0] = 1;
                        tarifa[1] = 0.98;
                        tarifa[2] = 4289.67;
                        tarifa[3] = 20.37;
                        tarifa[4] = 3.93;
                        tarifa[5] = 17.91;
                        break;
                    case 2: // eros
                        tarifa[0] = 1.02;
                        tarifa[1] = 1;
                        tarifa[2] = 4386.92;
                        tarifa[3] = 20.82;
                        tarifa[4] = 4.02;
                        tarifa[5] = 18.32;
                        break;
                    case 3: //pesos colombianos

                        tarifa[0] = 0.00023;
                        tarifa[1] = 0.00022;
                        tarifa[2] = 1;
                        tarifa[3] = 0.0047;
                        tarifa[4] = 0.0009;
                        tarifa[5] = 0.0041;
                        break;
                    case 4: // peso mexicano
                        tarifa[0] = 0.049;
                        tarifa[1] = 0.048;
                        tarifa[2] = 210.61;
                        tarifa[3] = 1;
                        tarifa[4] = 0.19;
                        tarifa[5] = 0.88;
                        break;
                    case 5: // sol peruano

                        tarifa[0] = 0.25;
                        tarifa[1] = 0.25;
                        tarifa[2] = 1092.27;
                        tarifa[3] = 5.19;
                        tarifa[4] = 1;
                        tarifa[5] = 4.56;
                        break;
                    case 6: // lira turca
                        tarifa[0] = 0.056;
                        tarifa[1] = 0.055;
                        tarifa[2] = 239.45;
                        tarifa[3] = 1.14;
                        tarifa[4] = 0.22;
                        tarifa[5] = 1;
                        break;

                }
                //auxiliarTXT.setText(origenCB.getSelectedItem().toString());
            }
        });
        convertirBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double tarifasSeleccionadas = tarifa[destinoCB.getSelectedIndex()];
                Double resultado = Double.parseDouble(origenTF.getText()) * tarifasSeleccionadas;
                destinoTF.setText(resultado.toString());
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Monedas");
        frame.setContentPane(new Divisas().mainPanel);
        frame.setTitle("Welcome");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
