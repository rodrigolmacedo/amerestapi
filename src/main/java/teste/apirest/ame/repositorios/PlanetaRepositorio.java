package teste.apirest.ame.repositorios;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query; 




import teste.apirest.ame.modelos.Planeta;

public interface PlanetaRepositorio extends MongoRepository <Planeta,String> {
	Planeta findBy_id(ObjectId _id);
	
	List<Planeta> findByNomeLike(String nome);

}
