package tn.esprit.autoloc.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.domain.Paiement;
import tn.esprit.autoloc.repository.PaiementRepository;
import tn.esprit.autoloc.service.interfaces.IPaiementService;

import java.util.HashSet;
import java.util.Set;

@Service
@AllArgsConstructor
public class PaiementServiceImpl implements IPaiementService {

    private PaiementRepository paiementRepository;

    @Override
    public Set<Paiement> retrieveAllPaiements() {
        return new HashSet<>(paiementRepository.findAll());
    }

    @Override
    public Paiement retrievePaiement(Long paiementId) {
        return paiementRepository.findById(paiementId).get();
    }

    @Override
    public Paiement addPaiement(Paiement paiement) {
        return paiementRepository.save(paiement);
    }

    @Override
    public void deletePaiement(Long paiementId) {
        paiementRepository.deleteById(paiementId);
    }

    @Override
    public Paiement updatePaiement(Paiement paiement) {
        return paiementRepository.save(paiement);
    }
}