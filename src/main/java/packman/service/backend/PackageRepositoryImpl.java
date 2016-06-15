package packman.service.backend;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import packman.entity.backend.PackageObj;

@Service
public class PackageRepositoryImpl {

	@Resource
	private MongoOperations mongoOperations;

	public List<PackageObj> getPackages() {
		List<PackageObj> packages = mongoOperations.find(new Query(Criteria.where("_id").exists(true)),
				PackageObj.class, "package");
		return packages;

	}
}
