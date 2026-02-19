package esprit.canditature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
