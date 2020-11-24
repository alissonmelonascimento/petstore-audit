package org.acme.petstore.audit.repository;

import java.sql.SQLException;

import org.acme.petstore.audit.model.Audit;

public interface AuditRepository {
    
    void save(Audit audit) throws SQLException;

}
