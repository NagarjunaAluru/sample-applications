package com.mkyong;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

import com.mkyong.model.GLX_NDCSPL_CSV;
import com.opencsv.CSVReader;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;

//It will call First to read whole CSV file and pass it to Writer
public class FileReaderCSV implements ItemReader<GLX_NDCSPL_CSV>
{
	private int nextNSDEIndex;
	List<GLX_NDCSPL_CSV> ndcsList =null;
	List<GLX_NDCSPL_CSV> ndcsNewList =new ArrayList<GLX_NDCSPL_CSV>();

	public FileReaderCSV()
	{
		initialize();
	}
	
	public void initialize()
	{
		try{
			URLConnection urlConnection = new URL(	"http://www.fda.gov/downloads/ForIndustry/DataStandards/StructuredProductLabeling/UCM363569.csv").openConnection();
			// To ignore Processing of 1st row
			CSVReader reader = new CSVReader(new BufferedReader(new InputStreamReader(urlConnection.getInputStream())), ',', '\"', 1);
			
			ColumnPositionMappingStrategy<GLX_NDCSPL_CSV> mappingStrategy  = new ColumnPositionMappingStrategy<GLX_NDCSPL_CSV>();
			mappingStrategy.setType(GLX_NDCSPL_CSV.class);

			// the fields to bind do in your JavaBean
			String[] columns = new String[] {"itemCode ","ndc11","proprietaryName","dosageForm  ","marketingCategory","appNumOrCitation","productType","marketStartDate","  marketEndDate"," billingUnit"};
			mappingStrategy.setColumnMapping(columns);

			CsvToBean<GLX_NDCSPL_CSV> csv = new CsvToBean<GLX_NDCSPL_CSV>();
			ndcsList = csv.parse(mappingStrategy, reader);
			
			//List<GLX_NDCSPL_CSV> ndcsNewList = ndcsList.subList(0, 25);
			
			}
			catch(Exception e)
			{
				System.out.println("PPK EXCEPTION :: ");
				e.printStackTrace();
			}
		nextNSDEIndex=0;
	}
	
	
	@Override
	public GLX_NDCSPL_CSV read() throws Exception, UnexpectedInputException,
			ParseException, NonTransientResourceException {
		GLX_NDCSPL_CSV nextNSDE = null;
		 
	       if (nextNSDEIndex < ndcsList.size()) {
	        	nextNSDE = ndcsList.get(nextNSDEIndex);
	        	nextNSDEIndex++;
	        }
	       
	       if(nextNSDEIndex>25)
	    	   return null;
		
		/*if (nextNSDEIndex < ndcsNewList.size()) {
        	nextNSDE = ndcsNewList.get(nextNSDEIndex);
        	nextNSDEIndex++;
        }*/
		
		
		return nextNSDE;
	}

	
	

}
