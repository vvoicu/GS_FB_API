package packman.dtos.backend;

import java.io.Serializable;
import java.util.List;

import packman.entity.backend.PackageObj;

public class ResponsePackageList implements Serializable {

	private static final long serialVersionUID = 7581223167181512307L;
	private String status = "Ok";
	private String message;
	private List<PackageObj> modelList;
	
	public ResponsePackageList(List<PackageObj> model) {
		this.modelList = model;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<PackageObj> getModelList() {
		return modelList;
	}

	public void setModelList(List<PackageObj> modelList) {
		this.modelList = modelList;
	}

}
