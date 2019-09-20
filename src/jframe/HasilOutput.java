package jframe;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class HasilOutput extends JFrame {

    String outputNama, outputJk, outputAgama, outputHobi, outputEmail; //deklarasi atribut

    final JTextField fnama = new JTextField();
    //deklarasi variabel
    JLabel lnama = new JLabel(" Nama Lengkap ");
    JLabel ljeniskelamin = new JLabel(" Jenis Kelamin ");
    JRadioButton rbPria = new JRadioButton(" Laki-Laki ");
    JRadioButton rbWanita = new JRadioButton("perempuan ");
    JLabel lagama = new JLabel(" Agama ");
    JLabel lhobby = new JLabel(" Hobby ");
    JLabel lemail = new JLabel(" Email ");

    JButton btnSave = new JButton("OK");

    public HasilOutput(String nama, String jk, String agama, String hobi, String email) {

        this.outputNama = nama;
        this.outputJk = jk;
        this.outputAgama = agama;
        this.outputHobi = hobi;
        this.outputEmail = email;
        
        //membuat java frame
        setTitle("Data USER");
        setDefaultCloseOperation(3);
        setSize(350, 200);

        ButtonGroup group = new ButtonGroup();
        group.add(rbPria);
        group.add(rbWanita);
        
        //memasukan variabel ke java frame
        setLayout(null);
        add(lnama);
        add(ljeniskelamin);
        add(lagama);
        add(lhobby);
        add(lemail);
        
        //mengatur bounds
        lnama.setBounds(10, 10, 200, 20);
        ljeniskelamin.setBounds(10, 35, 200, 20);
        lagama.setBounds(10, 60, 200, 20);
        lhobby.setBounds(10, 85, 200, 20);
        lemail.setBounds(10, 115, 170, 20);
        rbPria.setSelected(true);
        setVisible(true);
        
        //memanggil data yang disimpan dengan variabel
        lnama.setText("Nama : " + outputNama);
        ljeniskelamin.setText("Jenis Kelamin : " + outputJk);
        lagama.setText("Agama : " + outputAgama);
        lhobby.setText("Hobi : " + outputHobi);
        lemail.setText("Email/username : " + outputEmail);
    }
}
