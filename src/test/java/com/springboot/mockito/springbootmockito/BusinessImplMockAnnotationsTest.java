package com.springboot.mockito.springbootmockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class BusinessImplMockAnnotationsTest {

    @Mock
    DataService dataServiceMock;

    @InjectMocks
    BusinessImpl businessImpl;

    @Test
    public void testFindTheGreatestFromAllData(){
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {24, 15, 3});
        assertEquals(24, businessImpl.findTheGreatestFromAllData());
    }

    @Test
    public void testFindTheGreatestFromOneData(){
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {15});
        assertEquals(15, businessImpl.findTheGreatestFromAllData());
    }

    @Test
    public void testFindTheGreatestFromAllData_NoValues() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {});
        assertEquals(Integer.MIN_VALUE, businessImpl.findTheGreatestFromAllData());
    }
}
