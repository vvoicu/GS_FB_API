package packman.entity.backend;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "package")
public class PackageObj implements Serializable {

	private static final long serialVersionUID = 2747336477645896460L;

	@Id
	private String id;
	private String name;
	private String lastModifiedTime;
	private String operationErrorCode;
	private String readme;
	private PackageDescriptorObj packageDescriptor;
	private String undeployResources;
	private String factory;
	private String hidden;
	private String description;
	private String version;
	private String errorCode;
	private List<String> dependencies;
	private List<String> subSystems;
	private List<String> allResources;
	private String updatedVersion;
	private String category;
	private String updatedBy;
	private String minVersion;
	private String maxVersion;
	private String buildNumber;
	
	public PackageObj() {
		super();
	}

	public PackageObj(String name, String lastModifiedTime) {
		super();

		this.name = name;
		this.lastModifiedTime = lastModifiedTime;
	}

	public String getOperationErrorCode() {
		return operationErrorCode;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastModifiedTime() {
		return lastModifiedTime;
	}

	public void setLastModifiedTime(String lastModifiedTime) {
		this.lastModifiedTime = lastModifiedTime;
	}

	public void setOperationErrorCode(String operationErrorCode) {
		this.operationErrorCode = operationErrorCode;
	}

	public String getReadme() {
		return readme;
	}

	public void setReadme(String readme) {
		this.readme = readme;
	}

	public String getUndeployResources() {
		return undeployResources;
	}

	public void setUndeployResources(String undeployResources) {
		this.undeployResources = undeployResources;
	}

	public String getFactory() {
		return factory;
	}

	public void setFactory(String factory) {
		this.factory = factory;
	}

	public String getHidden() {
		return hidden;
	}

	public void setHidden(String hidden) {
		this.hidden = hidden;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public List<String> getDependencies() {
		return dependencies;
	}

	public void setDependencies(List<String> dependencies) {
		this.dependencies = dependencies;
	}

	public List<String> getSubSystems() {
		return subSystems;
	}

	public void setSubSystems(List<String> subSystems) {
		this.subSystems = subSystems;
	}

	public List<String> getAllResources() {
		return allResources;
	}

	public void setAllResources(List<String> allResources) {
		this.allResources = allResources;
	}

	public String getUpdatedVersion() {
		return updatedVersion;
	}

	public void setUpdatedVersion(String updatedVersion) {
		this.updatedVersion = updatedVersion;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public String getMinVersion() {
		return minVersion;
	}

	public void setMinVersion(String minVersion) {
		this.minVersion = minVersion;
	}

	public String getMaxVersion() {
		return maxVersion;
	}

	public void setMaxVersion(String maxVersion) {
		this.maxVersion = maxVersion;
	}

	public String getBuildNumber() {
		return buildNumber;
	}

	public void setBuildNumber(String buildNumber) {
		this.buildNumber = buildNumber;
	}

	public PackageDescriptorObj getPackageDescriptor() {
		return packageDescriptor;
	}

	public void setPackageDescriptor(PackageDescriptorObj packageDescriptorObj) {
		this.packageDescriptor = packageDescriptorObj;
	}


}
