package tn.esprit.autoloc.service.interfaces;

import tn.esprit.autoloc.domain.Vehicule;

import java.util.Set;

public interface IVehiculeService {

    Set<Vehicule> retrieveAllVehicules();

    Vehicule retrieveVehicule(Long vehiculeId);

    Vehicule addVehicule(Vehicule vehicule);

    void deleteVehicule(Long vehiculeId);

    Vehicule updateVehicule(Vehicule vehicule);
}