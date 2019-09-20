package jframe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

class ObjekGUI {

    public static void main(String[] args) { //main class
        GUI g = new GUI();
    }
}

class GUI extends JFrame {
    
    //deklarasi variabel
    final JTextField fnama = new JTextField();

    JLabel lnama = new JLabel(" Nama Lengkap ");

    JLabel ljeniskelamin = new JLabel(" Jenis Kelamin ");

    JRadioButton rbPria = new JRadioButton(" Laki-Laki ");
    JRadioButton rbWanita = new JRadioButton("perempuan ");

    JLabel lagama = new JLabel(" Agama ");
    String[] namaAgama
            = {"Islam", "Kristen", "Katolik", "Hindu", "Budha"};
    JComboBox cmbAgama = new JComboBox(namaAgama);

    JLabel lhobby = new JLabel(" Hobby ");

    JCheckBox cbSepakbola = new JCheckBox(" Sepakbola ");
    JCheckBox cbBasket = new JCheckBox(" Basket ");
    
    JTextField femail = new JTextField();
    JLabel lemail = new JLabel(" Email/username ");
    
    

    JButton btnSave = new JButton("Submit");

    public GUI() {
        //membuat java frame
        setTitle("FORM");
        setDefaultCloseOperation(3);
        setSize(350, 230);

        ButtonGroup group = new ButtonGroup();
        group.add(rbPria);
        group.add(rbWanita);
        
        //memasukan variabel ke java frame
        setLayout(null);
        add(lnama);
        add(fnama);
        add(ljeniskelamin);
        add(rbPria);
        add(rbWanita);
        add(lagama);
        add(cmbAgama);
        add(lhobby);
        add(cbSepakbola);
        add(cbBasket);
        add(lemail);
        add(femail);
        add(btnSave);

        //mengatur bounds
        lnama.setBounds(10, 10, 120, 20);
        fnama.setBounds(130, 10, 190, 20);
        ljeniskelamin.setBounds(10, 35, 120, 20);
        rbPria.setBounds(130, 35, 100, 20);
        rbWanita.setBounds(230, 35, 100, 20);
        lagama.setBounds(10, 60, 150, 20);
        cmbAgama.setBounds(130, 60, 150, 20);
        lhobby.setBounds(10, 85, 120, 20);
        cbSepakbola.setBounds(130, 85, 100, 20);
        cbBasket.setBounds(230, 85, 150, 20);
        lemail.setBounds(10, 115, 120, 20);
        femail.setBounds(130, 115, 190, 20);
        btnSave.setBounds(100, 145, 120, 20);
        rbPria.setSelected(true);
        setVisible(true);

        btnSave.addActionListener(new ActionListener() { //membuat aksi yang bisa 
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {

                    String nama = "", jk = "", agama = "", hobi = "", email = "";

                    if (fnama.getText().equals("")) {
                        JOptionPane.showMessageDialog(null, "Input Nama Tidak Boleh Kosong");
                        System.exit(0);
                    } 
                    
                    else {
                        nama = fnama.getText();
                    }

                    if (rbPria.isSelected()) {
                        jk = "Laki-laki";
                    } 
                    
                    else {
                        jk = "Wanita";
                    }

                    agama = cmbAgama.getSelectedItem().toString();

                    if (cbSepakbola.isSelected()) {
                        hobi = hobi + " Sepak Bola";
                    }
                    
                    if (cbBasket.isSelected()) {
                        hobi = hobi + " Basket";
                    }
                    
                    email = femail.getText();

                    System.out.println("nama : " + nama);
                    System.out.println("jk : " + jk);
                    System.out.println("agama : " + agama);
                    System.out.println("hobi : " + hobi);
                    System.out.println("email/username : " + email);

                    HasilOutput hasilOutput = new HasilOutput(nama, jk, agama, hobi, email);

                    //hasilOutput.getHasil(nama, jk, agama, hobi);
                    dispose();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Input Tidak Boleh Kosong");
                }
            }
        }
        );
    }
}
