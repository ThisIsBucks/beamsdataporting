/*
 * package com.app.model;
 * 
 * import java.time.LocalDate;
 * 
 * import javax.persistence.Column; import javax.persistence.Entity; import
 * javax.persistence.Table;
 * 
 * @Entity
 * 
 * @Table(name="beams_imp_building_work_master_new") public class
 * BeamsImpBuildingMaster {
 * 
 * 
 * @Column(name = "uniqe_Id") private Integer uniqueId;
 * 
 * @Column(name = "workId") private Long workId;
 * 
 * @Column(name = "Work_Name_English",length = 666) private String
 * workNameEnglish;
 * 
 * @Column(name = "Work_Name_Marathi",length = 666) private String
 * worksNameMarathi;
 * 
 * @Column(name = "Approval_No") private String approvalNo;
 * 
 * @Column(name = "Approval_Date") private LocalDate approvalDate;
 * 
 * @Column(name = "Estimated_Cost") private Double estimatedCost;
 * 
 * @Column(name = "Road_No") private Integer roadNo;
 * 
 * @Column(name = "Chainage_From") private Double chainageFrom;
 * 
 * @Column(name = "Chainage_To") private Double chainageTo;
 * 
 * @Column(name = "Taluka") private Integer taluka;
 * 
 * @Column(name = "Constitution_ID") private Integer constitutionId;
 * 
 * @Column(name = "CONTROLLING_OFFICER_CODE") private String
 * controllingOfficerCode;
 * 
 * @Column(name = "WORK_IND") private String workInd;
 * 
 * @Column(name = "Work_Type") private String workType;
 * 
 * @Column(name = "Work_Category") private String workCategory;
 * 
 * @Column(name = "USER_DEPT") private String userDept;
 * 
 * @Column(name = "Carpet_Area") private Double carpetArea;
 * 
 * @Column(name = "Remark") private String remark;
 * 
 * @Column(name = "Book_Value") private Integer bookValue;
 * 
 * @Column(name = "Constructed_Year") private Integer constructedYear;
 * 
 * @Column(name = "Budget_Year") private Integer budgetYear;
 * 
 * @Column(name = "Budget_Month") private Integer budgetMonth;
 * 
 * @Column(name = "Budget_Book_Page_No") private Integer budgetBookPageNo;
 * 
 * @Column(name = "Budget_Book_Serial_No") private Integer budgetBookSerialNo;
 * 
 * @Column(name = "Chief_Engineer") private String chiefEnginner;
 * 
 * @Column(name = "Subdivision") private Long subDivision;
 * 
 * @Column(name = "Technical_Sanction_Date") private LocalDate
 * technicalSactionDate;
 * 
 * @Column(name = "TECHNICAL_SANCTION_AMT") private Double technicalSactionAmt;
 * 
 * @Column(name = "Bitumen_Quantity") private Double bitumenQuntity;
 * 
 * @Column(name = "TENDER_AMT") private Double tenderAmt;
 * 
 * @Column(name = "Agreement_Cost") private Double agreementCost;
 * 
 * @Column(name = "Percentage") private Double percentage;
 * 
 * @Column(name = "Work_Order_Date") private LocalDate workOrderDate;
 * 
 * @Column(name = "Time_Limit") private Integer timeLimit;
 * 
 * @Column(name = "Scope",length = 555) private String scope;
 * 
 * @Column(name = "ADMIN_DEPT") private String adminDept;
 * 
 * @Column(name = "Additional_Estimated_Cost") private Integer
 * additionalEstimatedCost;
 * 
 * @Column(name = "ADDI_ESTIM_COST_APPR_DT") private LocalDate
 * addiEstimCostApprDt;
 * 
 * @Column(name = "Work_Entry_Date") private LocalDate workEntryDate;
 * 
 * @Column(name = "Admin_Update_Date") private LocalDate adminUpdateDate;
 * 
 * @Column(name="ITERATIONID") private Integer iterationId;
 * 
 * @Column(name="INSERTDATETIME") private LocalDate insertDateTime;
 * 
 * public BeamsImpBuildingMaster() { super(); // TODO Auto-generated constructor
 * stub }
 * 
 * public BeamsImpBuildingMaster(Integer uniqueId, Long workId, String
 * workNameEnglish, String worksNameMarathi, String approvalNo, LocalDate
 * approvalDate, Double estimatedCost, Integer roadNo, Double chainageFrom,
 * Double chainageTo, Integer taluka, Integer constitutionId, String
 * controllingOfficerCode, String workInd, String workType, String workCategory,
 * String userDept, Double carpetArea, String remark, Integer bookValue, Integer
 * constructedYear, Integer budgetYear, Integer budgetMonth, Integer
 * budgetBookPageNo, Integer budgetBookSerialNo, String chiefEnginner, Long
 * subDivision, LocalDate technicalSactionDate, Double technicalSactionAmt,
 * Double bitumenQuntity, Double tenderAmt, Double agreementCost, Double
 * percentage, LocalDate workOrderDate, Integer timeLimit, String scope, String
 * adminDept, Integer additionalEstimatedCost, LocalDate addiEstimCostApprDt,
 * LocalDate workEntryDate, LocalDate adminUpdateDate, Integer iterationId,
 * LocalDate insertDateTime) { super(); this.uniqueId = uniqueId; this.workId =
 * workId; this.workNameEnglish = workNameEnglish; this.worksNameMarathi =
 * worksNameMarathi; this.approvalNo = approvalNo; this.approvalDate =
 * approvalDate; this.estimatedCost = estimatedCost; this.roadNo = roadNo;
 * this.chainageFrom = chainageFrom; this.chainageTo = chainageTo; this.taluka =
 * taluka; this.constitutionId = constitutionId; this.controllingOfficerCode =
 * controllingOfficerCode; this.workInd = workInd; this.workType = workType;
 * this.workCategory = workCategory; this.userDept = userDept; this.carpetArea =
 * carpetArea; this.remark = remark; this.bookValue = bookValue;
 * this.constructedYear = constructedYear; this.budgetYear = budgetYear;
 * this.budgetMonth = budgetMonth; this.budgetBookPageNo = budgetBookPageNo;
 * this.budgetBookSerialNo = budgetBookSerialNo; this.chiefEnginner =
 * chiefEnginner; this.subDivision = subDivision; this.technicalSactionDate =
 * technicalSactionDate; this.technicalSactionAmt = technicalSactionAmt;
 * this.bitumenQuntity = bitumenQuntity; this.tenderAmt = tenderAmt;
 * this.agreementCost = agreementCost; this.percentage = percentage;
 * this.workOrderDate = workOrderDate; this.timeLimit = timeLimit; this.scope =
 * scope; this.adminDept = adminDept; this.additionalEstimatedCost =
 * additionalEstimatedCost; this.addiEstimCostApprDt = addiEstimCostApprDt;
 * this.workEntryDate = workEntryDate; this.adminUpdateDate = adminUpdateDate;
 * this.iterationId = iterationId; this.insertDateTime = insertDateTime; }
 * 
 * public Integer getUniqueId() { return uniqueId; }
 * 
 * public void setUniqueId(Integer uniqueId) { this.uniqueId = uniqueId; }
 * 
 * public Long getWorkId() { return workId; }
 * 
 * public void setWorkId(Long workId) { this.workId = workId; }
 * 
 * public String getWorkNameEnglish() { return workNameEnglish; }
 * 
 * public void setWorkNameEnglish(String workNameEnglish) { this.workNameEnglish
 * = workNameEnglish; }
 * 
 * public String getWorksNameMarathi() { return worksNameMarathi; }
 * 
 * public void setWorksNameMarathi(String worksNameMarathi) {
 * this.worksNameMarathi = worksNameMarathi; }
 * 
 * public String getApprovalNo() { return approvalNo; }
 * 
 * public void setApprovalNo(String approvalNo) { this.approvalNo = approvalNo;
 * }
 * 
 * public LocalDate getApprovalDate() { return approvalDate; }
 * 
 * public void setApprovalDate(LocalDate approvalDate) { this.approvalDate =
 * approvalDate; }
 * 
 * public Double getEstimatedCost() { return estimatedCost; }
 * 
 * public void setEstimatedCost(Double estimatedCost) { this.estimatedCost =
 * estimatedCost; }
 * 
 * public Integer getRoadNo() { return roadNo; }
 * 
 * public void setRoadNo(Integer roadNo) { this.roadNo = roadNo; }
 * 
 * public Double getChainageFrom() { return chainageFrom; }
 * 
 * public void setChainageFrom(Double chainageFrom) { this.chainageFrom =
 * chainageFrom; }
 * 
 * public Double getChainageTo() { return chainageTo; }
 * 
 * public void setChainageTo(Double chainageTo) { this.chainageTo = chainageTo;
 * }
 * 
 * public Integer getTaluka() { return taluka; }
 * 
 * public void setTaluka(Integer taluka) { this.taluka = taluka; }
 * 
 * public Integer getConstitutionId() { return constitutionId; }
 * 
 * public void setConstitutionId(Integer constitutionId) { this.constitutionId =
 * constitutionId; }
 * 
 * public String getControllingOfficerCode() { return controllingOfficerCode; }
 * 
 * public void setControllingOfficerCode(String controllingOfficerCode) {
 * this.controllingOfficerCode = controllingOfficerCode; }
 * 
 * public String getWorkInd() { return workInd; }
 * 
 * public void setWorkInd(String workInd) { this.workInd = workInd; }
 * 
 * public String getWorkType() { return workType; }
 * 
 * public void setWorkType(String workType) { this.workType = workType; }
 * 
 * public String getWorkCategory() { return workCategory; }
 * 
 * public void setWorkCategory(String workCategory) { this.workCategory =
 * workCategory; }
 * 
 * public String getUserDept() { return userDept; }
 * 
 * public void setUserDept(String userDept) { this.userDept = userDept; }
 * 
 * public Double getCarpetArea() { return carpetArea; }
 * 
 * public void setCarpetArea(Double carpetArea) { this.carpetArea = carpetArea;
 * }
 * 
 * public String getRemark() { return remark; }
 * 
 * public void setRemark(String remark) { this.remark = remark; }
 * 
 * public Integer getBookValue() { return bookValue; }
 * 
 * public void setBookValue(Integer bookValue) { this.bookValue = bookValue; }
 * 
 * public Integer getConstructedYear() { return constructedYear; }
 * 
 * public void setConstructedYear(Integer constructedYear) {
 * this.constructedYear = constructedYear; }
 * 
 * public Integer getBudgetYear() { return budgetYear; }
 * 
 * public void setBudgetYear(Integer budgetYear) { this.budgetYear = budgetYear;
 * }
 * 
 * public Integer getBudgetMonth() { return budgetMonth; }
 * 
 * public void setBudgetMonth(Integer budgetMonth) { this.budgetMonth =
 * budgetMonth; }
 * 
 * public Integer getBudgetBookPageNo() { return budgetBookPageNo; }
 * 
 * public void setBudgetBookPageNo(Integer budgetBookPageNo) {
 * this.budgetBookPageNo = budgetBookPageNo; }
 * 
 * public Integer getBudgetBookSerialNo() { return budgetBookSerialNo; }
 * 
 * public void setBudgetBookSerialNo(Integer budgetBookSerialNo) {
 * this.budgetBookSerialNo = budgetBookSerialNo; }
 * 
 * public String getChiefEnginner() { return chiefEnginner; }
 * 
 * public void setChiefEnginner(String chiefEnginner) { this.chiefEnginner =
 * chiefEnginner; }
 * 
 * public Long getSubDivision() { return subDivision; }
 * 
 * public void setSubDivision(Long subDivision) { this.subDivision =
 * subDivision; }
 * 
 * public LocalDate getTechnicalSactionDate() { return technicalSactionDate; }
 * 
 * public void setTechnicalSactionDate(LocalDate technicalSactionDate) {
 * this.technicalSactionDate = technicalSactionDate; }
 * 
 * public Double getTechnicalSactionAmt() { return technicalSactionAmt; }
 * 
 * public void setTechnicalSactionAmt(Double technicalSactionAmt) {
 * this.technicalSactionAmt = technicalSactionAmt; }
 * 
 * public Double getBitumenQuntity() { return bitumenQuntity; }
 * 
 * public void setBitumenQuntity(Double bitumenQuntity) { this.bitumenQuntity =
 * bitumenQuntity; }
 * 
 * public Double getTenderAmt() { return tenderAmt; }
 * 
 * public void setTenderAmt(Double tenderAmt) { this.tenderAmt = tenderAmt; }
 * 
 * public Double getAgreementCost() { return agreementCost; }
 * 
 * public void setAgreementCost(Double agreementCost) { this.agreementCost =
 * agreementCost; }
 * 
 * public Double getPercentage() { return percentage; }
 * 
 * public void setPercentage(Double percentage) { this.percentage = percentage;
 * }
 * 
 * public LocalDate getWorkOrderDate() { return workOrderDate; }
 * 
 * public void setWorkOrderDate(LocalDate workOrderDate) { this.workOrderDate =
 * workOrderDate; }
 * 
 * public Integer getTimeLimit() { return timeLimit; }
 * 
 * public void setTimeLimit(Integer timeLimit) { this.timeLimit = timeLimit; }
 * 
 * public String getScope() { return scope; }
 * 
 * public void setScope(String scope) { this.scope = scope; }
 * 
 * public String getAdminDept() { return adminDept; }
 * 
 * public void setAdminDept(String adminDept) { this.adminDept = adminDept; }
 * 
 * public Integer getAdditionalEstimatedCost() { return additionalEstimatedCost;
 * }
 * 
 * public void setAdditionalEstimatedCost(Integer additionalEstimatedCost) {
 * this.additionalEstimatedCost = additionalEstimatedCost; }
 * 
 * public LocalDate getAddiEstimCostApprDt() { return addiEstimCostApprDt; }
 * 
 * public void setAddiEstimCostApprDt(LocalDate addiEstimCostApprDt) {
 * this.addiEstimCostApprDt = addiEstimCostApprDt; }
 * 
 * public LocalDate getWorkEntryDate() { return workEntryDate; }
 * 
 * public void setWorkEntryDate(LocalDate workEntryDate) { this.workEntryDate =
 * workEntryDate; }
 * 
 * public LocalDate getAdminUpdateDate() { return adminUpdateDate; }
 * 
 * public void setAdminUpdateDate(LocalDate adminUpdateDate) {
 * this.adminUpdateDate = adminUpdateDate; }
 * 
 * public Integer getIterationId() { return iterationId; }
 * 
 * public void setIterationId(Integer iterationId) { this.iterationId =
 * iterationId; }
 * 
 * public LocalDate getInsertDateTime() { return insertDateTime; }
 * 
 * public void setInsertDateTime(LocalDate insertDateTime) { this.insertDateTime
 * = insertDateTime; } }
 */