package com.mkyong;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.springframework.batch.core.annotation.BeforeJob;
import org.springframework.batch.item.ItemWriter;

import com.mkyong.model.GLX_NDCSPL_CSV;
import com.ppk.db.DBConnection;

//It will call after 'Processor' to write item to DB
public class FileWriterCSV implements ItemWriter<GLX_NDCSPL_CSV>
{
	Connection con = null;
	String insertTableSQL = "INSERT INTO raw_report_temp VALUES (?,?,?,?,?,?,?,?,?,?)";
	Statement stmt = null;
	PreparedStatement preparedStatement=null;
	
	public FileWriterCSV()
	{
		// We can create Temporary table also here
		initialize();
	}
	
	public void initialize()
	{
		con = DBConnection.getDBConnection();
		try {
			preparedStatement = con.prepareStatement(insertTableSQL);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("PPK1 :: WRITER Initialize");
	}
	
	@Override
	public void write(List<? extends GLX_NDCSPL_CSV> ndcsList) throws Exception
	{
		System.out.println("PPK1 :: WRITER Processing");
		int i =0;
		if(!ndcsList.isEmpty()){
			
			for (GLX_NDCSPL_CSV glx_NDCSPL_CSV : ndcsList) {
				
				//stmt.executeUpdate(insertTableSQL);
				
				preparedStatement.setString(1, glx_NDCSPL_CSV.getITEMCODE());
				preparedStatement.setString(2, glx_NDCSPL_CSV.getNDC11());
				preparedStatement.setString(3, glx_NDCSPL_CSV.getPROPRIETARYNAME());
				preparedStatement.setString(4, glx_NDCSPL_CSV.getDOSAGEFORM());
				preparedStatement.setString(5, glx_NDCSPL_CSV.getMARKETINGCATEGORY());
				preparedStatement.setString(6, glx_NDCSPL_CSV.getAPPNUMORCITATION());
				preparedStatement.setString(7, glx_NDCSPL_CSV.getPRODUCTTYPE());
				preparedStatement.setString(8, glx_NDCSPL_CSV.getMARKETSTARTDATE());
				preparedStatement.setString(9, glx_NDCSPL_CSV.getMARKETENDDATE());
				preparedStatement.setString(10, glx_NDCSPL_CSV.getBILLINGUNIT());
				// execute insert SQL stetement
				if(i<10)
				{
				preparedStatement .executeUpdate();
				}
				i++;
				
			}
			
			
		}
		
		
	}
	
	
	
	
	
	

}
