package com.lucasian.batch.controller;

import com.lucasian.batch.domain.*;

import java.util.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.persistence.*;

@Controller
public class SampleController {
    
    @PersistenceContext
    private EntityManager entityManager;

    @RequestMapping(value = "/data", method = RequestMethod.GET)
    public @ResponseBody List<SummaryItem> getSampleData() {
			return entityManager.createQuery("SELECT i FROM SummaryItem as i", SummaryItem.class).getResultList();
    }

    @RequestMapping(value = "/detail", method = RequestMethod.GET)
    public @ResponseBody List<DetailItem> getDetailData() {
			return entityManager.createQuery("SELECT i FROM DetailItem as i", DetailItem.class).getResultList();
    }
		
		@RequestMapping(value = "/budget", method = RequestMethod.GET)
    public @ResponseBody List<BudgetItem> getBudgetData() {
			return entityManager.createQuery("SELECT i FROM BudgetItem as i", BudgetItem.class).getResultList();
    }
		
		@RequestMapping(value = "/transfer", method = RequestMethod.GET)
    public @ResponseBody List<TransferItem> getTransferData() {
			return entityManager.createQuery("SELECT i FROM TransferItem as i", TransferItem.class).getResultList();
    }
		
		@RequestMapping(value = "/cuadroResumen", method = RequestMethod.GET)
    public @ResponseBody List<Map<String, Object>> getResumeData() {
			List<Map<String, Object>> result = new ArrayList<Map<String, Object>>();
			
			List<DetailItem> details = entityManager.createQuery("SELECT i FROM DetailItem as i", DetailItem.class).getResultList();
			
			List<BudgetItem> budget = entityManager.createQuery("SELECT i FROM BudgetItem as i", BudgetItem.class).getResultList();
			
			List<TransferItem> transfers = entityManager.createQuery("SELECT i FROM TransferItem as i", TransferItem.class).getResultList();
		
			for (BudgetItem item : budget){
				System.out.println(item.getEntry());
			}

			return result;
    }
}
