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
                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"));
                JLabel j = new JLabel(i);
                JLabel j2 = new JLabel(i2);
                String numar = JOptionPane.showInputDialog(null, j, "Celestin's Cazino", 3);
                int nr_bun = Integer.parseInt(numar);
                if (nr_bun == x) {
                    ghicit = true;
                    JOptionPane.showMessageDialog(null, "FELICITARI!,ati ghicit numarul din a " + contor + "-a incercare!va rog sa verificati \"cutiuta magica xD\"", "Celestin's Cazino", 3);
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
                System.err.println("Ati intrat cu "+this.nfix+" $ si ati ghicit numarul din a "+contor+"-a incercare,deci acum aveti "+n+"$,pentru ca ati fost DESCALIFICAT");

            }
        }catch(IOException e)
        {
            return;
        }

    }
}