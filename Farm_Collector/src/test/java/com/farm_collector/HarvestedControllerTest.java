package com.farm_collector;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.farm_collector.controller.HarvestedController;
import com.farm_collector.dto.PlantedRequest;
import com.farm_collector.service.HarvestedService;
import com.fasterxml.jackson.databind.ObjectMapper;

@ExtendWith(MockitoExtension.class)
public class HarvestedControllerTest {

	private MockMvc mockMvc;

    @Mock
    private HarvestedService service;
    
    @InjectMocks
    HarvestedController controller;
	
    @BeforeEach
    public void setup() {
        mockMvc = MockMvcBuilders.standaloneSetup(controller)
                .build();
    }
    
	@Test
    public void testHarvested() throws Exception {
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/saveHarvestedCrop").contentType(MediaType.APPLICATION_JSON)
                        .content(new ObjectMapper().writeValueAsString(new PlantedRequest())))
                .andReturn();

        assertEquals(201, mvcResult.getResponse().getStatus());
    }
}
