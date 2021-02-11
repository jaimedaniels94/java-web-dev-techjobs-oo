package org.launchcode.techjobs_oo.Tests;


import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {

    Job emptyJobOne;
    Job emptyJobTwo;
    Job testJobOne;
    Job testJobTwo;
    Job jobEqualityOne;
    Job jobEqualityTwo;

    @Before
    public void testJobOb() {
        emptyJobOne = new Job();
        emptyJobTwo = new Job();
        testJobOne = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        testJobTwo = new Job();
        jobEqualityOne = new Job("dummy", new Employer("dummy"), new Location("dummy"), new PositionType("dummy"), new CoreCompetency("dummy"));
        jobEqualityTwo = new Job("dummy", new Employer("dummy"), new Location("dummy"), new PositionType("dummy"), new CoreCompetency("dummy"));

    }

    @Test
    public void testSettingJobId(){
        assertEquals(1, emptyJobTwo.getId() - emptyJobOne.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        assertEquals(testJobOne.getEmployer().getValue(), "ACME");
        assertTrue(testJobOne.getEmployer() instanceof Employer);
        assertEquals(testJobOne.getLocation().getValue(), "Desert");
        assertTrue(testJobOne.getLocation() instanceof Location);
        assertEquals(testJobOne.getPositionType().getValue(), "Quality control");
        assertTrue(testJobOne.getPositionType() instanceof PositionType);
        assertEquals(testJobOne.getCoreCompetency().getValue(), "Persistence");
        assertTrue(testJobOne.getCoreCompetency() instanceof CoreCompetency);
    }

    @Test
    public void testJobsForEquality(){
        assertFalse(jobEqualityOne.equals(jobEqualityTwo));
    }

}
