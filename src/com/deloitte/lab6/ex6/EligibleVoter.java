package com.deloitte.lab6.ex6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EligibleVoter {
    public static void main(String[] args) {
        Map<String,Integer> voters = new HashMap<>();
        voters.put("12345", 20);
        voters.put("12346", 10);
        voters.put("12335", 33);
        voters.put("12245", 44);
        voters.put("11345", 18);
        voters.put("02345", 12);
        List<String> eligibleVoter = votersList(voters);
        eligibleVoter.forEach(s -> System.out.println(s));
    }

    public static List<String> votersList(Map<String,Integer> voters){
        List<String> eligibleVoters = new ArrayList<>();
        voters.forEach((id,age)->{
            if(age>18)
            {
                eligibleVoters.add(id);
            }
        });
        return eligibleVoters;
    }

}
