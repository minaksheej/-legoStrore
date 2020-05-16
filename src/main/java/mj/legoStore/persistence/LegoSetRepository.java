package mj.legoStore.persistence;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import mj.legoStore.model.LegoSet;

@Repository
public interface LegoSetRepository extends MongoRepository<LegoSet, String>{

}
