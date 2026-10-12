package tn.esprit.autoloc.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Maintenance;
import tn.esprit.autoloc.service.interfaces.IMaintenanceService;

import java.util.Set;

@RestController
@AllArgsConstructor
@RequestMapping("/maintenance")
public class MaintenanceRestController {

    private IMaintenanceService maintenanceService;

    @GetMapping("/retrieve-all-maintenances")
    public Set<Maintenance> getMaintenances() {
        return maintenanceService.retrieveAllMaintenances();
    }

    @GetMapping("/retrieve-maintenance/{maintenance-id}")
    public Maintenance retrieveMaintenance(
            @PathVariable("maintenance-id") Long maintenanceId) {
        return maintenanceService.retrieveMaintenance(maintenanceId);
    }

    @PostMapping("/add-maintenance")
    public Maintenance addMaintenance(@RequestBody Maintenance maintenance) {
        return maintenanceService.addMaintenance(maintenance);
    }

    @DeleteMapping("/delete-maintenance/{maintenance-id}")
    public void deleteMaintenance(
            @PathVariable("maintenance-id") Long maintenanceId) {
        maintenanceService.deleteMaintenance(maintenanceId);
    }

    @PutMapping("/update-maintenance")
    public Maintenance updateMaintenance(@RequestBody Maintenance maintenance) {
        return maintenanceService.updateMaintenance(maintenance);
    }
}