package co.edu.uts.sistemas.crud_estudiante_hernandezbustos_anamilena;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CrearEstudianteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_estudiante);
    }

    public void salir(View view) {
        finish();
    }

    public void actividadSaludar(View view) {

        EditText nombre = findViewById(R.id.ETnombre);
        EditText documento = findViewById(R.id.ETdocumento);
        EditText edad = findViewById(R.id.ETedad);
        EditText email = findViewById(R.id.ETemail);
        EditText celular = findViewById(R.id.ETcelular);
        EditText programa = findViewById(R.id.ETprograma);

        Intent intent = new Intent(this, SaludarEstudianteActivity.class);
        intent.putExtra("nombre", nombre.getText().toString());
        intent.putExtra("documento", documento.getText().toString());
        intent.putExtra("edad", edad.getText().toString());
        intent.putExtra("email", email.getText().toString());
        intent.putExtra("telefono", celular.getText().toString());
        intent.putExtra("programa", programa.getText().toString());
        startActivity(intent);
        finish();
    }
}