package fisei.uta.app001;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView r2;
    Metodos m = new Metodos();
    TextView num1;
    TextView num2;
    TextView resultado;
    TextView segres = findViewById(R.id.reversatxt);
    private int codigoRequerido =1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /*@Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if ((requestCode == codigoRequerido) && (resultCode == RESULT_OK)) {
            
            regres.setText(data.getStringExtra("nombre"));
            editTextApellido.setText(data.getStringExtra("apellido"));
            editTextBase.setText(data.getStringExtra("base"));
            base = Integer.parseInt(data.getStringExtra("base"));
            exponente=Integer.parseInt(data.getStringExtra("exponente"));
            editTextExponente.setText(data.getStringExtra("exponente"));
            numero = Integer.parseInt(data.getStringExtra("numero"));

            buttonMostrarResultados.setEnabled(true);

        }
    }*/
    public void Click(View view){
        num1 =findViewById(R.id.num1);
        num2 =findViewById(R.id.num2);
        resultado =findViewById(R.id.resultado);
        segres = findViewById(R.id.segundores);
        float n1 = Float.parseFloat(num1.getText().toString());
        float n2 = Float.parseFloat(num2.getText().toString());
        float r = m.Suma(n1,n2);
        resultado.setText(String.valueOf(r));
        //segres.setText(String.valueOf(r));
    }
    public void siguiente(View view){
        Intent i = new Intent(this,SegundoActivity.class);
        i.putExtra("resultado",resultado.getText().toString());
        //this.startActivity(i);
        startActivityForResult(i, codigoRequerido);
    }
}