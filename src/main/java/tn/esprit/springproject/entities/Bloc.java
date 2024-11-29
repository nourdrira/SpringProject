package tn.esprit.springproject.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idB ;
    private String nomB;
    private Long capaciteB ;
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private Foyer foyer;
    @OneToMany(mappedBy = "bloc", fetch = FetchType.LAZY)
    private Set<Chambre> chambres;

}
