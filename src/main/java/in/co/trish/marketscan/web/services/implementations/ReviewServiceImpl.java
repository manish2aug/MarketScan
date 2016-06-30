package in.co.trish.marketscan.web.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import in.co.trish.marketscan.persistence.entities.Review;
import in.co.trish.marketscan.persistence.repositories.ReviewRepository;
import in.co.trish.marketscan.web.services.ReviewService;

public class ReviewServiceImpl implements ReviewService {

	@Autowired
	private ReviewRepository repository;

	@Override
	public Review find(int reviewId) {
		return repository.findOne(reviewId);
	}

	@Override
	public List<Review> findAll() {
		return repository.findAll();
	}
	
	@Override
	public Review add(Review review) {
		return repository.save(review);
	}

}
