package tn.esprit.springproject.services;

import org.springframework.scheduling.annotation.Scheduled;
import tn.esprit.springproject.entities.Bloc;
import tn.esprit.springproject.entities.Etudiant;

import java.util.List;

public interface IBlocService {
    public Bloc addBloc(Bloc bloc);


  default List<Bloc> retrieveBlocs() {
    return null;
  }

  public Bloc updateBloc(Bloc bloc);
    public Bloc retrieveBlocById(Long idB);
    public void deleteBlocById(Long idB);
    public Bloc affecterChambresABloc(List<Long> numC, Long idB) ;
    public Bloc affecterBlocAFoyer (Long idB, Long idF) ;
    public List<Bloc> getBlocByCapacite(Long capacite);

   public  List<Bloc> retrieveAllBloc();
}
