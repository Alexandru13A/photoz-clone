package ro.alexandru.photoz.clone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.alexandru.photoz.clone.model.Photo;

public interface PhotozRepository extends JpaRepository<Photo , Integer> {
}
