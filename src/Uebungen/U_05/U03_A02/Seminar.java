package Uebungen.U_05.U03_A02;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Seminar {
    private final String Seminarname;
    private List<Student> teilnehmerListe;

    public Seminar(String seminarname) {
        Seminarname = seminarname;
    }

    public int getTeilnehmerzahl(){
        return teilnehmerListe.size();
    }

    public void anmelden(Student student){
        if (istAngemeldet(student)){
            throw new IllegalArgumentException("Student bereits angemeldet!");
        }
        teilnehmerListe.add(student);
    }

    public boolean istAngemeldet(Student student) {
        boolean angemeldet = false;
        for (Student teilnehmer : teilnehmerListe) {
            if (teilnehmer.getLastname().equals(student.getLastname())) {
                angemeldet = true;
                break;
            }
        }
        return angemeldet;
    }

    public String getSeminarname() {
        return Seminarname;
    }

    public List<Student> getTeilnehmerListe() {
        return teilnehmerListe;
    }
}
