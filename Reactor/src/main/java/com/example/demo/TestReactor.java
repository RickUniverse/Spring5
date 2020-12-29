package com.example.demo;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lijichen
 * @date 2020/11/17 - 21:16
 */
public class TestReactor {
    public static void main(String[] args) {
        Flux.just(1, 2, 3, 4).subscribe(System.out::print);
        Mono.just(1).subscribe(System.out::print);
        Flux.fromArray(new Integer[]{1, 2});
        List list = new ArrayList();
        list.add(true);
        list.add(1);
        list.add("asdfasdfa");
        list.add(new TestReactor());
        Flux.fromIterable(list);
        Flux.fromStream(list.stream()).subscribe(System.out::println);
    }
}
