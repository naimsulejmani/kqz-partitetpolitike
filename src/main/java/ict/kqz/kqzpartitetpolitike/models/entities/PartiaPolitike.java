package ict.kqz.kqzpartitetpolitike.models.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
//partia_politike
@Table(name = "partia_politike")
@Data
public class PartiaPolitike {
    @Id
    @Column(length = 10)
    private String id; //ppns, ppshb
    @Column(length = 200, unique = true)
    private String emri;
    private String llojiPartise; //lloji_partise
    private LocalDate dataERegjistrimit; //data_e_regjistrimit
    private boolean aktiv;
    private String kryetariPartise;
    private String logoUrl;

    public PartiaPolitike() {
    }

    public PartiaPolitike(String id, String emri, String llojiPartise, LocalDate dataERegjistrimit, boolean aktiv, String kryetariPartise, String logoUrl) {
        this.id = id;
        this.emri = emri;
        this.llojiPartise = llojiPartise;
        this.dataERegjistrimit = dataERegjistrimit;
        this.aktiv = aktiv;
        this.kryetariPartise = kryetariPartise;
        this.logoUrl = logoUrl;
    }
}
