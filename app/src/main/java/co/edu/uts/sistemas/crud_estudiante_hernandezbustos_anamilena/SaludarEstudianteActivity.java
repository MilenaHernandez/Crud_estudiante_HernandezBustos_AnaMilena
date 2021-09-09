package co.edu.uts.sistemas.crud_estudiante_hernandezbustos_anamilena;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SaludarEstudianteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludar_estudiante);

        String nombre = getIntent().getStringExtra("nombre");
        String documento = getIntent().getStringExtra("documento");
        String edad = getIntent().getStringExtra("edad");
        String email = getIntent().getStringExtra("email");
        String telefono = getIntent().getStringExtra("telefono");
        String programa = getIntent().getStringExtra("programa");

        TextView saludo = findViewById(R.id.TxtSaludo);
        saludo.setText(saludo.getText()+"\n Nombres: "+ nombre +"\n Documento: "+ documento +
                "\n Edad: "+ edad +"\n Correo: "+ email +"\n Teléfono: "+ telefono +
                "\n Programa: "+ programa);
    }

    public void salir (View view) {
        finish();
    }
}