package packman.entity.backend;

import java.util.List;

public class PackageDescriptorObj {
	
	private List<String> dependencies;
	private String version;
	private String category;
	private String description;
	private String updatedBy;
	private String updatedVersion;
	private String buildNumber;
	private String minVersion;
	private String maxVersion;
	private String enforcePackageVersioning;
	private String hidden;

	public List<String> getDependencies() {
		return dependencies;
	}

	public void setDependencies(List<String> dependencies) {
		this.dependencies = dependencies;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public String getUpdatedVersion() {
		return updatedVersion;
	}

	public void setUpdatedVersion(String updatedVersion) {
		this.updatedVersion = updatedVersion;
	}

	public String getBuildNumber() {
		return buildNumber;
	}

	public void setBuildNumber(String buildNumber) {
		this.buildNumber = buildNumber;
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

	public String getEnforcePackageVersioning() {
		return enforcePackageVersioning;
	}

	public void setEnforcePackageVersioning(String enforcePackageVersioning) {
		this.enforcePackageVersioning = enforcePackageVersioning;
	}

	public String getHidden() {
		return hidden;
	}

	public void setHidden(String hidden) {
		this.hidden = hidden;
	}

}
