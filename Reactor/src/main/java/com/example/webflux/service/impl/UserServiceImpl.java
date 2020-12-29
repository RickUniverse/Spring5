package com.example.webflux.service.impl;

import com.example.webflux.entity.User;
import com.example.webflux.service.UserService;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lijichen
 * @date 2020/11/18 - 17:54
 */
@Repository
public class UserServiceImpl implements UserService {

    public final Map<Integer, User> userMap = new HashMap<>();

    public UserServiceImpl() {
        userMap.put(1, new User(1, "张三"));
        userMap.put(2, new User(2, "张三2"));
        userMap.put(3, new User(3, "张三3"));
        userMap.put(4, new User(4, "张三4"));
        userMap.put(5, new User(5, "张三5"));
        userMap.put(6, new User(6, "张三6"));
    }


    @Override
    public Mono<User> getUserById(int id) {
        return Mono.justOrEmpty(userMap.get(id));
    }

    @Override
    public Flux<User> getAllUsers() {
        return Flux.fromIterable(userMap.values());
    }

    @Override
    public Mono<Void> saveUser(Mono<User> user) {
        return user.doOnNext(person -> {
            int id = userMap.size() + 1;
            userMap.put(id, person);
        }).thenEmpty(Mono.empty());
    }
}
