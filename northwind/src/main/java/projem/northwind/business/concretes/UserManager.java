package projem.northwind.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projem.northwind.business.abstracts.UserService;
import projem.northwind.core.dataAccess.UserDao;
import projem.northwind.core.entities.User;
import projem.northwind.core.utilities.results.DataResult;
import projem.northwind.core.utilities.results.Result;
import projem.northwind.core.utilities.results.SuccessDataResult;
import projem.northwind.core.utilities.results.SuccessResult;

@Service
public class UserManager implements UserService {
	private UserDao userDao;
	
	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public Result add(User user) {
		this.userDao.save(user);
		return new SuccessResult("Kullanıcı Eklendi") ;
	}

	@Override
	public DataResult<User> findByEmail(String email) {
		
		return new SuccessDataResult<User>(this.userDao.findByEmail(email), "Kullanıcı Bulundu");
	}

}
