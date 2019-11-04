package aplicaciones.semana11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Reporte extends AppCompatActivity {

    public EditText edt1,edt2;
    public Button btncerrar;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reporte);
        btncerrar=(Button)findViewById(R.id.btncerrar);
        Bundle puente2=getIntent().getExtras();
        edt1.setText("Usuario "+puente2.get("usuario"));
        edt2.setText("Password: "+puente2.get("passwd"));

        btncerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x=new Intent(Reporte.this,MainActivity.class);
                startActivity(x);
                finish();
            }
        });
    }
}
