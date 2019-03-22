/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import main.GradeChecker;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author KHANG NGUYEN
 */
public class TestGrade {
    @Test
    public void checkGrade()
    {
        GradeChecker gc = new GradeChecker();
        assertEquals(1, gc.checkGrade(5));
        assertEquals(1, gc.checkGrade(10));
        assertEquals(1, gc.checkGrade(7));
        assertEquals(0, gc.checkGrade(0));
        assertEquals(0, gc.checkGrade(3));
        assertEquals(0, gc.checkGrade(4.9999));
        assertEquals(-1, gc.checkGrade(11));
    }
    
}
