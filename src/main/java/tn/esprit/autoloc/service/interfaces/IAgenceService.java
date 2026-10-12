package tn.esprit.autoloc.service.interfaces;

import tn.esprit.autoloc.domain.Agence;

import java.util.Set;

public interface IAgenceService {

    Set<Agence> retrieveAllAgences();

    Agence retrieveAgence(Long agenceId);

    Agence addAgence(Agence agence);

    void deleteAgence(Long agenceId);

    Agence updateAgence(Agence agence);
}