package ict.kqz.kqzpartitetpolitike.models.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

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

//    @OneToMany(fetch = FetchType.LAZY )
//    @JoinColumn(name = "antari_id", referencedColumnName = "id")
//    private List<Antari> antaret;

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
