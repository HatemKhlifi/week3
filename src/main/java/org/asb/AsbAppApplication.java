package org.asb;

import org.asb.dao.RoleDao;
import org.asb.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AsbAppApplication implements CommandLineRunner{

	@Autowired
	RoleDao roleDao;
	
	public static void main(String[] args) {
		SpringApplication.run(AsbAppApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		roleDao.save(new Role("CHEF_PROJET"));
		roleDao.save(new Role("MANAGER"));
		roleDao.save(new Role("ADMIN"));
		
	}
}
