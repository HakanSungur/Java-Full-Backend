package projem.northwind.business.abstracts;

import projem.northwind.core.entities.User;
import projem.northwind.core.utilities.results.DataResult;
import projem.northwind.core.utilities.results.Result;



public interface UserService {

	Result add(User user);
	DataResult<User> findByEmail(String email);
}
