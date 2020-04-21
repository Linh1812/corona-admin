package service;

import model.LoginForUser;
public class LoginService {
		public boolean checkLogin(LoginForUser user) {
			if ("admin".equals(user.getUsername()) && "123456".equals(user.getPassword())) {
				return true;
			} else {
				return false;
			}
		}

}
