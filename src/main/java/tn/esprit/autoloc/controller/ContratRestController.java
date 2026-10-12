package tn.esprit.autoloc.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Contrat;
import tn.esprit.autoloc.service.interfaces.IContratService;

import java.util.Set;

@RestController
@AllArgsConstructor
@RequestMapping("/contrat")
public class ContratRestController {

    private IContratService contratService;

    @GetMapping("/retrieve-all-contrats")
    public Set<Contrat> getContrats() {
        return contratService.retrieveAllContrats();
    }

    @GetMapping("/retrieve-contrat/{contrat-id}")
    public Contrat retrieveContrat(@PathVariable("contrat-id") Long contratId) {
        return contratService.retrieveContrat(contratId);
    }

    @PostMapping("/add-contrat")
    public Contrat addContrat(@RequestBody Contrat contrat) {
        return contratService.addContrat(contrat);
    }

    @DeleteMapping("/delete-contrat/{contrat-id}")
    public void deleteContrat(@PathVariable("contrat-id") Long contratId) {
        contratService.deleteContrat(contratId);
    }

    @PutMapping("/update-contrat")
    public Contrat updateContrat(@RequestBody Contrat contrat) {
        return contratService.updateContrat(contrat);
    }
}