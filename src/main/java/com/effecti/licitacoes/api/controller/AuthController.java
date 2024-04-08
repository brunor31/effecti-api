package com.effecti.licitacoes.api.controller;

import com.effecti.licitacoes.api.model.LoginResponseDTO;
import com.effecti.licitacoes.api.model.UsuarioAuthDTO;
import com.effecti.licitacoes.api.model.UsuarioRequestDTO;
import com.effecti.licitacoes.api.model.UsuarioResponseDTO;
import com.effecti.licitacoes.infra.security.TokenService;
import com.effecti.licitacoes.domain.Usuario;
import com.effecti.licitacoes.service.UsuarioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private TokenService tokenService;

    @PostMapping("/login")
    public ResponseEntity<LoginResponseDTO> login(@RequestBody @Valid UsuarioAuthDTO body) {
        var userNamePassword = new UsernamePasswordAuthenticationToken(body.email(), body.senha());
        var auth = this.authenticationManager.authenticate(userNamePassword);
        var token = tokenService.generateToken((Usuario) auth.getPrincipal());
        return ResponseEntity.ok(new LoginResponseDTO(token));
    }

    @PostMapping("/register")
    public ResponseEntity<UsuarioResponseDTO> register(@RequestBody @Valid UsuarioRequestDTO body) {
        UsuarioResponseDTO usuario = usuarioService.create(body);
        return ResponseEntity.status(HttpStatus.CREATED).body(usuario);
    }

}
