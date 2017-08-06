package com.example.demo.algorithm;

import com.example.demo.entity.travelResource.TravelPlan;
import com.example.demo.model.TravelPlanVO;

import java.util.List;

/**
 * Created by huweining on 2017/8/5.
 */
public class EvaluationSorting {

    public static double evaluationTravelPlan(TravelPlanVO travelPlanVO){
        int grossProfit = travelPlanVO.getPrice() - travelPlanVO.getCost();
        double acceptance = 1;
        double judgement = 1;
        double matchDegree = travelPlanVO.getMatchDegree();
        double grade = grossProfit * acceptance * judgement * matchDegree;
        travelPlanVO.setGrade(grade);
        return grade;
        /**
         * if travel_plan is already existed,
         *     search the acceptance and judgement by travel_plan
         * else
         *     choose the lowest acceptance and judgement of travel_plan's travel_resource_item
         */


    }
}