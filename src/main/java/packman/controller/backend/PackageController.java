/**
 *
 */
package packman.controller.backend;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import packman.dtos.backend.ResponsePackageList;
import packman.entity.gs.GuardSocialFBObject;
import packman.service.backend.PackageRepository;
import packman.service.gs.GuardSocialRepository;

/**
 * @author Master
 *
 */
@RestController
public class PackageController {

	@Resource
	private PackageRepository packageRepository;
	
	@Resource
	private GuardSocialRepository guardSocialRepository;
//
//	@RequestMapping(value = "/uiserver/packagemanager/getpackageswithdetails", method = RequestMethod.GET)
//	public List<PackageObj> getPackagesList() {
//		List<PackageObj> listItems = new ArrayList<PackageObj>();
//		listItems.addAll(packageRepository.getPackages());
//		return listItems;
//	}
	
	@RequestMapping(value = "/getFacebook", method = RequestMethod.GET)
	public List<GuardSocialFBObject> getGuardSocialFacebookItems() {
		List<GuardSocialFBObject> listItems = new ArrayList<GuardSocialFBObject>();
		listItems.addAll(guardSocialRepository.getFacebookItems());
		return listItems;
	}

	@RequestMapping(value = "/getpackageswithdetails", method = RequestMethod.GET)
	public ResponsePackageList getPackages() {
		return new ResponsePackageList(packageRepository.getPackages());
	}
}
