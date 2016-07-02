package in.co.trish.marketscan.web.services;

import in.co.trish.marketscan.persistence.entities.Role;

public interface RoleService {
	
	Role findByCode(String code);
	
}