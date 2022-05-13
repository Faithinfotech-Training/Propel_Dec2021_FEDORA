package com.app.rest;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.app.entity.LabtestBill;
import com.app.service.ITestBillService;

@CrossOrigin
@RestController
@RequestMapping("/testbill")
public class TestBillController {
	
	/*	@Autowired
	private ITestBillService testBillService;
	
	@GetMapping("/testbill/{Id}")
	public Optional<LabtestBill> getLabtestBill(Integer Id) {
		return testBillService.getLabtestBill(Id);
	
	}
*/
}
