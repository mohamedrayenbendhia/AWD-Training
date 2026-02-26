package esprit.canditature;

import esprit.canditature.dto.Candidat;
import esprit.canditature.dto.Job;

import esprit.canditature.entity.Candidature;
import esprit.canditature.entity.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mic3/candidature")
public class CandidatureRestApi {

    @GetMapping ("/hello")
    public String sayHello() {

        return "Hello Im microservice 3!";
    }
    @Autowired
    private CandidatureService candidatureService;


    @RequestMapping("/jobs")
    public List<Job> getAllJobs() {
        return candidatureService.getJobs();
    }

    @RequestMapping("jobs/{id}")
    public Job getJobById(@PathVariable int id) {
        return candidatureService.getJobById(id);
    }
    // Le reste des ressources liées à l’API Candidature
    @GetMapping("/candidat/{id}")
    public Candidat candidat(@PathVariable int id){
        return candidatureService.getCandidatById(id);
    }


@PostMapping
public Candidature createCandidature(@RequestBody Candidature candidature) {
        return candidatureService.saveCandidature(candidature);
}

}
