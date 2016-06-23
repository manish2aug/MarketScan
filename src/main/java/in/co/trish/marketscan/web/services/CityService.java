package in.co.trish.marketscan.web.services;

import in.co.trish.marketscan.persistence.entities.City;

public interface CityService {

    City findByCode(String code);

}