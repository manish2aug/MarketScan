package in.co.trish.marketscan.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import in.co.trish.marketscan.persistence.entities.Review;

public interface ReviewRepository extends JpaRepository<Review, Integer> {
}
