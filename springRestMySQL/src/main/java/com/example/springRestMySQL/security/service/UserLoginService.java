package com.example.springRestMySQL.security.service;

import com.example.springRestMySQL.entity.RestUser;
import com.example.springRestMySQL.repository.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserLoginService {

    private final UsersRepository usersRepository;

    private final PasswordEncoder passwordEncoder;


    public Collection<UserDetails> getUserDetails(){
        return usersRepository.findAll().stream().map(user ->
            User.builder()
                    .username(user.getUserName())
                    .password(passwordEncoder.encode(user.getUserPassword()))
                    .roles("USER")
                    .build()
        ).collect(Collectors.toList());
    }

}
