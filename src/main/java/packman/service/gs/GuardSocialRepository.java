package packman.service.gs;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

import packman.entity.gs.GuardSocialFBObject;

public interface GuardSocialRepository extends MongoRepository<GuardSocialFBObject, String>,GuardSocialRepositoryCustom {

	GuardSocialFBObject findById(@Param("id") String id);

}
