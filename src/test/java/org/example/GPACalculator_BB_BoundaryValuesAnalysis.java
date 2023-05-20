package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GPACalculator_BB_BoundaryValuesAnalysis {

    @Test
    void calcGPA_WB_BVA_lessThanZero() throws Exception{
        assertEquals(GPA.UnavailableSmallerThanZ,GPACalculator.calcGPA(-1.0),"Failed @ : calcGPA_WB_BVA_lessThanZero");
    }

    @Test
    void calcGPA_WB_BVA_BiggerThanHundered() throws Exception{
        assertEquals(GPA.UnavailableBiggerThanH,GPACalculator.calcGPA(101.0),"Failed @ : calcGPA_WB_BVA_BiggerThanHundered");
    }

    //Aplus
    @Test
    void calcGPA_WB_BVA_APlus() throws Exception{
        assertEquals(GPA.APlus,GPACalculator.calcGPA(98.0),"Failed @ : calcGPA_WB_BVA_APlus");
    }
    @Test
    void calcGPA_WB_BVA_APlusBoundary() throws Exception{
        assertEquals(GPA.APlus,GPACalculator.calcGPA(97.0),"Failed @ : calcGPA_WB_BVA_APlusBoundary");
    }

    //A
    @Test
    void calcGPA_WB_BVA_A() throws Exception{
        assertEquals(GPA.A,GPACalculator.calcGPA(94.0),"Failed @ : calcGPA_WB_BVA_A");
    }
    @Test
    void calcGPA_WB_BVA_ABoundary() throws Exception{
        assertEquals(GPA.A,GPACalculator.calcGPA(93.0),"Failed @ : calcGPA_WB_BVA_ABoundary");
    }

    //AMinus
    @Test
    void calcGPA_WB_BVA_AMinus() throws Exception{
        assertEquals(GPA.AMinus,GPACalculator.calcGPA(90.0),"Failed @ : calcGPA_WB_BVA_AMinus");
    }
    @Test
    void calcGPA_WB_BVA_AMinusBoundary() throws Exception{
        assertEquals(GPA.AMinus,GPACalculator.calcGPA(89.0),"Failed @ : calcGPA_WB_BVA_AMinusBoundary");
    }

    //BPlus
    @Test
    void calcGPA_WB_BVA_BPlus() throws Exception{
        assertEquals(GPA.BPlus,GPACalculator.calcGPA(85.0),"Failed @ : calcGPA_WB_BVA_BPlus");
    }
    @Test
    void calcGPA_WB_BVA_BPlusBoundary() throws Exception{
        assertEquals(GPA.BPlus,GPACalculator.calcGPA(84.0),"Failed @ : calcGPA_WB_BVA_BPlusBoundary");
    }

    //B
    @Test
    void calcGPA_WB_BVA_B() throws Exception{
        assertEquals(GPA.B,GPACalculator.calcGPA(81.0),"Failed @ : calcGPA_WB_BVA_B");
    }
    @Test
    void calcGPA_WB_BVA_B_Boundary() throws Exception{
        assertEquals(GPA.B,GPACalculator.calcGPA(80.0),"Failed @ : calcGPA_WB_BVA_B_Boundary");
    }

    //BMinus
    @Test
    void calcGPA_WB_BVA_BMinus() throws Exception{
        assertEquals(GPA.BMinus,GPACalculator.calcGPA(77.0),"Failed @ : calcGPA_WB_BVA_BMinus");
    }
    @Test
    void calcGPA_WB_BVA_BMinus_Boundary() throws Exception{
        assertEquals(GPA.BMinus,GPACalculator.calcGPA(76.0),"Failed @ : calcGPA_WB_BVA_BMinus_Boundary");
    }

    //CPlus
    @Test
    void calcGPA_WB_BVA_CPlus() throws Exception{
        assertEquals(GPA.CPlus,GPACalculator.calcGPA(74.0),"Failed @ : calcGPA_WB_BVA_CPlus");
    }
    @Test
    void calcGPA_WB_BVA_CPlus_Boundary() throws Exception{
        assertEquals(GPA.CPlus,GPACalculator.calcGPA(73.0),"Failed @ : calcGPA_WB_BVA_CPlus_Boundary");
    }

    //C
    @Test
    void calcGPA_WB_BVA_C() throws Exception{
        assertEquals(GPA.C,GPACalculator.calcGPA(71.0),"Failed @ : calcGPA_WB_BVA_C");
    }
    @Test
    void calcGPA_WB_BVA_C_Boundary() throws Exception{
        assertEquals(GPA.C,GPACalculator.calcGPA(70.0),"Failed @ : calcGPA_WB_BVA_C_Boundary");
    }

    //CMinus
    @Test
    void calcGPA_WB_BVA_CMinus() throws Exception{
        assertEquals(GPA.CMinus,GPACalculator.calcGPA(68.0),"Failed @ : calcGPA_WB_BVA_CMinus");
    }
    @Test
    void calcGPA_WB_BVA_CMinus_Boundary() throws Exception{
        assertEquals(GPA.CMinus,GPACalculator.calcGPA(67.0),"Failed @ : calcGPA_WB_BVA_CMinus_Boundary");
    }

    //DPlus
    @Test
    void calcGPA_WB_BVA_DPlus() throws Exception{
        assertEquals(GPA.DPlus,GPACalculator.calcGPA(65.0),"Failed @ : calcGPA_WB_BVA_DPlus");
    }
    @Test
    void calcGPA_WB_BVA_DPlus_Boundary() throws Exception{
        assertEquals(GPA.DPlus,GPACalculator.calcGPA(64.0),"Failed @ : calcGPA_WB_BVA_DPlus_Boundary");
    }

    //D
    @Test
    void calcGPA_WB_BVA_D() throws Exception{
        assertEquals(GPA.D,GPACalculator.calcGPA(61.0),"Failed @ : calcGPA_WB_BVA_D");
    }
    @Test
    void calcGPA_WB_BVA_D_Boundary() throws Exception{
        assertEquals(GPA.D,GPACalculator.calcGPA(60.0),"Failed @ : calcGPA_WB_BVA_D_Boundary");
    }

    //F
    @Test
    void calcGPA_WB_BVA_F() throws Exception{
        assertEquals(GPA.F,GPACalculator.calcGPA(59.0),"Failed @ : calcGPA_WB_BVA_F");
    }


}