package bit.turing.decide.models;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="decision")
public class Decision {
    @Id
    private Long id;

    @Column(length = 512)
    private String token;

    @Column(length = 128)
    private String title;

    @Column(length = 256, nullable = true)
    private String description;

    @Column(name = "start_date")
    private LocalDateTime startDate;

    @Column(name = "end_date")
    private LocalDateTime endDate;
}
