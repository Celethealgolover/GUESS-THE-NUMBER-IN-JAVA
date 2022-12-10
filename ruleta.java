package com.company;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import javax.swing.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.awt.Color;
import java.util.Random;
import java.net.URL;
interface JOC{
    public void FRAMEWORK();
    public void JOC();
    public int GENERATOR();
}
public class ruleta implements JOC{
    protected int contor=0;
    protected double y=5.0;
    protected float n,nfix;
    protected boolean ghicit = false;
    ruleta(float n)
    {
        this.n = n;
    }
    public void FRAMEWORK() {
        LocalDateTime t = LocalDateTime.now();
        DateTimeFormatter dt = DateTimeFormatter.ofPattern("E, MMM dd yyyy HH:mm:ss");
        String aux = t.format(dt);
        JFrame f = new JFrame("RENGLE's CAZINO");
        JButton b1 = new JButton("Ora si data actuala:" + aux);
        b1.setBounds(45, 90, 475, 100);
        b1.setBackground(Color.RED);
        JButton b2 = new JButton("Penalizarea pentru o incercare esuata:5++% din suma actuala");
        b1.setOpaque(true);
        b2.setBounds(45, 280, 475, 100);
        b2.setBackground(Color.magenta);
        b2.setOpaque(true);
        JButton b3 = new JButton("Castigul pentru ghicirea nr din prima:1.000.000$");
        b3.setBounds(45, 470, 475, 100);
        b3.setOpaque(true);
        JButton b4 = new JButton("Castigul pentru ghicirea nr din maxim 5 incercari:+5*\"suma pariata\"");
        b4.setBounds(610, 90, 475, 100);
        b4.setBackground(Color.green);
        b4.setOpaque(true);
        JButton b5 = new JButton("Castigul pentru numar ghicit intre 6 si 10 incercari:+3*\"suma pariata\"");
        b5.setBounds(610, 280, 475, 100);
        b5.setBackground(Color.yellow);
        b5.setOpaque(true);
        JButton b6 = new JButton("Castigul pentru numar ghicit intre 11 si 15 incercari:+1.5*\"suma pariata\"");
        b6.setBounds(610, 470, 475, 100);
        b6.setBackground(Color.blue);
        b6.setOpaque(true);
        JButton b7 = new JButton("16 incercari esuate->ELIMINARE din joc");
        b7.setBounds(350, 660, 475, 100);
        b7.setBackground(Color.LIGHT_GRAY);
        b7.setOpaque(true);
        f.setLayout(null);
        f.setSize(1150, 900);
        f.getContentPane().setBackground(Color.cyan);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.setVisible(true);
    }
    public int GENERATOR()
    {
        Random rand = new Random();
        return rand.nextInt(36);
    }
    public void JOC()
    {
        nfix=n;
        int x = GENERATOR();
        try {
            System.err.println("Numarul generat RANDOM este ascuns in \"cutiuta magica xD\"");
            FileWriter fl = new FileWriter("C:\\Users\\Celestin\\Desktop\\cutiuta_magica.txt");
            BufferedWriter output = new BufferedWriter(fl);
            output.write(Integer.toString(x));
            output.close();
            while (ghicit == false && contor <= 15&&n>=0) {
                contor++;
                ImageIcon i = new ImageIcon(new URL("https://cdn.getyourguide.com/img/location/5ffeb496e3e09.jpeg/99.jpg"));
                ImageIcon i2 = new ImageIcon(new URL("https://cdn.getyourguide.com/img/location/5ffeb496e3e09.jpeg/99.jpg"));
                JLabel j = new JLabel(i);
                JLabel j2 = new JLabel(i2);
                String numar = JOptionPane.showInputDialog(null, j, "Celestin's Cazino", 3);
                int nr_bun = Integer.parseInt(numar);
                if (nr_bun == x) {
                    ghicit = true;
                    JOptionPane.showMessageDialog(null, "FELICITARI!,ati ghicit numarul din a " + contor + 
                    "-a incercare!va rog sa verificati \"cutiuta magica xD\"", "Celestin's Cazino", 3);
                    // String numar2 = JOptionPane.showInputDialog(null, j2, "Andrei's Cazino", 3);
                } else if (nr_bun < x) {
                    JOptionPane.showMessageDialog(null, "Numarul este prea mic,incercati un numar mai mare,va rog!", "Celestin's Cazino", 3);

                } else if (nr_bun > x) {
                    JOptionPane.showMessageDialog(null, "Numarul este prea mare,incercati un numar mai mic,va rog!", "Celestin's Cazino", 3);
                }
                n-=(y/100)*n;
                y++;
            }
            if (contor == 1) {
                System.err.println("Ati intrat cu " + this.n + " $ si ati ghicit numarul din prima,deci acum aveti " + (n + 1000000) + "$!");
            }
            if(contor>=2&&contor<=5)
            {
                System.err.println("Ati intrat cu "+this.nfix+" $ si ati ghicit numarul din a "+contor+"-a incercare,deci acum aveti "+(n+5*nfix)+"$!");
            }
            if(contor>=6&&contor<=10)
            {
                System.err.println("Ati intrat cu "+this.nfix+" $ si ati ghicit numarul din a "+contor+"-a incercare,deci acum aveti "+(n+3*nfix)+"$!");

            }
            if(contor>=11&&contor<=15)
            {
                System.err.println("Ati intrat cu "+this.nfix+" $ si ati ghicit numarul din a "+contor+"-a incercare,deci acum aveti "+(n+1.5*nfix)+"$!");

            }
            if(contor>=16)
            {
                System.err.println("Ati intrat cu "+this.nfix+" $ si ati ghicit numarul din a "+contor+
                "-a incercare,deci acum aveti "+n+"$,pentru ca ati fost DESCALIFICAT");

            }
        }catch(IOException e)
        {
            return;
        }

    }
}
