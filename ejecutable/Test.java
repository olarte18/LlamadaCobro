package ejecutable ;

import javax.swing.JOptionPane;

public class Test
{
    public static void main(String[] args) {
        int t;
        int n;
        int B;
        t= Integer.parseInt(JOptionPane.showInputDialog("Digite el tiempo que duro la llamada :"));
        n=t-3;
        B=300;
        if(t<=3){JOptionPane.showMessageDialog(null, "El valor de la llamada es "+B);}
        else{JOptionPane.showMessageDialog(null,"El valor de la llamda es "+n*;}

    }
}