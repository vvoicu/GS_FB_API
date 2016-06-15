package packman.service.backend;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

import packman.entity.backend.PackageObj;

public interface PackageRepository extends MongoRepository<PackageObj, String>,PackageRepositoryCustom {

	PackageObj findByLastModifiedTime(@Param("lastModifiedTime") String lastModifiedTime);

}
