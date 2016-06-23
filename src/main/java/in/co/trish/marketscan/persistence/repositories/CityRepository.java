package in.co.trish.marketscan.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import in.co.trish.marketscan.persistence.entities.City;

public interface CityRepository extends JpaRepository<City, Integer> {
	City findByCode(String code);
}
