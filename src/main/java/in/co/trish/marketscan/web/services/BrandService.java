package in.co.trish.marketscan.web.services;

import java.util.Collection;

import in.co.trish.marketscan.persistence.entities.Brand;

public interface BrandService {

    Brand findByCode(String code);
    Collection<Brand> findAll();

}