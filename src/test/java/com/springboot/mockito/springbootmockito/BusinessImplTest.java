package com.springboot.mockito.springbootmockito;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class BusinessImplTest {

    @Test
    public void testFindTheGreatestFromAllData(){
        // using sub
        BusinessImpl businessImpl = new BusinessImpl(new DataServiceSub());
        int result = businessImpl.findTheGreatestFromAllData();
        assertEquals(24, result);
    }

}

/* Drawback:
   1. Hard to maintain
   2. Duplicate subs
 */
class DataServiceSub implements DataService{
    @Override
    public int[] retrieveAllData() {
        return new int[] { 24, 6, 15 };
    }
}