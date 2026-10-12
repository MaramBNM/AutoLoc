package tn.esprit.autoloc.service.interfaces;

import tn.esprit.autoloc.domain.Contrat;

import java.util.Set;

public interface IContratService {

    Set<Contrat> retrieveAllContrats();

    Contrat retrieveContrat(Long contratId);

    Contrat addContrat(Contrat contrat);

    void deleteContrat(Long contratId);

    Contrat updateContrat(Contrat contrat);
}