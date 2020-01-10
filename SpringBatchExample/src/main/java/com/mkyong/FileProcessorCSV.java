package com.mkyong;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.batch.item.ItemProcessor;

import com.mkyong.model.GLX_NDCSPL_CSV;
import com.ppk.db.DBConnection;

// It will call before writer to do some business logic on item/job
public class FileProcessorCSV implements ItemProcessor<GLX_NDCSPL_CSV, GLX_NDCSPL_CSV>
{
	public FileProcessorCSV()
	{
		System.out.println("Processor calling");
	}
	
	@Override
	public GLX_NDCSPL_CSV process(GLX_NDCSPL_CSV glsNDCS) throws Exception 
	{
		/*if(glsNDCS.getBILLINGUNIT().trim().isEmpty())
		{
			return null;
		}*/
		
		return glsNDCS;
	}
	
	

}
