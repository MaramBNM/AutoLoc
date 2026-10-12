package tn.esprit.autoloc.service.interfaces;

import tn.esprit.autoloc.domain.Reservation;

import java.util.Set;

public interface IReservationService {

    Set<Reservation> retrieveAllReservations();

    Reservation retrieveReservation(Long reservationId);

    Reservation addReservation(Reservation reservation);

    void deleteReservation(Long reservationId);

    Reservation updateReservation(Reservation reservation);
}