#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ${package}.service;

import java.util.logging.Logger;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.enterprise.event.Observes;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import lombok.extern.java.Log;
import ${package}.dto.UserDto;
import ${package}.dto.requests.CreateUserRequest;
import ru.sendto.ejb.interceptor.BundleResult;
import ${package}.dao.entity.User;

/**
 * 
 * @author Lev Nadeinsky
 * @date	2017-06-05
 */
@Stateless
@LocalBean
@Log
public class ExampleBean {
	@Inject
	EntityManager em;
	
	@BundleResult
	public UserDto createUser(@Observes CreateUserRequest request) {
		final User user = new User();
		em.persist(user);//TODO create fields(login,password) in DB 
		return new UserDto().setId(user.getId()).setLogin(request.getLogin());
	}
}
