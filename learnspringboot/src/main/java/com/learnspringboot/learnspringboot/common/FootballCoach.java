package com.learnspringboot.learnspringboot.common;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Do dribble practice for 4hr";
    }
}
