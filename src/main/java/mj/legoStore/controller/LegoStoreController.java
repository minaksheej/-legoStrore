package mj.legoStore.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mj.legoStore.model.LegoSet;
import mj.legoStore.persistence.LegoSetRepository;

@RestController
@RequestMapping("/legostores/api")
public class LegoStoreController {
	
	@Autowired
	private MongoTemplate mongoTemplate;
	
	@Autowired
	private LegoSetRepository  legoSetRepo;
	
	@PostMapping()
	public ResponseEntity<Void> insert(@RequestBody LegoSet legoSets) {
		legoSetRepo.insert(legoSets);
		return  ResponseEntity.noContent().build();
	}
	
	@PutMapping()
	public ResponseEntity<Void> update(@RequestBody LegoSet legoSets) {
		legoSetRepo.save(legoSets);
		return  ResponseEntity.noContent().build();
	}
	
	@GetMapping("/all")
	public ResponseEntity<Collection<LegoSet>> getAll(){
		//Collection<LegoSet>  coll=mongoTemplate.findAll(LegoSet.class);
		Collection<LegoSet>  coll=legoSetRepo.findAll();
		return new ResponseEntity<>(coll,HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable String id){
		//mongoTemplate.remove(new Query(Criteria.where("id").is(id)),LegoSet.class);
		legoSetRepo.deleteById(id);
		return  ResponseEntity.noContent().build();
	}

}
