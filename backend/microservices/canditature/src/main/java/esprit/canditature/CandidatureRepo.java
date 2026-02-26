package esprit.canditature;

import esprit.canditature.entity.Candidature;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidatureRepo extends JpaRepository<Candidature, Integer> {

}
