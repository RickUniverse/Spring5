package com.example.webflux.service;

import com.example.webflux.entity.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UserService {
    //获取一个用户
    Mono<User> getUserById(int id);

    //获取多个用户
    Flux<User> getAllUsers();

    //保存用户
    Mono<Void> saveUser(Mono<User> user);
}
