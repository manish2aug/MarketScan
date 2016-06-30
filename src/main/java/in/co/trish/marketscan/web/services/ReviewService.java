package in.co.trish.marketscan.web.services;

import java.util.List;

import in.co.trish.marketscan.persistence.entities.Review;

public interface ReviewService {

	Review find(int reviewId);

	Review add(Review review);

	List<Review> findAll();
}