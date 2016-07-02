package in.co.trish.marketscan.web.services.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.co.trish.marketscan.persistence.entities.Role;
import in.co.trish.marketscan.persistence.repositories.RoleRepository;
import in.co.trish.marketscan.web.services.RoleService;

@Service("roleService")
@Transactional
public class RoleServiceImpl implements RoleService {
	
	@Autowired
	private RoleRepository repository;
	
	@Override
	public Role findByCode(String code) {
		return repository.findByCode(code);
	}
	
}
