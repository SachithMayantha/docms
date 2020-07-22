package com.nem.docms.servies;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nem.docms.entities.Performance;
import com.nem.docms.entities.Performance2;
import com.nem.docms.repositories.PerformanceRepository;

@Service
public class PerformanceService {
	
	@Autowired
	PerformanceRepository performanceRepository;

	public List<Performance> getAll() {
		// TODO Auto-generated method stub
		return performanceRepository.findAll();
	}
	
	public Performance getPerformance(String id) {
		// TODO Auto-generated method stub
		return performanceRepository.findById(id).get();
	}

	public Performance addPerformance(Performance2 per) throws ParseException {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Performance per1 = new Performance();
		per1.setId(per.getId());
		per1.setName(per.getName());
		per1.setAmount(per.getAmount());
		per1.setEffective(simpleDateFormat.parse(per.getEffective()));
		per1.setExpire(simpleDateFormat.parse(per.getExpire()));
		per1.setRemain(per.getRemain());
		per1.setStatus(per.getStatus());
		// TODO Auto-generated method stub
		
		return performanceRepository.insert(per1);
	}

	public Performance update(Performance per) {
		// TODO Auto-generated method stub
		return performanceRepository.save(per);
	}

	public void delete(String id) {
		// TODO Auto-generated method stub
		performanceRepository.deleteById(id);
	}
}
