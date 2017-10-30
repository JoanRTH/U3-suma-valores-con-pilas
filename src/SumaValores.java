import java.util.Stack;
public class SumaValores {
    public void Sumando(int n){
        int suma = 0;
        int objeto=0;
        Stack pila = new Stack();
        do{
            pila.push(n%10);
            n= n/10;
            
        }while (n>0);
        System.out.println(pila);
        
        do {
            objeto = (Integer) pila.pop();
            suma = suma + objeto;
        }while ( !(pila.empty()));
        System.out.println(suma);
    }
}
