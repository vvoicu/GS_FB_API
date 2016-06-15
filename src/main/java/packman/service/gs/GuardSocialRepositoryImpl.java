package packman.service.gs;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import packman.entity.gs.GuardSocialFBObject;

@Service
public class GuardSocialRepositoryImpl {
	
	@Resource
	private MongoOperations mongoOperations;

	public List<GuardSocialFBObject> getFacebookItems() {
		List<GuardSocialFBObject> packages = mongoOperations.find(new Query(Criteria.where("_id").exists(true)),
				GuardSocialFBObject.class, "guardSocial");
		return packages;

	}
}
