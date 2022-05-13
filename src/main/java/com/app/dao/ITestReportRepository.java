package com.app.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.dto.TestReportDTO;
import com.app.entity.TestReport;

@Repository
public interface ITestReportRepository extends CrudRepository<TestReport, Integer> {
	
/*
	@Query("SELECT new com.app.dto.TestReportDTO (a.appoinId ,p.patientId ,p.patientName ,p.age ,p.mobileno ,p.gender"
			+ " ,p.bloodGroup ,p.email ,t.reportId ,l.labtestId ,t.obtainedValue ,t.notes) "
			+"FROM Appointment a INNER JOIN a.patientId p "
	       + "INNER JOIN a.reportId t INNER JOIN a.labtestId l WHERE t.reportId=:id")
	public TestReportDTO getPatientLabReport(int id);

*/
}
