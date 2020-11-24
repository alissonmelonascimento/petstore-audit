package org.acme.petstore.audit.repository.impl;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.concurrent.ThreadLocalRandom;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.acme.petstore.audit.model.Audit;
import org.acme.petstore.audit.repository.AuditRepository;

import io.agroal.api.AgroalDataSource;

@ApplicationScoped
public class AuditRepositoryImpl implements AuditRepository {

	@Inject
	AgroalDataSource datasource;
	
	public void save(Audit audit) throws SQLException{
		
		if(datasource == null) {
			throw new SQLException("DataSource not found");
		}
		
		int id = ThreadLocalRandom.current().nextInt(1, 1000);
        PreparedStatement stm = null;
        
        try{
            stm = datasource.getConnection().prepareStatement(
                    "insert into public.audit(id, service, insert_at, success) values(?,?,?,?) ");
            stm.setLong(1, id);
            stm.setString(2, audit.getService());
            stm.setDate(3, new Date(Calendar.getInstance().getTime().getTime()) );
            stm.setBoolean(4, audit.isSuccess());
            stm.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if(stm != null){
                stm.close();
            }
        }
	}
    
}
