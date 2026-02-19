package esprit.canditature;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CandidatureService {
    @Autowired
    private JobClient jobServiceClient;

    public List<Job> getJobs() {
        return jobServiceClient.getAll();
    }


    public Job getJobById(int id) {
        return jobServiceClient.getById(id);
    }
    // Le reste de la logique du service Candidature

}
