package packman.service.backend;

import java.util.List;

import org.springframework.data.repository.NoRepositoryBean;

import packman.entity.backend.PackageObj;

@NoRepositoryBean
public interface PackageRepositoryCustom {

	List<PackageObj> getPackageByName(List<String> name);
	List<PackageObj> getPackages();
	
}
