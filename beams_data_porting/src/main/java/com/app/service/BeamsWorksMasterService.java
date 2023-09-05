package com.app.service;

import java.time.LocalDate;

import javax.transaction.Transactional;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.BeamsWorksMaster;
import com.app.repository.BeamsWorksMasterRepository;

@Transactional
@Service
public class BeamsWorksMasterService {

	@Autowired
	private BeamsWorksMasterRepository beamsWorksMasterRepository;

	public String InsertBeamsWorksMasterData(String data) {
		Document doc = Jsoup.parse(data);

		Element tableElement = doc.selectFirst("table");
		BeamsWorksMaster rowData;
		if (tableElement != null) {

			Elements rows = tableElement.select("tr");
			for (Element row : rows) {
				Elements cells = row.select("td");

				if (cells.size() >= 2) {
					rowData = new BeamsWorksMaster();
					rowData.setUniqueId(Integer.parseInt(cells.get(0).text()));
					rowData.setWorkId(Long.parseLong(cells.get(1).text()));
					rowData.setWorkNameEnglish((cells.get(2).text()));
					rowData.setWorksNameMarathi((cells.get(3).text()));
					rowData.setApprovalNo((cells.get(4).text()));
					rowData.setApprovalDate(LocalDate.parse(cells.get(5).text()));
					rowData.setEstimatedCost(Double.parseDouble(cells.get(6).text()));
					if (cells.get(7).text().equals("null")) {
						rowData.setRoadNo(null);
					} else {
						rowData.setRoadNo(Integer.parseInt(cells.get(7).text()));
					}
					if (cells.get(8).text().equals("null")) {
						rowData.setChainageFrom(null);
					} else {
						rowData.setChainageFrom(Double.parseDouble(cells.get(8).text()));
					}
					if (cells.get(9).text().equals("null")) {
						rowData.setChainageTo(null);
					} else {
						rowData.setChainageTo(Double.parseDouble(cells.get(9).text()));
					}
					if (cells.get(10).text().equals("null")) {
						rowData.setTaluka(null);
					} else {
						rowData.setTaluka(Integer.parseInt(cells.get(10).text()));
					}
					if (cells.get(11).text().equals("null")) {
						rowData.setConstitutionId(null);
					} else {
						rowData.setConstitutionId(Integer.parseInt(cells.get(11).text()));
					}
					if (cells.get(12).text().equals("null")) {
						rowData.setControllingOfficerCode(null);
					} else {
						rowData.setControllingOfficerCode(cells.get(12).text());
					}
					if (cells.get(13).text().equals("null")) {
						rowData.setWorkInd(null);
					} else {
						rowData.setWorkInd(cells.get(13).text());
					}
					if (cells.get(14).text().equals("null")) {
						rowData.setWorkType(null);
					} else {
						rowData.setWorkType(cells.get(14).text());
					}
					if (cells.get(15).text().equals("null")) {
						rowData.setWorkCategory(null);
					} else {
						rowData.setWorkCategory(cells.get(15).text());
					}
					if (cells.get(16).text().equals("null")) {
						rowData.setUserDept(null);
					} else {
						rowData.setUserDept(cells.get(16).text());
					}
					if (cells.get(17).text().equals("0.000") || cells.get(17).text().equals("null")) {
						rowData.setCarpetArea(null);
					} else {
						rowData.setCarpetArea(Double.parseDouble(cells.get(17).text()));
					}
					if(cells.get(18).text().equals("null")) {
						rowData.setRemark(null);
					}
					else {
					rowData.setRemark(cells.get(18).text());
					}
					if (cells.get(19).text().equals("null")) {
						rowData.setBookValue(null);
					} else {
						rowData.setBookValue(Integer.parseInt(cells.get(19).text()));
					}
					if (cells.get(20).text().equals("null")) {
						rowData.setConstructedYear(null);
					} else {
						rowData.setConstructedYear(Integer.parseInt(cells.get(20).text()));
					}
					if (cells.get(21).text().equals("null")) {
						rowData.setBudgetYear(null);
					} else {
						rowData.setBudgetYear(Integer.parseInt(cells.get(21).text()));
					}
					if (cells.get(22).text().equals("null")) {
						rowData.setBudgetMonth(null);
					} else {
						rowData.setBudgetMonth(Integer.parseInt(cells.get(22).text()));
					}
					if (cells.get(23).text().equals("null")) {
						rowData.setBudgetBookPageNo(null);
					} else {
						rowData.setBudgetBookPageNo(Integer.parseInt(cells.get(23).text()));
					}
					if (cells.get(24).text().equals("null")) {
						rowData.setBudgetBookSerialNo(null);
					} else {
						rowData.setBudgetBookSerialNo(Integer.parseInt(cells.get(24).text()));
					}
					if (cells.get(25).text().equals("null")) {
						rowData.setChiefEnginner(null);
					} else {
						rowData.setChiefEnginner(cells.get(25).text());
					}
					if (cells.get(26).text().equals("null")) {
						rowData.setSubDivision(null);
					} else {
						rowData.setSubDivision(Long.parseLong(cells.get(26).text()));
					}
					if (cells.get(27).text().equals("null")) {
						rowData.setTechnicalSactionDate(null);
					} else {
						rowData.setTechnicalSactionDate(LocalDate.parse(cells.get(27).text()));
					}
					if (cells.get(28).text().equals("null")) {
						rowData.setTechnicalSactionAmt(null);
					} else {
						rowData.setTechnicalSactionAmt(Double.parseDouble(cells.get(28).text()));
					}
					if (cells.get(29).text().equals("null") || cells.get(29).text().equals("0.00")) {
						rowData.setBitumenQuntity(null);
					} else {
						rowData.setBitumenQuntity(Double.parseDouble(cells.get(29).text()));
					}
					if (cells.get(30).text().equals("null")) {
						rowData.setTenderAmt(null);
					} else {
						rowData.setTenderAmt(Double.parseDouble(cells.get(30).text()));
					}
					if (cells.get(31).text().equals("null")) {
						rowData.setAgreementCost(null);
					} else {
						rowData.setAgreementCost(Double.parseDouble(cells.get(31).text()));
					}
					if (cells.get(32).text().equals("null")) {
						rowData.setPercentage(null);
					} else {
						rowData.setPercentage(Double.parseDouble(cells.get(32).text()));
					}
					if (cells.get(33).text().equals("null")) {
						rowData.setWorkOrderDate(null);
					} else {
						rowData.setWorkOrderDate(LocalDate.parse(cells.get(33).text()));
					}
					if (cells.get(34).text().equals("null")) {
						rowData.setTimeLimit(null);
					} else {
						rowData.setTimeLimit(Integer.parseInt(cells.get(34).text()));
					}
					if (cells.get(35).text().equals("null")) {
						rowData.setScope(null);
					} else {
						rowData.setScope(cells.get(35).text());
					}
					if (cells.get(36).text().equals("null")) {
						rowData.setAdminDept(null);
					} else {
						rowData.setAdminDept(cells.get(36).text());
					}
					if (cells.get(37).text().equals("0.000")) {
						rowData.setAdditionalEstimatedCost(null);
					} else {
						rowData.setAdditionalEstimatedCost(Integer.parseInt(cells.get(37).text()));
					}
					if (cells.get(38).text().equals("null")) {
						rowData.setAddiEstimCostApprDt(null);
					} else {
						rowData.setAddiEstimCostApprDt(LocalDate.parse(cells.get(38).text()));
					}
					if (cells.get(39).text().equals("null")) {
						rowData.setWorkEntryDate(null);
					} else {
						rowData.setWorkEntryDate(LocalDate.parse(cells.get(39).text()));
					}
					if (cells.get(40).text().equals("null")) {
						rowData.setAdminUpdateDate(null);
					} else {
						rowData.setAdminUpdateDate(LocalDate.parse(cells.get(40).text()));
					}

					beamsWorksMasterRepository.save(rowData);

				}
			}

		}
		return "Data is Inserted into workMaster";
	}
}
