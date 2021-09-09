package co.edu.uts.sistemas.crud_estudiante_hernandezbustos_anamilena;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txtIni = findViewById(R.id.txtInicio);

        txtIni.setText("Taller 3 -Aplicaciones moviles");
        Info.cargaDatosProfes(5);
    }

    public void CrearIni(View view) {
        Intent intent = new Intent(MainActivity.this, CrearEstudianteActivity.class);
        startActivity(intent);
    }

    public void crearProfe (View view){
        Intent intent = new Intent(MainActivity.this, CrearProfesorActivity.class);
        startActivity(intent);
    }

    public void listarProfes (View view){
        Intent intent = new Intent(MainActivity.this, ListarProfesoresActivity.class);
        startActivity(intent);
    }
}