package ar.edu.utn.frsr.sysacad.sysacad.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PlanTestCase {
    
    @Test
    public void testPlan() {
        var plan = new Plan();
        plan.setNombre("Plan de Sistemas");
        plan.setFechaInicio((LocalDate.parse("2024-01-01")));
        plan.setFechaFin((LocalDate.parse("2050-12-31")));
        
        assertNotNull(plan);
        assertEquals("Plan de Sistemas", plan.getNombre());
        assertEquals(LocalDate.parse("2024-01-01"), plan.getFechaInicio());
        assertEquals(LocalDate.parse("2050-12-31"), plan.getFechaFin());
        assertTrue(plan.getFechaFin().isAfter(plan.getFechaInicio()));
        
    }
}
