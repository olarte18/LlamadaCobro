package ejecutable ;

import javax.swing.JOptionPane;

public class Test
{
    public static void main(String[] args) {
        int t;
        int n;
        int B;
        int c;
        t= Integer.parseInt(JOptionPane.showInputDialog("Digite los minutos que duro la llamada: "));
        n=t-3;
        B=300;
        c=(n*50)+B;
        if(t<=3){JOptionPane.showMessageDialog(null, "El valor de la llamada es "+B);}
        else{JOptionPane.showMessageDialog(null,"El valor de la llamda es "+c);}

        //end
        System.exit(0);

    }
}