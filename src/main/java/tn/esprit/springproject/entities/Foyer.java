package tn.esprit.springproject.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import tn.esprit.springproject.entities.Bloc;
import tn.esprit.springproject.entities.Universite;

import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Foyer implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long idF;

  private String nomF;
  private Long capaciteF;

  @OneToOne(mappedBy = "foyer")
  @JsonIgnore // pour éviter la boucle infinie lors de la sérialisation
  private Universite universite;

  @OneToMany(mappedBy = "foyer", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private Set<Bloc> blocs;
}
