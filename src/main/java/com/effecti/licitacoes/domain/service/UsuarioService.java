package com.effecti.licitacoes.domain.service;

import com.effecti.licitacoes.api.model.UsuarioRequestDTO;
import com.effecti.licitacoes.api.model.UsuarioResponseDTO;
import com.effecti.licitacoes.domain.model.Usuario;
import com.effecti.licitacoes.domain.repository.UsuarioRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private ObjectMapper objectMapper;

    public UsuarioResponseDTO create(UsuarioRequestDTO usuario) {
        Usuario usuarioEntity = objectMapper.convertValue(usuario, Usuario.class);
        if(usuarioRepository.existsByEmail(usuarioEntity.getEmail())) {
            throw new RuntimeException("Usuário já está cadastrado");
        }
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encode = passwordEncoder.encode(usuarioEntity.getSenha());
        usuarioEntity.setSenha(encode);
        usuarioRepository.save(usuarioEntity);
        return objectMapper.convertValue(usuarioEntity, UsuarioResponseDTO.class);
    }
}
