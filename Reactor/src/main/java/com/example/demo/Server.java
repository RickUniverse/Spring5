package com.example.demo;

import com.example.webflux.handler.UserHanlder;
import com.example.webflux.service.UserService;
import com.example.webflux.service.impl.UserServiceImpl;
import org.springframework.http.server.reactive.HttpHandler;
import org.springframework.http.server.reactive.ReactorHttpHandlerAdapter;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.netty.http.server.HttpServer;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.toHttpHandler;

/**
 * @author lijichen
 * @date 2020/11/19 - 14:20
 */
public class Server {

    //调用
    public static void main(String[] args) throws Exception {
        Server server = new Server();
        server.createReactotServer();
        System.out.println("enter to exit");
        System.in.read();
    }


    //1 创建Router路由
    public RouterFunction<ServerResponse> rountingFunction() {
        //创建handler对象
        UserService userService = new UserServiceImpl();
        UserHanlder hanlder = new UserHanlder(userService);

        //设置路由
        return RouterFunctions.route(
                GET("/users/{id}").and(accept(APPLICATION_JSON)),hanlder::getUserById)
                .andRoute(GET("users").and(accept(APPLICATION_JSON)),hanlder::getAllUsers);
    }

    //2 创建服务器完成适配
    public void createReactotServer() {
        //路由器和handler适配
        RouterFunction<ServerResponse> route = rountingFunction();
        HttpHandler httpHandler = toHttpHandler(route);
        ReactorHttpHandlerAdapter adapter = new ReactorHttpHandlerAdapter(httpHandler);
        //创建服务器
        HttpServer httpServer = HttpServer.create();
        httpServer.handle(adapter).bindNow();
    }
}
