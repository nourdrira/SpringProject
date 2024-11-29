package tn.esprit.springproject.services;

import tn.esprit.springproject.entities.Chambre;
import tn.esprit.springproject.entities.Reservation;

import java.time.LocalDate;
import java.util.List;

public interface IReservationService {
    public Reservation addReservation(Reservation reservation);
    public Reservation updateReservation(Reservation reservation);
    public List<Reservation> retrieveAllReservation();
    public Reservation retrieveReservationById(String idR);
    public void deleteReservationById(String idR);
    public long getReservationParAnneeUniversitaire(LocalDate date1,LocalDate date2);
}
