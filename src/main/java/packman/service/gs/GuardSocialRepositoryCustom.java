package packman.service.gs;

import java.util.List;

import org.springframework.data.repository.NoRepositoryBean;

import packman.entity.backend.PackageObj;
import packman.entity.gs.GuardSocialFBObject;

@NoRepositoryBean
public interface GuardSocialRepositoryCustom {
	
	List<PackageObj> getPackageByName(List<String> name);
	List<GuardSocialFBObject> getFacebookItems();
}
