package com.app.service;

import java.math.BigInteger;

import javax.transaction.Transactional;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.BeamsDdoDetails;

import com.app.repository.BeamsDdoDetailsRepository;

@Transactional
@Service
public class BeamsDdoDetailsService {

	@Autowired
	private BeamsDdoDetailsRepository  beamsDdoDetailsRepository;
	
	public String InsertDdoData(String data) {
		
		Document doc = Jsoup.parse(data);

		Element tableElement = doc.selectFirst("table");
		
		BeamsDdoDetails rowData;
		
		if (tableElement != null) {

			Elements rows = tableElement.select("tr");
			for (Element row : rows) {
				Elements cells = row.select("td");

				if (cells.size() >= 2) {
					
					rowData =new BeamsDdoDetails();
					rowData.setWorkUniqueId(Integer.parseInt(cells.get(0).text()));
					rowData.setWorkInd(cells.get(1).text());
					rowData.setWorkId(new BigInteger(cells.get(2).text()));
					rowData.setDdoCode(new BigInteger(cells.get(3).text()));
					
					
					
					beamsDdoDetailsRepository.save(rowData);
				}
		
	
			}}
	return "DDO Data Inserted";
		
	}
}
