package in.co.trish.marketscan.web.services.implementations;

import in.co.trish.marketscan.persistence.entities.Item;
import in.co.trish.marketscan.persistence.repositories.ItemRepository;
import in.co.trish.marketscan.web.services.ItemService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("itemService")
@Transactional
public class ItemServiceImpl implements ItemService {

	// for saving item using auto generated no, eg. counter.incrementAndGet()
	// private static final AtomicLong counter = new AtomicLong();

	@Autowired
	private ItemRepository itemRepository;

	@Override
	public List<Item> findAll() {
		return itemRepository.findAll();
	}

	@Override
	public List<Item> findAll(String searchString) {
		return itemRepository.findByNameEnglishContaining(searchString);
	}
	
}
