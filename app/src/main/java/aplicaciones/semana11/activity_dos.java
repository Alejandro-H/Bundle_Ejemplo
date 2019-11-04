package aplicaciones.semana11;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class activity_dos extends AppCompatActivity {
    public EditText edt1,edtpasswd;
    public Button btncerrar;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dos);
        edt1=(EditText)findViewById(R.id.edtusuario);
        edtpasswd=(EditText)findViewById(R.id.edtpassword);
        btncerrar=(Button)findViewById(R.id.btncerrar);
        Bundle puent=getIntent().getExtras();
        edt1.setText("Usuario: "+puent.getString("dato"));
        btncerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b=new Intent(activity_dos.this,MainActivity.class);
                startActivity(b);
                finish();
            }
        });
    }
}


