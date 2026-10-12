package tn.esprit.autoloc.service.interfaces;

import tn.esprit.autoloc.domain.Maintenance;

import java.util.Set;

public interface IMaintenanceService {

    Set<Maintenance> retrieveAllMaintenances();

    Maintenance retrieveMaintenance(Long maintenanceId);

    Maintenance addMaintenance(Maintenance maintenance);

    void deleteMaintenance(Long maintenanceId);

    Maintenance updateMaintenance(Maintenance maintenance);
}