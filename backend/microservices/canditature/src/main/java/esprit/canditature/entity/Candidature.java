package esprit.canditature.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
public class Candidature {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int candId;
    private int jobId;
    private String motivation;
    @Enumerated(EnumType.STRING)
    private Status status;

    public Candidature(int id, int candId, int jobId, String motivation, Status status) {
        this.id = id;
        this.candId = candId;
        this.jobId = jobId;
        this.motivation = motivation;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCandId() {
        return candId;
    }

    public void setCandId(int candId) {
        this.candId = candId;
    }

    public int getJobId() {
        return jobId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    public String getMotivation() {
        return motivation;
    }

    public void setMotivation(String motivation) {
        this.motivation = motivation;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
