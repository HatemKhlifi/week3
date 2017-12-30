package org.asb.service;

import java.util.List;

import org.asb.dao.RoleDao;
import org.asb.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/abs")
@CrossOrigin(value="http://localhost:4200", allowedHeaders="*")
public class RoleService {

	@Autowired
	RoleDao roleDao;

	@PostMapping("/role")
	public Role saveRole(@RequestBody Role role) {
		roleDao.save(role);
		return role;
	}

	@PutMapping("/user")
	public Role updateRole(@RequestBody Role role) {
		roleDao.save(role);
		return role;
	}

	@GetMapping("/roles")
	public List<Role> getRoles() {
		return roleDao.findAll();
	}

	@GetMapping("/role/{id}")
	public Role getRole(@PathVariable Long id) {
		return roleDao.findOne(id);
	}
}
