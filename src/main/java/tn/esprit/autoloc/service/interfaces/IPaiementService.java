package tn.esprit.autoloc.service.interfaces;

import tn.esprit.autoloc.domain.Paiement;

import java.util.Set;

public interface IPaiementService {

    Set<Paiement> retrieveAllPaiements();

    Paiement retrievePaiement(Long paiementId);

    Paiement addPaiement(Paiement paiement);

    void deletePaiement(Long paiementId);

    Paiement updatePaiement(Paiement paiement);
}