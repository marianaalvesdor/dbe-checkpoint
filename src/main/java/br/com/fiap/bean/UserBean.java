package br.com.fiap.bean;

import javax.faces.bean.ManagedBean;
import br.com.fiap.dao.UserDao;
import br.com.fiap.model.User;

@ManagedBean
public class UserBean {
	private User user = new User();

	public void save() {
		UserDao.save(this.user);
		System.out.println("Salvando o usuario:\n" + this.user);
	}

	public void executar() {
		System.out.println("Acionando o Bean!!");
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}