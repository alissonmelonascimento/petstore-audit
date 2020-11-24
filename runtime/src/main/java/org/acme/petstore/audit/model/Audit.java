package org.acme.petstore.audit.model;

import java.util.Date;

public class Audit {
    
    private Long id;
    private String service;
    private Date insertAt;
    private boolean success;

	public Long getId() {
		return id;
    }
    
	public void setId(Long id) {
		this.id = id;
    }
    
	public String getService() {
		return service;
    }
    
	public void setService(String service) {
		this.service = service;
    }
    
	public Date getInsertAt() {
		return insertAt;
    }
    
	public void setInsertAt(Date insertAt) {
        this.insertAt = insertAt;
        
    }

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}
    
}
