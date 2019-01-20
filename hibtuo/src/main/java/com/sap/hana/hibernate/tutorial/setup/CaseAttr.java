package com.sap.hana.hibernate.tutorial.setup;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SAPQAL.SCMG_T_CASE")
public class CaseAttr {
	
	@Id
	@Column(name = "MANDT")
	String client;
	@Id
	@Column(name = "CASE_GUID")
	String caseGuid;
	@Column(name = "RECORD_PDIR")
	String recordPoid;
	@Column(name = "NOTE_PDIR")
	String notePoid;
	@Column(name = "WFPTHID")
	String wfname;
	public String getClient() {
		return client;
	}
	public void setClient(String client) {
		this.client = client;
	}
	public String getCaseGuid() {
		return caseGuid;
	}
	public void setCaseGuid(String caseGuid) {
		this.caseGuid = caseGuid;
	}
	public String getRecordPoid() {
		return recordPoid;
	}
	public void setRecordPoid(String recordPoid) {
		this.recordPoid = recordPoid;
	}
	public String getNotePoid() {
		return notePoid;
	}
	public void setNotePoid(String notePoid) {
		this.notePoid = notePoid;
	}
	public String getWfname() {
		return wfname;
	}
	public void setWfname(String wfname) {
		this.wfname = wfname;
	}
	

}
