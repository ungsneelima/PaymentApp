package pmt.actions;
import java.util.List;

import pmt.User;
import pmt.appdata.AppData;
public class UserActions 
{
	public void registerUser(User user) {
		AppData.usersList.add(user);
	}
	public void login(List<User> user)
	{
		AppData.setLoggedInUser(user);
	}
}

