package me.kimyoungjae.springbootdeveloper.service;

import lombok.RequiredArgsConstructor;
import me.kimyoungjae.springbootdeveloper.repository.UserRepository;
import me.kimyoungjae.springbootdeveloper.domain.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserDetailService implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public User loadUserByUsername(String email) {
        return userRepository.findByEmail(email)
                 .orElseThrow(() -> new IllegalArgumentException((email)));
    }
}
