package fisei.uta.app001;

import android.app.Activity;
import android.text.Layout;
import android.widget.TextView;

public class Metodos {
    public float Suma(float valor1,float valor2){
        return valor1 + valor2;
    }
    public float ObtenerDato(Activity nombre){
        TextView respuesta = nombre.findViewById(R.id.resultado);
        float r = Float.parseFloat(respuesta.toString());
        return r;
    }
    public float factorial(float num){
        int i=1;
        float f=1;
        while(num>=i){
            f*=i;
            i++;
        }
        return f;
    }
    public int potencia(int num, int potencia){
        int i=1;
        int r=1;
        while(potencia>=i){
            r*=num;
            i++;
        }
        return r;
    }
}
