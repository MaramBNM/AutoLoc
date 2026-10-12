package tn.esprit.autoloc.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.domain.Equipement;
import tn.esprit.autoloc.repository.EquipementRepository;
import tn.esprit.autoloc.service.interfaces.IEquipementService;

import java.util.HashSet;
import java.util.Set;

@Service
@AllArgsConstructor
public class EquipementServiceImpl implements IEquipementService {

    private EquipementRepository equipementRepository;

    @Override
    public Set<Equipement> retrieveAllEquipements() {
        return new HashSet<>(equipementRepository.findAll());
    }

    @Override
    public Equipement retrieveEquipement(Long equipementId) {
        return equipementRepository.findById(equipementId).get();
    }

    @Override
    public Equipement addEquipement(Equipement equipement) {
        return equipementRepository.save(equipement);
    }

    @Override
    public void deleteEquipement(Long equipementId) {
        equipementRepository.deleteById(equipementId);
    }

    @Override
    public Equipement updateEquipement(Equipement equipement) {
        return equipementRepository.save(equipement);
    }
}