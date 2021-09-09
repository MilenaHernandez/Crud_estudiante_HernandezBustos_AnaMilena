package co.edu.uts.sistemas.crud_estudiante_hernandezbustos_anamilena;

import java.util.ArrayList;

public class Info {

    public static final ArrayList<Profesor> PROFESORES = new ArrayList<>();

    public static void cargaDatosProfes(int numero) {
        for (int i=1; i<=numero; i++) {
            Profesor est = new Profesor(i,"Nombre"+i);
            Info.PROFESORES.add(est);
        }
    }
}
