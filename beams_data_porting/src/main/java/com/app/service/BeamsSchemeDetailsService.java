package com.app.service;

import java.math.BigInteger;

import javax.transaction.Transactional;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.BeamsSchemeDetails;
import com.app.model.BeamsWorksMaster;
import com.app.repository.BeamsSchemeDetailsRepository;

@Transactional
@Service
public class BeamsSchemeDetailsService {

	@Autowired 
	private BeamsSchemeDetailsRepository beamsSchemeDetailsRepository;
	
	public String InsertSchemeData(String data) {
		Document doc = Jsoup.parse(data);

		Element tableElement = doc.selectFirst("table");
		BeamsSchemeDetails rowData;
		if (tableElement != null) {

			Elements rows = tableElement.select("tr");
			for (Element row : rows) {
				Elements cells = row.select("td");

				if (cells.size() >= 2) {
					
					rowData =new BeamsSchemeDetails();
					rowData.setWorkUniqueId(Integer.parseInt(cells.get(0).text()));
					rowData.setWorkId(new BigInteger(cells.get(1).text()));
					rowData.setDemandNo(cells.get(2).text());
					rowData.setSchemeCd(Integer.parseInt(cells.get(3).text()));
					rowData.setDhCd(Integer.parseInt(cells.get(4).text()));
					
					beamsSchemeDetailsRepository.save(rowData);
				}
		
	
			}}
	return "Scheme Data Inserted";
	}
}
