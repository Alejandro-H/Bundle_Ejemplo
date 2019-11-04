package aplicaciones.semana11;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public EditText edtusuario,edtpassword;
    public Button btnaceptar;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnaceptar= findViewById(R.id.btnaceptar);
        edtusuario= findViewById(R.id.edtusuario);
        edtpassword= findViewById(R.id.edtpassword);
        btnaceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario=edtusuario.getText().toString();
                String password = edtpassword.getText().toString();
                if (usuario.equalsIgnoreCase("alejandro")&& password.equalsIgnoreCase("huilcaya")) {
                    Intent vp = new Intent(MainActivity.this, activity_dos.class);
                    Bundle puent=new Bundle();
                    puent.putString("dato",edtusuario.getText().toString()+" Password:"+edtpassword.getText().toString());
                    vp.putExtras(puent);
                    startActivity(vp);
                } else {
                    Toast.makeText(MainActivity.this, "Error de usuario y/o password", Toast.LENGTH_SHORT).show();
                }
            }
        }
        );
    }
}









