package co.edu.uts.sistemas.crud_estudiante_hernandezbustos_anamilena;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListarProfesoresActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_profesores);
        listarInformacion();
    }

    private void listarInformacion() {
        ListView lista = findViewById(R.id.listProfes);

        ArrayAdapter<Profesor> adaptador = new ArrayAdapter<>(
                getApplicationContext(),
                android.R.layout.simple_list_item_single_choice,
                Info.PROFESORES
        );
        lista.setAdapter(adaptador);
    }

    public void volver(View view) {
        setResult(RESULT_CANCELED);
        finish();
    }
}