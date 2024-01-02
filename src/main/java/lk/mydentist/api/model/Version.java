package lk.mydentist.api.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "product")
@Data
public class Version {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "version")
    private String version;

    @Column(name = "release_date")
    private Date releaseDate;
}
