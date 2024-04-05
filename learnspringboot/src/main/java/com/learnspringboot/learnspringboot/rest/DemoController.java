package com.learnspringboot.learnspringboot.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learnspringboot.learnspringboot.common.Coach;

@RestController
public class DemoController {
    private Coach cricketCoach;
    private Coach footballCoach;

    // @Autowired
    // public DemoController(Coach coach) {
    //     this.coach = coach;
    // }

    // Setter injection
    @Autowired
    public void setCricketCoach(Coach coach) {
        this.cricketCoach = coach;
    }

    @Autowired
    public void setFootBallCoach(Coach coach) {
        this.footballCoach = coach;
    }

    @GetMapping("/")
    public String greet() {
        return "Hello, I am learning spring boot";
    }

    @GetMapping("/dailyworkout_cricket")
    public String dailyWorkoutCricket() {
        return cricketCoach.getDailyWorkout();
    }

    @GetMapping("/dailyworkout_football")
    public String dailyWorkoutFootball() {
        return footballCoach.getDailyWorkout();
    }
}
