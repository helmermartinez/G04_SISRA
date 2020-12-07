package pe.edu.upeu.SISRA;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import com.google.gson.Gson;

import pe.edu.upeu.SISRA.dao.RolDao;
import pe.edu.upeu.SISRA.dao.UsuarioDao;
import pe.edu.upeu.SISRA.entity.Rol;

@SpringBootTest
class SisraApplicationTests {
	
	@Autowired
	PasswordEncoder passwordEncoder;
	@Test
	void contextLoads() {
		System.out.println(passwordEncoder.encode("123"));
	}
}
