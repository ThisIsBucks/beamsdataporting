package com.app.service;

import java.math.BigInteger;

import javax.transaction.Transactional;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.app.model.BeamsRoadCategoryDetails;
import com.app.repository.BeamsRoadCategoryDetailsRpository;

@Transactional
@Service
public class BeamsRoadCategoryDetailsService {

	@Autowired
	private BeamsRoadCategoryDetailsRpository beamsRoadCategoryDetailsRpository;
	
	public String InsertRoadCategoryDetailsData(String data) {
		
		
		Document doc = Jsoup.parse(data);

		Element tableElement = doc.selectFirst("table");
		BeamsRoadCategoryDetails rowData;
		
		if (tableElement != null) {

			Elements rows = tableElement.select("tr");
			for (Element row : rows) {
				Elements cells = row.select("td");

				if (cells.size() >= 2) {
					rowData= new BeamsRoadCategoryDetails();
					
					rowData.setUniqeId(Integer.parseInt(cells.get(0).text()));
					rowData.setWorkUniqueId(Integer.parseInt(cells.get(1).text()));
					rowData.setWorkId(new BigInteger(cells.get(2).text()));
					rowData.setRoadCategory(cells.get(3).text());
					rowData.setRoadNo(Integer.parseInt(cells.get(4).text()));
					rowData.setChainageFrom(Double.parseDouble(cells.get(6).text()));
					rowData.setChainageTo(Double.parseDouble(cells.get(7).text()));
					
					beamsRoadCategoryDetailsRpository.save(rowData);
					
				}
			}}
		return "Road Category Data Inserted";
	}
}
