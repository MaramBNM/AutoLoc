package tn.esprit.autoloc.service.interfaces;

import tn.esprit.autoloc.domain.Equipement;

import java.util.Set;

public interface IEquipementService {

    Set<Equipement> retrieveAllEquipements();

    Equipement retrieveEquipement(Long equipementId);

    Equipement addEquipement(Equipement equipement);

    void deleteEquipement(Long equipementId);

    Equipement updateEquipement(Equipement equipement);
}