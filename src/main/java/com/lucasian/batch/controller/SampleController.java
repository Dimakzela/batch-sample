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

}
