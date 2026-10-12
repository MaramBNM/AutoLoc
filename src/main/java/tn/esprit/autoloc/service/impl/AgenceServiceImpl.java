package tn.esprit.autoloc.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.domain.Agence;
import tn.esprit.autoloc.repository.AgenceRepository;
import tn.esprit.autoloc.service.interfaces.IAgenceService;

import java.util.HashSet;
import java.util.Set;

@Service
@AllArgsConstructor
public class AgenceServiceImpl implements IAgenceService {

    private AgenceRepository agenceRepository;

    @Override
    public Set<Agence> retrieveAllAgences() {
        return new HashSet<>(agenceRepository.findAll());
    }

    @Override
    public Agence retrieveAgence(Long agenceId) {
        return agenceRepository.findById(agenceId).get();
    }

    @Override
    public Agence addAgence(Agence agence) {
        return agenceRepository.save(agence);
    }

    @Override
    public void deleteAgence(Long agenceId) {
        agenceRepository.deleteById(agenceId);
    }

    @Override
    public Agence updateAgence(Agence agence) {
        return agenceRepository.save(agence);
    }
}