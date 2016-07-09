package in.co.trish.marketscan.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import in.co.trish.marketscan.persistence.entities.Unit;

public interface UnitRepository extends JpaRepository<Unit, Integer> {
	Unit findByCode(String code);
}
