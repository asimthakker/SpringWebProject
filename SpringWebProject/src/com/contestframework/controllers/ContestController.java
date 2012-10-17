package com.contestframework.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.contestframework.model.Contest;

@Controller
@RequestMapping("/contest")
public class ContestController {

	@RequestMapping(value="{name}", method = RequestMethod.GET)
	public @ResponseBody Contest getContestInJSON(@PathVariable String name) {
 
		Contest contest = new Contest();
		contest.setName(name);
		contest.setStaffName(new String("contestitem1"));

		return contest;
 
	}
}
