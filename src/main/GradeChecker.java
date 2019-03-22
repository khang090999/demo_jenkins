/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KHANG NGUYEN
 */
package main;
public class GradeChecker {
    public int checkGrade(double mark)
    {
        if(mark>=0 && mark <5) 
            return 0;
        else if(mark >=5 && mark<= 10)
            return 1;
        else 
            return -1;
    }
}
