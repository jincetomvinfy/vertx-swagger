package io.swagger.server.api.verticle;

import io.swagger.server.api.model.User;
import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;

import java.util.List;

public class UserApiImpl implements UserApi{
   public  void createUser(User body, Handler<AsyncResult<Void>> handler){}

    //createUsersWithArrayInput
    public void createUsersWithArrayInput(List<User> body, Handler<AsyncResult<Void>> handler){}

    //createUsersWithListInput
    public void createUsersWithListInput(List<User> body, Handler<AsyncResult<Void>> handler){}

    //deleteUser
   public  void deleteUser(String username, Handler<AsyncResult<Void>> handler){}

    //getUserByName
   public void getUserByName(String username, Handler<AsyncResult<User>> handler){
       if(username.equals("jince")) {
           handler.handle(Future.succeededFuture(new User()));
       }else{
           handler.handle(Future.failedFuture("Couldn't find the user"));
       }
   }

    //loginUser
    public void loginUser(String username, String password, Handler<AsyncResult<String>> handler){}

    //logoutUser
   public void logoutUser(Handler<AsyncResult<Void>> handler){}

    //updateUser
    public void updateUser(String username, User body, Handler<AsyncResult<Void>> handler){}

}
