package pmt.app;
import pmt.appdata.AppData;
import pmt.User;
public class PmtApp {

	public static void main(String[] args) {
		AppData.initUsers();
	}
	public static User getUser(String userName, String password)
	{
		User user = new User();
		user.setUser_name(userName);
		user.setPassword(password);
		return user;
	}

}
