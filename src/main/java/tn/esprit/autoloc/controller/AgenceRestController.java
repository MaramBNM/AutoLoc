package tn.esprit.autoloc.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Agence;
import tn.esprit.autoloc.service.interfaces.IAgenceService;

import java.util.Set;

@RestController
@AllArgsConstructor
@RequestMapping("/agence")
public class AgenceRestController {

    private IAgenceService agenceService;

    @GetMapping("/retrieve-all-agences")
    public Set<Agence> getAgences() {
        return agenceService.retrieveAllAgences();
    }

    @GetMapping("/retrieve-agence/{agence-id}")
    public Agence retrieveAgence(@PathVariable("agence-id") Long agenceId) {
        return agenceService.retrieveAgence(agenceId);
    }

    @PostMapping("/add-agence")
    public Agence addAgence(@RequestBody Agence agence) {
        return agenceService.addAgence(agence);
    }

    @DeleteMapping("/delete-agence/{agence-id}")
    public void deleteAgence(@PathVariable("agence-id") Long agenceId) {
        agenceService.deleteAgence(agenceId);
    }

    @PutMapping("/update-agence")
    public Agence updateAgence(@RequestBody Agence agence) {
        return agenceService.updateAgence(agence);
    }
}