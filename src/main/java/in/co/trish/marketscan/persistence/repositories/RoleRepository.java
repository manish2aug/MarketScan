package in.co.trish.marketscan.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import in.co.trish.marketscan.persistence.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {
	
	Role findByCode(String code);
}
