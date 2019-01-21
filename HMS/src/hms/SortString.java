package hms;


import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Suson
 */
public class SortString {

    private final String[] toBeSorted;
    private final ArrayList<Doctor> sortedList;
    private final ArrayList<Doctor> doctorList;

    public SortString(String[] sortedArray) {
        this.toBeSorted = sortedArray;
        sortedList = new ArrayList<>();
        this.doctorList = Configuration.doctorList;
    }

  
    
    
    

}
