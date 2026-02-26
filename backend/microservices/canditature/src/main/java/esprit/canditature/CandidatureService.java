package esprit.canditature;



import esprit.canditature.dto.Candidat;
import esprit.canditature.dto.Job;

import esprit.canditature.entity.Candidature;
import esprit.canditature.feignClient.CandidatClient;
import esprit.canditature.feignClient.JobClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CandidatureService {
    @Autowired
    private JobClient jobServiceClient;
    @Autowired
    private CandidatClient candidatServiceClient;
    @Autowired
    private CandidatureRepo candidatureRepo;

    public List<Job> getJobs() {
        return jobServiceClient.getAll();
    }

    public Job getJobById(int id) {
        return jobServiceClient.getById(id);
    }

    public Candidat getCandidatById(int id) {
        return candidatServiceClient.getCandidat(id);
    }
   public Candidature saveCandidature(Candidature candidature) {
        candidatServiceClient.getCandidat(candidature.getCandId());
        jobServiceClient.getById(candidature.getJobId());
        return candidatureRepo.save(candidature);
   }

}
