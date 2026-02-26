package esprit.candidat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidatService {
    @Autowired
    private CandidatRepository candidatRepository;
    // READ ALL
    public List<Candidat> findAll() {
        return candidatRepository.findAll();
    }

    // READ BY ID
    public Candidat findById(int id) {
        return candidatRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Candidat not found with id: " + id));
    }

    // CREATE
    public Candidat save(Candidat candidat) {
        return candidatRepository.save(candidat);
    }

    // UPDATE
    public Candidat update(int id, Candidat candidat) {
        Candidat existing = findById(id);
        existing.setFirstName(candidat.getFirstName());
        existing.setLastName(candidat.getLastName());
        existing.setEmail(candidat.getEmail());
        return candidatRepository.save(existing);
    }

    // DELETE
    public void delete(int id) {
        candidatRepository.deleteById(id);
    }

}
