package co.edu.uts.sistemas.crud_estudiante_hernandezbustos_anamilena;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.text.IDNA;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CrearProfesorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_profesor);
        Button btnVolver = findViewById(R.id.btnSalir);
        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    public void guardar(View view) {
        EditText doc = findViewById(R.id.txtDoc);
        EditText nom = findViewById(R.id.txtNom);
        EditText prof = findViewById(R.id.txtProf);
        EditText prog = findViewById(R.id.txtProg);

        if (doc.getText().toString().isEmpty()){
            Toast.makeText(this,"El documento es obligatorio",Toast.LENGTH_LONG).show();
        } else if (nom.getText().toString().isEmpty()){
            Toast.makeText(this,"El nombre es obligatorio",Toast.LENGTH_LONG).show();
        }else {
            Profesor profe = new Profesor(Long.parseLong(doc.getText().toString()),
                    nom.getText().toString());
            profe.setProfesion(prof.getText().toString());
            profe.setPrograma(prog.getText().toString());
            Info.PROFESORES.add(profe);
            setResult(RESULT_OK);
            finish();
        }
    }
}