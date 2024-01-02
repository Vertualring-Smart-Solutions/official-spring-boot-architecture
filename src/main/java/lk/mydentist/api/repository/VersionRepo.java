package lk.mydentist.api.repository;

import lk.mydentist.api.model.Version;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VersionRepo extends JpaRepository<Version,Long> {
    Version getTopByOrderByIdDesc();
}
