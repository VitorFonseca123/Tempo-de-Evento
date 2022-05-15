package tempo.pkgdo.evento;
import java.util.Scanner;

/**
 *
 * @author Vitor
 */
public class TempoDoEvento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        //inicio
        String[] d = in.nextLine().split(" ");
        int dia1 = Integer.parseInt(d[1]);
        String[] hora1 = in.nextLine().split(" : ");
        int h1 = Integer.parseInt(hora1[0]);
        int mm1 = Integer.parseInt(hora1[1]);
        int ss1 = Integer.parseInt(hora1[2]);
        
        
        //termino
        String[] d2 = in.nextLine().split(" ");
        int dia2=Integer.parseInt(d2[1]);
        String[] hora2 = in.nextLine().split(" : ");
        int h2 = Integer.parseInt(hora2[0]);
        int mm2 = Integer.parseInt(hora2[1]);
        int ss2 = Integer.parseInt(hora2[2]);
        
        int dt = dia2-dia1;
        int ht = h2-h1;
        int mt=mm2-mm1;
        int st = ss2-ss1;
        
        if(ht<0){
            dt--;
            ht+=24;
        }else if(mt<0){
            ht--;
            mt+=60;
        }else if(st<0){
            mt--;
            st+=60;
        }
        
        System.out.println(dt+" dia (s)");
        System.out.println(ht+" hora (s)");
        System.out.println(mt+" minuto (s)");
        System.out.println(st+" segundo (s)");
       
        
        
    }
    
}
