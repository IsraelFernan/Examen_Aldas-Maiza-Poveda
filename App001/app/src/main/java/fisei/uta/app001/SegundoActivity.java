package fisei.uta.app001;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SegundoActivity extends AppCompatActivity {
    Metodos m = new Metodos();
    TextView vista;
    TextView res;
    TextView factorial;
    private int codigoRequerido = 1;
    private Object MainActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle datosExtra = getIntent().getExtras();
        String dato=datosExtra.getString("resultado");
        setContentView(R.layout.activity_segundo);
        vista = findViewById(R.id.segundores);
        vista.setText(dato);
    }
    public void click(View view){
        res = findViewById(R.id.segundores);
        factorial=findViewById(R.id.segundares);
        float r = Float.parseFloat(res.getText().toString());
        float e = m.factorial(r);
        factorial.setText(String.valueOf(e));
    }
    public void reversa(View view){
        Intent i = new Intent(this,MainActivity.class);
        i.putExtra("factorial",factorial.getText().toString());
        this.setResult(Activity.RESULT_OK, i);
        startActivity(i);
    }
}