package tn.esprit.autoloc.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.domain.Contrat;
import tn.esprit.autoloc.repository.ContratRepository;
import tn.esprit.autoloc.service.interfaces.IContratService;

import java.util.HashSet;
import java.util.Set;

@Service
@AllArgsConstructor
public class ContratServiceImpl implements IContratService {

    private ContratRepository contratRepository;

    @Override
    public Set<Contrat> retrieveAllContrats() {
        return new HashSet<>(contratRepository.findAll());
    }

    @Override
    public Contrat retrieveContrat(Long contratId) {
        return contratRepository.findById(contratId).get();
    }

    @Override
    public Contrat addContrat(Contrat contrat) {
        return contratRepository.save(contrat);
    }

    @Override
    public void deleteContrat(Long contratId) {
        contratRepository.deleteById(contratId);
    }

    @Override
    public Contrat updateContrat(Contrat contrat) {
        return contratRepository.save(contrat);
    }
}