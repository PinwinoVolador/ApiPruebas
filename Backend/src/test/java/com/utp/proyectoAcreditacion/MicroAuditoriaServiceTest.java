package com.utp.proyectoAcreditacion;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import com.utp.proyectoAcreditacion.entities.MicroAuditoria;
import com.utp.proyectoAcreditacion.repositories.MicroAuditoriaRepository;
import com.utp.proyectoAcreditacion.services.MicroAuditoriaService;

class MicroAuditoriaServiceTest {

    @Mock
    private MicroAuditoriaRepository microAuditoriaRepository;

    @InjectMocks
    private MicroAuditoriaService microAuditoriaService;

    public MicroAuditoriaServiceTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetMicroAuditorias() {
        
        MicroAuditoria auditoria1 = new MicroAuditoria();
        MicroAuditoria auditoria2 = new MicroAuditoria();
        when(microAuditoriaRepository.findAll()).thenReturn(Arrays.asList(auditoria1, auditoria2));

        List<MicroAuditoria> auditorias = microAuditoriaService.getMicroAuditorias();

        assertEquals(2, auditorias.size());
        verify(microAuditoriaRepository).findAll();
    }

    @Test
    void testFindMicroAuditoriaById() {
        
        MicroAuditoria auditoria = new MicroAuditoria();
        auditoria.setCodigoMicroAuditoria(1);
        when(microAuditoriaRepository.findById(1)).thenReturn(Optional.of(auditoria));

        Optional<MicroAuditoria> result = microAuditoriaService.findMicroAuditoriaById(1);

        assertTrue(result.isPresent());
        assertEquals(1, result.get().getCodigoMicroAuditoria());
        verify(microAuditoriaRepository).findById(1);
    }

    @Test
    void testCreateMicroAuditoria() {
        
        MicroAuditoria auditoria = new MicroAuditoria();
        when(microAuditoriaRepository.save(auditoria)).thenReturn(auditoria);

        MicroAuditoria result = microAuditoriaService.createMicroAuditoria(auditoria);

        assertNotNull(result);
        verify(microAuditoriaRepository).save(auditoria);
    }

    @Test
    void testDeleteMicroAuditoria() {
        
        microAuditoriaService.deleteMicroAuditoria(1);

        verify(microAuditoriaRepository).deleteById(1);
    }
}

