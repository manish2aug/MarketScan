package co.in.trish.marketscan.application;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import in.co.trish.marketscan.persistence.entities.ProductSubcategory;

public class ObjectMapperTest {
	
	@Test
	public void testProductjson() throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(new ProductSubcategory()));
	}
}
