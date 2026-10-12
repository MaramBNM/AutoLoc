package tn.esprit.autoloc.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Equipement;
import tn.esprit.autoloc.service.interfaces.IEquipementService;

import java.util.Set;

@RestController
@AllArgsConstructor
@RequestMapping("/equipement")
public class EquipementRestController {

    private IEquipementService equipementService;

    @GetMapping("/retrieve-all-equipements")
    public Set<Equipement> getEquipements() {
        return equipementService.retrieveAllEquipements();
    }

    @GetMapping("/retrieve-equipement/{equipement-id}")
    public Equipement retrieveEquipement(
            @PathVariable("equipement-id") Long equipementId) {
        return equipementService.retrieveEquipement(equipementId);
    }

    @PostMapping("/add-equipement")
    public Equipement addEquipement(@RequestBody Equipement equipement) {
        return equipementService.addEquipement(equipement);
    }

    @DeleteMapping("/delete-equipement/{equipement-id}")
    public void deleteEquipement(
            @PathVariable("equipement-id") Long equipementId) {
        equipementService.deleteEquipement(equipementId);
    }

    @PutMapping("/update-equipement")
    public Equipement updateEquipement(@RequestBody Equipement equipement) {
        return equipementService.updateEquipement(equipement);
    }
}