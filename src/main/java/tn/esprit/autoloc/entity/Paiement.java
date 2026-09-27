package tn.esprit.autoloc.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "paiement")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Paiement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long idPaiement;

    private LocalDate datePaiement;

    @Enumerated(EnumType.STRING)
    private ModePaiement modePaiement;

    private BigDecimal montant;
}