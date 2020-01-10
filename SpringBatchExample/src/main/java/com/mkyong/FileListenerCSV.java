package com.mkyong;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;

import com.ppk.db.DBConnection;

public class FileListenerCSV implements JobExecutionListener
{
	String tempTable="CREATE temporary TABLE IF NOT EXISTS raw_report_temp (ITEMCODE varchar(50) DEFAULT NULL,  NDC11 varchar(45) DEFAULT NULL,"+
			" PROPRIETARYNAME varchar(1000) DEFAULT NULL,"+
			" DOSAGEFORM varchar(1000) DEFAULT NULL,"+
			" MARKETINGCATEGORY varchar(450) DEFAULT NULL,"+
			" APPNUMORCITATION varchar(1000) DEFAULT NULL,"+
			" PRODUCTTYPE varchar(1000) DEFAULT NULL,"+
			" MARKETSTARTDATE varchar(45) DEFAULT NULL,"+
			" MARKETENDDATE varchar(45) DEFAULT NULL,"+
			" BILLINGUNIT varchar(100) DEFAULT NULL)";
	//String dropTempTable = "drop temporary table if exists raw_report_tem";
	String procCall = "call report_proc2()";
	
	Connection con = null;
	Statement stmt = null;
	
	public FileListenerCSV()
	{
		System.out.println("PPK :: Listner Initialize ------------------------");
		con = DBConnection.getDBConnection();
		
	}
	
	
	@Override
	public void beforeJob(JobExecution arg0) {
		System.out.println("PPK :: Listner Started ------------------------");
		
        try {
			stmt = con.createStatement();
			//stmt.execute(dropTempTable);
			stmt.execute(tempTable);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void afterJob(JobExecution arg0) {
		System.out.println("PPK :: Listner Ended -----------------------");
		
		try {
			stmt = con.createStatement();
			stmt.execute(procCall);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	




}
