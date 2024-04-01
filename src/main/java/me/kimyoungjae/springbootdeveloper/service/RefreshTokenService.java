package me.kimyoungjae.springbootdeveloper.service;

import lombok.RequiredArgsConstructor;
import me.kimyoungjae.springbootdeveloper.repository.RefreshTokenRepository;
import me.kimyoungjae.springbootdeveloper.domain.RefreshToken;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class RefreshTokenService {
    private final RefreshTokenRepository refreshTokenRepository;

    public RefreshToken findByRefreshToken(String refreshToken) {
        return refreshTokenRepository.findByRefreshToken(refreshToken)
                .orElseThrow(() -> new IllegalArgumentException("Unexpected token"));
    }
}

