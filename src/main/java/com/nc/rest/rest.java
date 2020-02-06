package com.nc.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nc.entity.User;
import com.nc.model.Model;
import com.nc.entity.Clientes;
import com.nc.entity.Orders;
import com.nc.repository.UserRepository;
import com.nc.repository.ClienteRepository;
import com.nc.repository.OrderRepository;

@RestController
@RequestMapping(path = "/api/prueba",  produces = MediaType.APPLICATION_JSON_VALUE)

public class rest {
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	ClienteRepository clienteRepository;
	
	@Autowired
	OrderRepository orderRepository;
	
	Model res = new Model();
	
	@GetMapping("/clientes")
	    List<Clientes> getClientes(){
	    	return clienteRepository.findAll();
	}
	 
	@GetMapping("/clientes/{clienteId}")
	    Clientes getClienteById(@PathVariable int clienteId){
	    	return clienteRepository.findById(clienteId).get();
	}
	 
	@GetMapping("/orders")
	    List<Orders> getOrder(){
	    	return orderRepository.findAll();
	}
	 
	@GetMapping("/orders/orderId")
	    Orders getOrderById(@PathVariable int orderId){
	    	return orderRepository.findById(orderId).get();
	}
	 
	
    @GetMapping("/users")
    List<User> getUsers(){
        return userRepository.findAll();
	}
	
    @GetMapping("/users/{userId}")
    User getUserById(@PathVariable int userId){
    	return userRepository.findById(userId).get();
    }
    
    
    @PostMapping("/users")
    User createUser(@RequestBody User user) {
    	return userRepository.save(user);
    }
    
    @PutMapping("/users/{userId}")
    Model updateUser(@RequestBody User user, @PathVariable int userId) {
    	String message = "";
    	boolean userSaved = userRepository.existsById(userId);
    	if(userSaved) {
    		user.setId(userId);
    		userRepository.save(user);
    		res.setCode(200);
    		res.setStatus(true);
    		message = "Usuario Modificado";
    	}
    	else {
    		res.setCode(404);
    		message = "Usuario no encontrado";
    	}
        res.setMessage(message);
		return res;
    }
        
    @DeleteMapping("users/{userId}")
    Model deleteUser(@PathVariable int userId){
    	String message = "";
    	boolean userSaved = userRepository.existsById(userId);
    	if(userSaved) {
    		userRepository.deleteById(userId);
            res.setCode(200);
    		res.setStatus(true);
    		message = "Usuario Eliminado";
    	}else {
    		res.setCode(404);
    		message = "Usuario no encontrado";
    	}
        res.setMessage(message);
		return res;
    }
    
	@GetMapping(path = "/test", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Model getRuta() {
		res.setCode(200);
		res.setStatus(true);
		res.setMessage("Server Up");
		return res;
	}
	
	@GetMapping(path = "/saludo", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Model getMensaje(@RequestParam(name="msg") String mensaje) {
		res.setCode(200);
		res.setStatus(true);
		res.setMessage("Mensaje de Prueba:" + mensaje);
		return res;
	}
}
