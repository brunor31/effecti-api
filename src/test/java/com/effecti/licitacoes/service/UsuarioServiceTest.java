package com.effecti.licitacoes.service;

import com.effecti.licitacoes.api.model.UsuarioRequestDTO;
import com.effecti.licitacoes.api.model.UsuarioResponseDTO;
import com.effecti.licitacoes.domain.Usuario;
import com.effecti.licitacoes.repository.UsuarioRepository;
import com.effecti.licitacoes.service.UsuarioService;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.util.ReflectionTestUtils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;

class UsuarioServiceTest {

    @Mock
    private UsuarioRepository usuarioRepository;
    @Mock
    private ObjectMapper objectMapper;
    @InjectMocks
    private UsuarioService usuarioService;
    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }
    @Test
    void create() {
        UsuarioRequestDTO requestDTO = new UsuarioRequestDTO();
        requestDTO.setNome("usuarioTeste");
        requestDTO.setEmail("example1@example.com");
        requestDTO.setSenha("password");

        Usuario usuarioEntity = new Usuario();
        usuarioEntity.setId(1L);
        usuarioEntity.setNome(requestDTO.getNome());
        usuarioEntity.setEmail(requestDTO.getEmail());
        usuarioEntity.setSenha(requestDTO.getSenha());

        UsuarioResponseDTO responseDTO = new UsuarioResponseDTO(
                usuarioEntity.getId(),
                usuarioEntity.getNome(),
                usuarioEntity.getEmail()

        );

        when(objectMapper.convertValue(requestDTO, Usuario.class)).thenReturn(usuarioEntity);
        when(usuarioRepository.existsByEmail(requestDTO.getEmail())).thenReturn(false);
        when(usuarioService.create(requestDTO)).thenReturn(responseDTO);

        assertNotNull(responseDTO);
        assertEquals("example1@example.com", responseDTO.email());

        verify(objectMapper, times(1)).convertValue(requestDTO, Usuario.class);
        verify(usuarioRepository, times(1)).existsByEmail(requestDTO.getEmail());
        verify(usuarioRepository, times(1)).save(usuarioEntity);
    }
}